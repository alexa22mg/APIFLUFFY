package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Model.Especie;

import java.util.List;

public interface CompraServices {
    public List<Compra> ConsultarCompra();
    public Compra CrearCompra(Compra compra);
    public Compra ModificarCompra (Compra compra);
    public Compra BuscarCompra(int id);
    public void EliminarCompra(int id);
}
