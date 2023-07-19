package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Cliente;
import com.backendFlufy.demo.Model.Mascota;
import com.backendFlufy.demo.Services.MascotaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Peludos")
public class MascotasRepository {
    @Autowired
    private MascotaServices mascotaServices;

    @GetMapping
    @RequestMapping(value = "ConsultarMascota", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarMascota(){
        List<Mascota> mascotaList =this.mascotaServices.ConsultarMascota();
        return ResponseEntity.ok(mascotaList);
    }
    @PutMapping
    @RequestMapping(value = "CrearMascota", method = RequestMethod.POST)
    public ResponseEntity<?> CrearMascota(@RequestBody Mascota mascota){
        Mascota crearMascota=this.mascotaServices.CrearMascota(mascota);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearMascota);
    }
    @PutMapping
    @RequestMapping(value = "ModificarMascota", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarMascota(@RequestBody Mascota mascota){
        Mascota modificarMascota = this.mascotaServices.ModificarMascota(mascota);
        return ResponseEntity.status(HttpStatus.CREATED).body(modificarMascota);
    }
    @GetMapping
    @RequestMapping(value = "BuscarMascota/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarMascota(@PathVariable int id) {
        Mascota mascota =this.mascotaServices.BuscarMascota(id);
        return  ResponseEntity.ok(mascota);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarMascota/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarMascota(@PathVariable int id){
        this.mascotaServices.EliminarMascota(id);
        return ResponseEntity.ok().build();
    }


}
