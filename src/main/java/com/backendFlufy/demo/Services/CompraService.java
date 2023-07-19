package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService implements CompraServices{
    @Autowired
    private CompraRepository compraRepository;
    @Autowired
    public List<Compra> ConsultarCompra(){
        return (List<Compra>) this.compraRepository.findAll();
    }
    @Override
    public Compra CrearCompra(Compra compra){
        return this.compraRepository.save(compra);
    }
    @Override
    public Compra ModificarCompra(Compra compra) {
        return this.compraRepository.save(compra);
    }
    @Override
    public Compra BuscarCompra(int id){
        return this.compraRepository.findById(id).get();
    }
    @Override
    public void EliminarCompra(int id){
        this.compraRepository.deleteById(id);
    }

}
