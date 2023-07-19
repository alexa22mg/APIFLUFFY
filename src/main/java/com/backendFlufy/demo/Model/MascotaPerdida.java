package com.backendFlufy.demo.Model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "mascotas_perdidas")
public class MascotaPerdida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @Column(name = "fecha_perdido")
    private Date fechaPerdido;

    @Column(name = "lugar_perdido")
    private String lugarPerdido;

    private String hora;
    private String recompensa;
    private String descripcion;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "mascota_id", referencedColumnName = "id"),
            @JoinColumn(name = "mascota_especie_id_especie", referencedColumnName = "especie_id_especie")
    })
 private Mascota mascota;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPerdido() {
        return fechaPerdido;
    }

    public void setFechaPerdido(Date fechaPerdido) {
        this.fechaPerdido = fechaPerdido;
    }

    public String getLugarPerdido() {
        return lugarPerdido;
    }

    public void setLugarPerdido(String lugarPerdido) {
        this.lugarPerdido = lugarPerdido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
