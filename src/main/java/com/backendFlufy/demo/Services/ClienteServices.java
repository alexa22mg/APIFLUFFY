package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Cliente;
import com.backendFlufy.demo.Model.CompraProducto;

import java.util.List;

public interface ClienteServices {
    public List<Cliente> ConsultarCliente();
    public Cliente CrearCliente(Cliente cliente);
    public Cliente ModificarCliente (Cliente cliente);
    public Cliente BuscarCliente(int id);
    public void EliminarCliente(int id);
}
