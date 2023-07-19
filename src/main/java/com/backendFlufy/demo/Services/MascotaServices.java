package com.backendFlufy.demo.Services;


import com.backendFlufy.demo.Model.Mascota;

import java.util.List;

public interface MascotaServices {
    public List<Mascota> ConsultarMascota();
    public Mascota CrearMascota(Mascota mascota);
    public Mascota ModificarMascota (Mascota mascota);
    public Mascota BuscarMascota(int id);
    public void EliminarMascota(int id);
}
