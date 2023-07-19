package com.backendFlufy.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(name = "id_clientes")
    private Integer idCliente;

    @ManyToOne
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id", nullable = false)
    private Usuario usuario;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
