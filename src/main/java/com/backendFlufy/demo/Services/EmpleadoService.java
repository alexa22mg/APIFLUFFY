package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Model.Empleado;
import com.backendFlufy.demo.Repository.CompraRepository;
import com.backendFlufy.demo.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements EmpleadoServices{
    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Autowired
    public List<Empleado> ConsultarEmpleado(){
        return (List<Empleado>) this.empleadoRepository.findAll();
    }
    @Override
    public Empleado CrearEmpleado(Empleado empleado){
        return this.empleadoRepository.save(empleado);
    }
    @Override
    public Empleado ModificarEmpleado(Empleado empleado) {
        return this.empleadoRepository.save(empleado);
    }
    @Override
    public Empleado BuscarEmpleado(int id){
        return this.empleadoRepository.findById(id).get();
    }
    @Override
    public void EliminarEmpleado(int id){
        this.empleadoRepository.deleteById(id);
    }

}
