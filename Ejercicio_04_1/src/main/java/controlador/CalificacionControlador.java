/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Estudiante;
import modelo.Calificacion;
import modelo.Asignatura;
import servicio.EstudianteServicio;
import servicio.AsignaturaServicio;
import servicio.CalificacionServicio;

/**
 *
 * @author Sebas
 */
public class CalificacionControlador {
    
    private final CalificacionServicio calificacionServicio=new CalificacionServicio();
    private final EstudianteServicio estudianteServicio=new EstudianteServicio();
    private final AsignaturaServicio asignaturaServicio= new AsignaturaServicio();
    
    public Calificacion crear(String [] args){
        
        Estudiante estudiante= this.estudianteServicio.bucarPorCodigo(Integer.valueOf(args[2]));
        Asignatura asignatura= this.asignaturaServicio.bucarPorCodigo(Integer.valueOf(args[3]));// asignatura primero 
        
        Calificacion calificacion= new Calificacion(Integer.valueOf(args[0]),Integer.valueOf(args[1]),Integer.valueOf(args[2]),asignatura,estudiante);
        this.calificacionServicio.crear(calificacion);
        return calificacion;
    }
    
    public Calificacion buscarCalificacion(String arg){
        return this.calificacionServicio.buscarPorCodigo(Integer.valueOf(arg));
    }

    public Calificacion eliminarCalificacion(String arg){
        return this.calificacionServicio.eliminar(Integer.valueOf(arg));
    }
    
    public List<Calificacion> listar(){
        return this.calificacionServicio.listar();
    }
    
    public Calificacion modificar(String [] args){
        Asignatura asignatura= this.asignaturaServicio.bucarPorCodigo(Integer.valueOf(args[4]));
        Estudiante estudiante=this.estudianteServicio.bucarPorCodigo(Integer.valueOf(args[3]));
        
        Calificacion calificacionNuevo=new Calificacion(Integer.valueOf(args[0]),Integer.valueOf(args[1]),Integer.valueOf(args[2]),asignatura,estudiante);
        this.calificacionServicio.modificar(Integer.valueOf(args[0]), calificacionNuevo);
        return calificacionNuevo;
        
    }
    
}
