package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Departamento;
import com.backendFlufy.demo.Model.Empleado;
import com.backendFlufy.demo.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService implements DepartamentoServices {
    @Autowired
    private DepartamentoRepository departamentoRepository;
    @Autowired
    public List<Departamento> ConsultarDepartamento(){
        return (List<Departamento>) this.departamentoRepository.findAll();
    }
    @Override
    public Departamento CrearDepartamento(Departamento departamento){
        return this.departamentoRepository.save(departamento);
    }
    @Override
    public Departamento ModificarDepartamento(Departamento departamento) {
        return this.departamentoRepository.save(departamento);
    }
    @Override
    public Departamento BuscarDepartamento(int id){
        return this.departamentoRepository.findById(id).get();
    }
    @Override
    public void EliminarDepartamento(int id){
        this.departamentoRepository.deleteById(id);
    }
}
