/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Estudiante;
import java.util.List;
import servicio.EstudianteServicio;

/**
 *
 * @author Sebas
 */
public class EstudianteControlador {
    
    private final EstudianteServicio estudianteServicio=new EstudianteServicio();
    
    public Estudiante crear(String [] args){
        var estudiante=new Estudiante(args[0],args[1],Integer.valueOf(args[2]),args[3],Integer.valueOf(args[4]));
        
        this.estudianteServicio.crear(estudiante);
        return estudiante;
    }
    
    public List<Estudiante> listar(){
        return this.estudianteServicio.listar();
    }
    
}

