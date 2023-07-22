package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Cliente;
import com.backendFlufy.demo.Services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClienteController {
    @Autowired
    private ClienteServices clienteServices;

    @GetMapping
    @RequestMapping(value = "ConsultarCliente", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCliente(){
        List<Cliente> clienteList =this.clienteServices.ConsultarCliente();
        return ResponseEntity.ok(clienteList);
    }
    @PutMapping
    @RequestMapping(value = "CrearCliente", method = RequestMethod.POST)
    public ResponseEntity<?> CrearCliente(@RequestBody Cliente cliente){
        Cliente crearCliente=this.clienteServices.CrearCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearCliente);
    }
    @PutMapping
    @RequestMapping(value = "ModificarCliente", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCliente(@RequestBody Cliente cliente){
        Cliente modificarCliente = this.clienteServices.ModificarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(modificarCliente);
    }
    @GetMapping
    @RequestMapping(value = "BuscarCliente/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarCliente(@PathVariable int id) {
        Cliente cliente =this.clienteServices.BuscarCliente(id);
        return  ResponseEntity.ok(cliente);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarCliente/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCliente(@PathVariable int id){
        this.clienteServices.EliminarCliente(id);
        return ResponseEntity.ok().build();
    }
}
