package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Especie;
import com.backendFlufy.demo.Repository.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EspecieService implements EspecieServices{
    @Autowired
    private EspecieRepository especieRepository;
    @Autowired
    public List<Especie>ConsultarEspecies(){
        return (List<Especie>) this.especieRepository.findAll();
    }
    @Override
    public Especie CrearEspecie(Especie especie){
        return this.especieRepository.save(especie);
    }
    @Override
    public Especie ModificarEspecie(Especie especie) {
        return this.especieRepository.save(especie);
    }
    @Override
    public Especie BuscarEspecie(int id){
        return this.especieRepository.findById(id).get();
    }

    @Override
    public void EliminarEspecie(int id){
        this.especieRepository.deleteById(id);
    }


}
