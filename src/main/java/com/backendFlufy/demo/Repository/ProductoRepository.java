package com.backendFlufy.demo.Repository;

import com.backendFlufy.demo.Model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository <Producto,Integer>{

}
