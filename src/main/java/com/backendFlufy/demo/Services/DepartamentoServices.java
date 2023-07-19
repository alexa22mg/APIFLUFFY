package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Departamento;
import com.backendFlufy.demo.Model.Empleado;

import java.util.List;

public interface DepartamentoServices {
    public List<Departamento> ConsultarDepartamento();
    public Departamento CrearDepartamento(Departamento departamento);
    public Departamento ModificarDepartamento (Departamento departamento);
    public Departamento BuscarDepartamento(int id);
    public void EliminarDepartamento(int id);

}
