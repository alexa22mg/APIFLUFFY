package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Model.Empleado;

import java.util.List;

public interface EmpleadoServices {
    public List<Empleado> ConsultarEmpleado();
    public Empleado CrearEmpleado(Empleado empleado);
    public Empleado ModificarEmpleado (Empleado empleado);
    public Empleado BuscarEmpleado(int id);
    public void EliminarEmpleado(int id);

}
