package com.backendFlufy.demo.Controller;
import com.backendFlufy.demo.Model.Especie;
import com.backendFlufy.demo.Services.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specie")
public class EspecieController {
    @Autowired
    private EspecieService especieService;
    @GetMapping
    @RequestMapping(value = "ConsultarEspecies", method = RequestMethod.GET)
    public ResponseEntity<?>ConsultarEspecie(){
        List<Especie> especieLista = this.especieService.ConsultarEspecies();
        return ResponseEntity.ok(especieLista);
    }
    @PutMapping
    @RequestMapping(value = "CrearEspecie", method = RequestMethod.POST)
    public ResponseEntity<?> CrearEspecie(@RequestBody Especie especie){
        Especie crearespecie=this.especieService.CrearEspecie(especie);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearespecie);
    }
    @PutMapping
    @RequestMapping(value = "ModificarEspecie", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEspecie(@RequestBody Especie especie){
        Especie especieModificado =this.especieService.ModificarEspecie(especie);
        return ResponseEntity.status(HttpStatus.CREATED).body(especieModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarEspecie/{id}", method = RequestMethod.GET)
    /*La anotación @PatVariable nos ayuda a insertar una ruta*/
    public ResponseEntity<?> BuscarCategoria(@PathVariable int id) {
        Especie especie =this.especieService.BuscarEspecie(id);
        return  ResponseEntity.ok(especie);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarEspecie/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEspecie(@PathVariable int id){
        this.especieService.EliminarEspecie(id);
        return ResponseEntity.ok().build();
    }
}
