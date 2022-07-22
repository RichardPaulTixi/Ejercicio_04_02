/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Asignatura;
import servicio.AsignaturaServicio;

/**
 *
 * @author Sebas
 */
public class AsignaturaControlador {
    private final AsignaturaServicio asignaturaServicio=new AsignaturaServicio();
    
    public Asignatura crear(String [] args){
            var asignatura= new Asignatura(args[0],Integer.valueOf(args[1]),
            Integer.valueOf(args[2]),Integer.valueOf(args[3]),Integer.valueOf(args[4]));
        this.asignaturaServicio.crear(asignatura);
        return asignatura;
    }
    
    public List<Asignatura> listar(){
        return this.asignaturaServicio.listar();
        
    }
    
}
