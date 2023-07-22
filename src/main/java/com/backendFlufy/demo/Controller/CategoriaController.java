package com.backendFlufy.demo.Controller;
import com.backendFlufy.demo.Model.Categoria;
import com.backendFlufy.demo.Services.CategoriasService;
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
    @RequestMapping(value = "CrearCategoria", method = RequestMethod.POST)
    public ResponseEntity<?> CrearCategoria(@RequestBody Categoria categoria){
        Categoria crearCategoria=this.categoriasService.CrearCategoria(categoria);
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
    public ResponseEntity<?> BuscarCategoria(@PathVariable int id) {
        Categoria categoria =this.categoriasService.BuscarCategoria(id);
        return  ResponseEntity.ok(categoria);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarCategoria/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCategoria(@PathVariable int id){
        this.categoriasService.EliminarCategoria(id);
        return ResponseEntity.ok().build();
    }
}

