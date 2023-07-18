package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Categoria;
import com.backendFlufy.demo.Model.Producto;
import com.backendFlufy.demo.Services.CategoriasService;
import com.backendFlufy.demo.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Category")
public class CategoriaController {
    @Autowired
    private CategoriasService categoriasService;
    @GetMapping
    @RequestMapping(value = "ConsultarCategoria", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCategoria(){
        List<Categoria> categoriaList =this.categoriasService.ConsultarCategoria();
        return ResponseEntity.ok(categoriaList);
    }
    @PutMapping
    /*http:localhost:8080/Flufy/CrearUsuario para*/
    @RequestMapping(value = "CrearCategoria", method = RequestMethod.POST)
    public ResponseEntity<?> CrearCategoria(@RequestBody Categoria categoriao){
        Categoria crearCategoria=this.categoriasService.CrearCategoria(categoriao);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearCategoria);
    }
    @PutMapping
    @RequestMapping(value = "ModificarCategoria", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCategoria(@RequestBody Categoria categoria){
        Categoria categoriaModificado =this.categoriasService.ModificarCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarCategoria/{id}", method = RequestMethod.GET)
    /*La anotación @PatVariable nos ayuda a insertar una ruta*/
    public ResponseEntity<?> BuscarCategoria(@PathVariable int id) {
        Categoria categoria =this.categoriasService.BuscarCategoria(id);
        return  ResponseEntity.ok(categoria);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarProducto/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarProducto(@PathVariable int id){
        this.categoriasService.EliminarCategoria(id);
        return ResponseEntity.ok().build();
    }
}

