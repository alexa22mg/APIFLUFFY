package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Model.CompraProducto;

import java.util.List;

public interface CompraProductoServices {
    public List<CompraProducto> ConsultarCompraProducto();
    public CompraProducto CrearCompraProducto(CompraProducto compraProducto);
    public CompraProducto ModificarCompraProducto (CompraProducto compraProducto);
    public CompraProducto BuscarCompraProducto(int id);
    public void EliminarCompraProducto(int id);
}
