package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Mascota;
import org.springframework.data.repository.CrudRepository;

public interface MascotaRepository extends CrudRepository<Mascota,Integer> {
}
