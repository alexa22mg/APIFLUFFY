package com.backendFlufy.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @Column(name = "id_compras")
    private Integer idCompra;

    @Column(name = "medio_pago", nullable = false)
    private String medioPago;

    @Column(name = "comentario", nullable = false, length = 300)
    private String comentario;

    @Column(name = "estado", nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clientes_id_clientes", referencedColumnName = "id_clientes", nullable = false),
            @JoinColumn(name = "clientes_usuarios_id", referencedColumnName = "usuarios_id", nullable = false)
    })
    private Cliente cliente;

   // seter y getter

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
