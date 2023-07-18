package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Categoria;

import java.util.List;

public interface CategoriaServices {

    public List<Categoria> ConsultarCategoria();

    public Categoria CrearCategoria(Categoria categoria);

    public Categoria ModificarCategoria(Categoria categoria);

    public Categoria BuscarCategoria(int id);

    public void EliminarCategoria(int id);
}
