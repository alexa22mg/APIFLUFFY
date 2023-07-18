package com.backendFlufy.demo.Services;

import com.backendFlufy.demo.Model.Categoria;
import com.backendFlufy.demo.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriasService implements CategoriaServices{
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Override
    public List<Categoria> ConsultarCategoria(){
        return (List<Categoria>) this.categoriaRepository.findAll();
    }

    @Override
    public Categoria CrearCategoria(Categoria categoria){
        return this.categoriaRepository.save(categoria);
    }
    @Override
    public Categoria ModificarCategoria(Categoria categoria) {
        return this.categoriaRepository.save(categoria);
    }
    @Override
    public Categoria  BuscarCategoria(int id)
    {
        return this.categoriaRepository.findById(id).get();
    }

    @Override
    public void EliminarCategoria(int id){
        this.categoriaRepository.deleteById(id);
    }
}
