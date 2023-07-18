package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Especie;
import com.backendFlufy.demo.Model.Producto;

import java.util.List;

public interface EspecieServices {
    public List<Especie> ConsultarEspecies();
    public Especie CrearEspecie(Especie especie);
    public Especie ModificarEspecie (Especie especie);
    public Especie BuscarEspecie(int id);
    public void EliminarEspecie(int id);

}
