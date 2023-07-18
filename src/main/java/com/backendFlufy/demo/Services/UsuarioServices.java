package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Usuario;

import java.util.List;

public interface UsuarioServices {

    public List<Usuario> ConsultarUsuario();
    public Usuario CrearUsuario(Usuario usuario);
    public Usuario ModificarUsuario(Usuario usuario);
    public Usuario BuscarUsuario(int id);
    public void EliminarUsuario(int id);

}


