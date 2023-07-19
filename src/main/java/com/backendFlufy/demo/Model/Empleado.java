package com.backendFlufy.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @Column(name = "id_Empleados")
    private Integer idEmpleados;
    private double sueldo;
    @Column(name = "contacto_emergencia")
    private String contactoEmergencia;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "departamento_id_departamento")
    private Departamento departamento;
    // setter y Getter


    public Integer getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(Integer idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
