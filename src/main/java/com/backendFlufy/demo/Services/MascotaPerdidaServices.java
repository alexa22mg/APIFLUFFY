package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Especie;
import com.backendFlufy.demo.Model.MascotaPerdida;

import java.util.List;

public interface MascotaPerdidaServices {
    public List<MascotaPerdida> ConsultarMascotaPerdida();
    public MascotaPerdida CrearMascotaPerdida(MascotaPerdida mascotaPerdida);
    public MascotaPerdida ModificarMascotaPerdida ( MascotaPerdida mascotaPerdida);
    public MascotaPerdida BuscarMascotaPerdida(int id);
    public void EliminarMascotaPerdida(int id);
}
