package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Services.CompraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class CompraController {

    @Autowired
    private CompraServices compraServices;

    @GetMapping
    @RequestMapping(value = "ConsultarCompra", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCompra(){
        List<Compra> compraList =this.compraServices.ConsultarCompra();
        return ResponseEntity.ok(compraList);
    }
    @PutMapping
    /*http:localhost:8080/Flufy/CrearUsuario para*/
    @RequestMapping(value = "CrearCompra", method = RequestMethod.POST)
    public ResponseEntity<?> CrearCompra(@RequestBody Compra compra){
        Compra crearCompra=this.compraServices.CrearCompra(compra);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearCompra);
    }
    @PutMapping
    @RequestMapping(value = "ModificarCompra", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCompra(@RequestBody Compra compra){
        Compra modificarCompra = this.compraServices.ModificarCompra(compra);
        return ResponseEntity.status(HttpStatus.CREATED).body(modificarCompra);
    }
    @GetMapping
    @RequestMapping(value = "BuscarCompra/{id}", method = RequestMethod.GET)
    /*La anotación @PatVariable nos ayuda a insertar una ruta*/
    public ResponseEntity<?> BuscarCompra(@PathVariable int id) {
        Compra compra =this.compraServices.BuscarCompra(id);
        return  ResponseEntity.ok(compra);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarCompra/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCompra(@PathVariable int id){
        this.compraServices.EliminarCompra(id);
        return ResponseEntity.ok().build();
    }


}
