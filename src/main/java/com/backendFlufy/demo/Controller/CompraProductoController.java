package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Model.CompraProducto;
import com.backendFlufy.demo.Services.CompraProductoServices;
import com.backendFlufy.demo.Services.CompraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compraproduct")
public class CompraProductoController {
    @Autowired
    private CompraProductoServices compraProductoServices;
    @GetMapping
    @RequestMapping(value = "ConsultarCompraProducto", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCompraProducto(){
        List<CompraProducto> compraProdutList =this.compraProductoServices.ConsultarCompraProducto();
        return ResponseEntity.ok(compraProdutList);
    }
    @PutMapping
    /*http:localhost:8080/Flufy/CrearUsuario para*/
    @RequestMapping(value = "CrearCompraProducto", method = RequestMethod.POST)
    public ResponseEntity<?> CrearCompraProducto(@RequestBody CompraProducto compraProducto){
        CompraProducto crearCompraproducto=this.compraProductoServices.CrearCompraProducto(compraProducto);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearCompraproducto);
    }
    @PutMapping
    @RequestMapping(value = "ModificarCompraProducto", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCompraProducto(@RequestBody CompraProducto compraProducto){
        CompraProducto modificarCompraProducto= this.compraProductoServices.ModificarCompraProducto(compraProducto);
        return ResponseEntity.status(HttpStatus.CREATED).body(modificarCompraProducto);
    }
    @GetMapping
    @RequestMapping(value = "BuscarCompraProducto/{id}", method = RequestMethod.GET)
    /*La anotación @PatVariable nos ayuda a insertar una ruta*/
    public ResponseEntity<?> BuscarCompraProducto(@PathVariable int id) {
        CompraProducto compraProduc =this.compraProductoServices.BuscarCompraProducto(id);
        return  ResponseEntity.ok(compraProduc);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarCompraProducto/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCompraProducto(@PathVariable int id){
        this.compraProductoServices.EliminarCompraProducto(id);
        return ResponseEntity.ok().build();
    }
}
