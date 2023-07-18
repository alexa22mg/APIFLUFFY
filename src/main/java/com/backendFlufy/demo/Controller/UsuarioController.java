package com.backendFlufy.demo.Controller;

import com.backendFlufy.demo.Model.Usuario;
import com.backendFlufy.demo.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    @RequestMapping(value = "ConsultarUsuario", method = RequestMethod.GET)
    public ResponseEntity<?>ConcultarUsuario(){
        List<Usuario> usuarioList=this.usuarioService.ConsultarUsuario();
        return ResponseEntity.ok(usuarioList);
    }
    @PutMapping
    /*Usamos este mapeo http:localhost:8080/Flufy/CrearUsuario*/
    @RequestMapping(value = "CrearUsuario", method = RequestMethod.POST)
    public ResponseEntity<?> CrearUsuario(@RequestBody Usuario usuario){
        Usuario crearusuario=this.usuarioService.CrearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearusuario);
    }
    @PutMapping
    @RequestMapping(value = "ModificarUsuario", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioModificada=this.usuarioService.ModificarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioModificada);
    }
    @GetMapping
    @RequestMapping(value = "BuscarUsuario/{id}", method = RequestMethod.GET)
    /*La anotación @PatVariable nos ayuda a insertar una ruta*/
    public ResponseEntity<?> BuscarUsuario(@PathVariable int id) {
        Usuario usuario=this.usuarioService.BuscarUsuario(id);
        return  ResponseEntity.ok(usuario);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarUsuario/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarUsuario(@PathVariable int id){
        this.usuarioService.EliminarUsuario(id);
        return ResponseEntity.ok().build();
    }
}
