package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Usuario;

import java.util.List;

public interface UsuarioServices {


    //Vamos a crear los métodos para realizar las peticiones en mi CRUD

    //La colecction List nos ayuda a crear una lista (PETICIÓN GET)
    public List<Usuario> ConsultarUsuario();

    //Vamos a realizar el método para realizar la PETICIÓN POST
    public Usuario CrearUsuario(Usuario usuario);

    //Vamos a realizar el método para realizar la PETICIÓN PUT
    public Usuario ModificarUsuario(Usuario usuario);

    //Vamos a realizar el método para buscar las personas
    public Usuario BuscarUsuario(int id);

    //Vamos a realizar el método para realizar la PETICIÓN DELETE
    //Le colocamos el método void para que no nos devuelva un valor
    public void EliminarUsuario(int id);

}


