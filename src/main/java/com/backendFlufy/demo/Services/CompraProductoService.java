package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Compra;
import com.backendFlufy.demo.Model.CompraProducto;
import com.backendFlufy.demo.Repository.CompraProductoRepository;
import com.backendFlufy.demo.Repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraProductoService implements CompraProductoServices {
    @Autowired
    private CompraProductoRepository compraProductoRepository;
    @Autowired
    public List<CompraProducto> ConsultarCompraProducto(){
        return (List<CompraProducto>) this.compraProductoRepository.findAll();
    }
    @Override
    public CompraProducto CrearCompraProducto(CompraProducto compraProducto){
        return this.compraProductoRepository.save(compraProducto);
    }
    @Override
    public CompraProducto ModificarCompraProducto(CompraProducto compraProducto) {
        return this.compraProductoRepository.save(compraProducto);
    }
    @Override
    public CompraProducto BuscarCompraProducto(int id){
        return this.compraProductoRepository.findById(id).get();
    }

    @Override
    public void EliminarCompraProducto(int id){
        this.compraProductoRepository.deleteById(id);
    }


}
