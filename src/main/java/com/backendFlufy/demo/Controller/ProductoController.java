package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Producto;
import com.backendFlufy.demo.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produc")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping
    @RequestMapping(value = "ConsultarProducto", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProducto(){
        List<Producto> productoList =this.productoService.ConsultarProducto();
        return ResponseEntity.ok(productoList);
    }
    @PutMapping
    /*Usamos este mapeo http:localhost:8080/Flufy/CrearUsuario para insertar datos*/
    @RequestMapping(value = "CrearProducto", method = RequestMethod.POST)
    public ResponseEntity<?> CrearProducto(@RequestBody Producto producto){
        Producto crearProducto =this.productoService.CrearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearProducto);
    }
    @PutMapping
    @RequestMapping(value = "ModificarProducto", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarProducto(@RequestBody Producto producto){
        Producto productoModificado =this.productoService.ModificarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarProducto/{id}", method = RequestMethod.GET)
    /*La anotación @PatVariable nos ayuda a insertar una ruta*/
    public ResponseEntity<?> BuscarProducto(@PathVariable int id) {
        Producto producto =this.productoService.BuscarProducto(id);
        return  ResponseEntity.ok(producto);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarProducto/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarProducto(@PathVariable int id){
        this.productoService.EliminarProducto(id);
        return ResponseEntity.ok().build();
    }
}
