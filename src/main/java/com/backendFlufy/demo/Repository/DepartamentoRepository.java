package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoRepository extends CrudRepository<Departamento,Integer> {
}
