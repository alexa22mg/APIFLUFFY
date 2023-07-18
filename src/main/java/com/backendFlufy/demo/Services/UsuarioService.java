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

    @Override
    public List<Usuario> ConsultarUsuario() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    /*Este código nos ayuda a traer todos los datos que estén insertados en la BD*/
  /*
    public List<Usuario> ConsultarUsuario(){
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    /*Este código nos ayuda a insertar los datos que queremos guardar en la BD*/
    @Override
    public Usuario CrearUsuario(Usuario usuario) {
      usuario.setCorreo(usuario.getCorreo());
      return this.usuarioRepository.save(usuario);
    }
    /*Este código nos ayuda a actualizar los datos que queremos editar en la BD*/
    @Override
    public Usuario ModificarUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    /*Este código nos ayuda a buscar los datos del usuario mediante el ID de la BD*/
    @Override
    public Usuario BuscarUsuario(int id)
    {
        return this.usuarioRepository.findById(id).get();
    }

    /*Este código nos ayuda a eliminar los datos del usuario mediante su ID de la BD
     *
     * Insertamos el método como void, ya que cómo estamos eliminando datos, no nos va a devolver una información*/

    @Override
    public void EliminarUsuario(int id){
        this.usuarioRepository.deleteById(id);
    }
}
