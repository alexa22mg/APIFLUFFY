package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Especie;
import org.springframework.data.repository.CrudRepository;

public interface EspecieRepository extends CrudRepository <Especie, Integer> {

}
