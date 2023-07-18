package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Usuario;
import com.backendFlufy.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements UsuarioServices {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> ConsultarUsuario(){
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Usuario CrearUsuario(Usuario usuario) {
      usuario.setCorreo(usuario.getCorreo());
      return this.usuarioRepository.save(usuario);
    }
    @Override
    public Usuario ModificarUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public Usuario BuscarUsuario(int id)
    {
        return this.usuarioRepository.findById(id).get();
    }
    @Override
    public void EliminarUsuario(int id){
        this.usuarioRepository.deleteById(id);
    }
}
