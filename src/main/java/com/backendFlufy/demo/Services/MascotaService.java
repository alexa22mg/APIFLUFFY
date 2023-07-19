package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Mascota;
import com.backendFlufy.demo.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements MascotaServices {
    @Autowired
    private MascotaRepository mascotaRepository;
    @Autowired
    public List<Mascota> ConsultarMascota(){
        return (List<Mascota>) this.mascotaRepository.findAll();
    }
    @Override
    public Mascota CrearMascota(Mascota mascota){
        return this.mascotaRepository.save(mascota);
    }
    @Override
    public Mascota ModificarMascota(Mascota mascota) {
        return this.mascotaRepository.save(mascota);
    }
    @Override
    public Mascota BuscarMascota(int id){
        return this.mascotaRepository.findById(id).get();
    }

    @Override
    public void EliminarMascota(int id){
        this.mascotaRepository.deleteById(id);
    }

}
