package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
