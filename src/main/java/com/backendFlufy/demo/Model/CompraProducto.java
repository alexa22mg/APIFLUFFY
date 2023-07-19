package com.backendFlufy.demo.Model;

import jakarta.persistence.*;
@Entity
@Table(name = "comnpras_productos")
public class CompraProducto {
    @Id
    @Column(name ="id_comnpras_productos")
    private Integer idCompraProducto;
    private Integer cantidad;
    private  Double total;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "compras_id_compras")
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "productos_id_producto")
    private Producto producto;

    public Integer getIdCompraProducto() {
        return idCompraProducto;
    }

    public void setIdCompraProducto(Integer idCompraProducto) {
        this.idCompraProducto = idCompraProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
