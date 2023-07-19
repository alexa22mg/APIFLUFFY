package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Especie;
import com.backendFlufy.demo.Model.MascotaPerdida;
import com.backendFlufy.demo.Repository.MascotaPerdidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaPerdidaService implements MascotaPerdidaServices {
    @Autowired
    private MascotaPerdidaRepository mascotaPerdidaRepository;

    @Autowired
    public List<MascotaPerdida> ConsultarMascotaPerdida(){
        return (List<MascotaPerdida>) this.mascotaPerdidaRepository.findAll();
    }
    @Override
    public MascotaPerdida CrearMascotaPerdida(MascotaPerdida mascotaPerdida){
        return this.mascotaPerdidaRepository.save(mascotaPerdida);
    }
    @Override
    public MascotaPerdida ModificarMascotaPerdida(MascotaPerdida mascotaPerdida) {
        return this.mascotaPerdidaRepository.save(mascotaPerdida);
    }
    @Override
    public MascotaPerdida BuscarMascotaPerdida(int id){
        return this.mascotaPerdidaRepository.findById(id).get();
    }

    @Override
    public void EliminarMascotaPerdida(int id){
        this.mascotaPerdidaRepository.findById(id);
    }



}
