/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebas
 */
public class EstudianteServicio implements IEstudianteServicio{
    private static List<Estudiante> estudianteList= new ArrayList<>();

    @Override
    public Estudiante crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
        return estudiante;
        
    }
    @Override
    public List<Estudiante> listar() {
        return this.estudianteList;
    }
    
    @Override
    public Estudiante bucarPorCodigo(int codigoEstudiante) {
        Estudiante estudiante=null;
        for(var c:this.estudianteList){
            if(codigoEstudiante==c.getCodigo()){
                estudiante=c;
                break;
            }
        }
        return estudiante;
    }


    
}

