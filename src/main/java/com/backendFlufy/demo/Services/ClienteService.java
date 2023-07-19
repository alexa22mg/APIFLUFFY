package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Cliente;
import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService  implements ClienteServices{
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    public List<Cliente> ConsultarCliente(){
        return (List<Cliente>) this.clienteRepository.findAll();
    }
    @Override
    public Cliente CrearCliente(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }
    @Override
    public Cliente ModificarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
    @Override
    public Cliente BuscarCliente(int id){
        return this.clienteRepository.findById(id).get();
    }

    @Override
    public void EliminarCliente(int id){
        this.clienteRepository.deleteById(id);
    }

}
