package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Cliente;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Integer> {
}
