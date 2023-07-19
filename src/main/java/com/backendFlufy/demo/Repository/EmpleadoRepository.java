package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
}
