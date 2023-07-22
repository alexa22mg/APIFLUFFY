package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Categoria;
import com.backendFlufy.demo.Model.MascotaPerdida;
import com.backendFlufy.demo.Services.MascotaPerdidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perdidos")
public class MascotaPerdidaController {
    @Autowired
    private MascotaPerdidaService mascotaPerdidaService;
    @GetMapping
    @RequestMapping(value = "ConsultarMascotaPerdida", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarMascotaPerdida(){
        List<MascotaPerdida> categoriaList =this.mascotaPerdidaService.ConsultarMascotaPerdida();
        return ResponseEntity.ok(categoriaList);
    }
    @PutMapping
    @RequestMapping(value = "CrearMascotaPerdida", method = RequestMethod.POST)
    public ResponseEntity<?> CrearMascotaPerdida(@RequestBody MascotaPerdida mascotaPerdida){
        MascotaPerdida crearMascotaPerdida=this.mascotaPerdidaService.CrearMascotaPerdida(mascotaPerdida);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearMascotaPerdida);
    }
    @PutMapping
    @RequestMapping(value = "ModificarMascotaPerdida", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarMascotaPerdida(@RequestBody MascotaPerdida mascotaPerdida){
        MascotaPerdida mascotaPerdidaModificado =this.mascotaPerdidaService.ModificarMascotaPerdida(mascotaPerdida);
        return ResponseEntity.status(HttpStatus.CREATED).body(mascotaPerdidaModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarMascotaPerdida/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarMascotaPerdida(@PathVariable int id) {
        MascotaPerdida mascotaPerdida =this.mascotaPerdidaService.BuscarMascotaPerdida(id);
        return  ResponseEntity.ok(mascotaPerdida);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarMascotaPerdida/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarMascotaPerdida(@PathVariable int id){
        this.mascotaPerdidaService.EliminarMascotaPerdida(id);
        return ResponseEntity.ok().build();
    }




}
