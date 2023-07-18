package com.backendFlufy.demo.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "especie")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especie")
    private Integer idEspecie;
    private String especie;

    public String getEspecie() {
        return especie;
    }
    @OneToMany(mappedBy = "especie")
    private List<Producto>productos;

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
