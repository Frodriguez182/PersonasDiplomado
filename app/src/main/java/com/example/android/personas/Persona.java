package com.example.android.personas;

/**
 * Created by android on 30/09/2017.
 */

public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona(String cedula, String nombre, String apellido){


    }

    public void guardar()
}