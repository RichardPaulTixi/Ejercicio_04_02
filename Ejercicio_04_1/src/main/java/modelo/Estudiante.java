/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Estudiante implements Serializable{
    private String nombre;
    private String carrera;
    private int edad;
    private String pais;
    private int codigo;

    public Estudiante(String nombre, String carrera, int edad, String pais, int codigo) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.pais = pais;
        this.codigo = codigo;
    }
    
    public Estudiante(String nombre, String carrera, Integer edad, String pais, Integer codigo) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.pais = pais;
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carrera=" + carrera + 
               ", edad=" + edad + ", pais=" + pais + ", codigo=" + codigo + '}';
    }  
}

