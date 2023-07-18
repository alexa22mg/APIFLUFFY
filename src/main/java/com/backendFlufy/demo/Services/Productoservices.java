package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Producto;

import java.util.List;


public interface Productoservices {
    public List<Producto> ConsultarProducto();
    public Producto CrearProducto(Producto producto);
    public Producto ModificarProducto(Producto producto);
    public Producto BuscarProducto(int id);
    public void EliminarProducto(int id);

}


