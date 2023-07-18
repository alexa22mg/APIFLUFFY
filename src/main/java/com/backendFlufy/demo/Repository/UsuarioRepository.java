package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
