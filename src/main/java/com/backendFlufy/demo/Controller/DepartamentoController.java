package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.CompraProducto;
import com.backendFlufy.demo.Model.Departamento;
import com.backendFlufy.demo.Services.DepartamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dpto")
public class DepartamentoController {
    @Autowired
    private DepartamentoServices departamentoServices;
    @GetMapping
    @RequestMapping(value = "ConsultarDepartamento", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarDepartamento(){
        List<Departamento> departamentotList =this.departamentoServices.ConsultarDepartamento();
        return ResponseEntity.ok(departamentotList);
    }
    @PutMapping
    /*http:localhost:8080/Flufy/CrearUsuario para*/
    @RequestMapping(value = "CrearDepartamento", method = RequestMethod.POST)
    public ResponseEntity<?> CrearDepartamento(@RequestBody Departamento departamento){
        Departamento crearDepartamento=this.departamentoServices.CrearDepartamento(departamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearDepartamento);
    }
    @PutMapping
    @RequestMapping(value = "ModificarDepartamento", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCompraProducto(@RequestBody Departamento departamento){
        Departamento modificarDepartamento= this.departamentoServices.ModificarDepartamento(departamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(modificarDepartamento);
    }
    @GetMapping
    @RequestMapping(value = "BuscarDepartamento/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarDepartamento(@PathVariable int id) {
        Departamento compraDepartamento =this.departamentoServices.BuscarDepartamento(id);
        return  ResponseEntity.ok(compraDepartamento);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarDepartamento/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarDepartamento(@PathVariable int id){
        this.departamentoServices.EliminarDepartamento(id);
        return ResponseEntity.ok().build();
    }


}
