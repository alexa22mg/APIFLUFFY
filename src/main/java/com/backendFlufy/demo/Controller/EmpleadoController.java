package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Departamento;
import com.backendFlufy.demo.Model.Empleado;
import com.backendFlufy.demo.Services.EmpleadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.PrimitiveIterator;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoServices empleadoServices;

    @GetMapping
    @RequestMapping(value = "ConsultarEmpleado", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEmpleado(){
        List<Empleado> empleadotList =this.empleadoServices.ConsultarEmpleado();
        return ResponseEntity.ok(empleadotList);
    }
    @PutMapping
    /*http:localhost:8080/Flufy/CrearUsuario para*/
    @RequestMapping(value = "CrearEmpleado", method = RequestMethod.POST)
    public ResponseEntity<?> CrearEmpleado(@RequestBody Empleado empleado){
        Empleado crearEmpleado=this.empleadoServices.CrearEmpleado(empleado);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearEmpleado);
    }
    @PutMapping
    @RequestMapping(value = "ModificarEmpleado", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEmpleado(@RequestBody Empleado empleado){
        Empleado modificarEmpleado= this.empleadoServices.ModificarEmpleado(empleado);
        return ResponseEntity.status(HttpStatus.CREATED).body(modificarEmpleado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarEmpleado/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEmpleado(@PathVariable int id) {
        Empleado compraEmpleado =this.empleadoServices.BuscarEmpleado(id);
        return  ResponseEntity.ok(compraEmpleado);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarEmpleado/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEmpleado(@PathVariable int id){
        this.empleadoServices.EliminarEmpleado(id);
        return ResponseEntity.ok().build();
    }


}
