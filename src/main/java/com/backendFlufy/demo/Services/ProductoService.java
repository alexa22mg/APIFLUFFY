package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Producto;
import com.backendFlufy.demo.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements Productoservices {
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> ConsultarProducto(){
        return (List<Producto>) this.productoRepository.findAll();
    }

    @Override
    public Producto CrearProducto(Producto producto){
        return this.productoRepository.save(producto);
    }
    @Override
    public Producto ModificarProducto(Producto producto) {
        return this.productoRepository.save(producto);
    }
    @Override
    public Producto BuscarProducto(int id)
    {
        return this.productoRepository.findById(id).get();
    }

    @Override
    public void EliminarProducto(int id){
        this.productoRepository.deleteById(id);
    }

}
