/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author Sebas
 */
public class AsignaturaServicio implements IAsignaturaServicio{
    
    private static List<Asignatura> asignaturaList=new ArrayList<>();

    @Override
    public Asignatura crear(Asignatura asignatura) {
        
        this.asignaturaList.add(asignatura); 
        return asignatura;
    }

    @Override
    public List<Asignatura> listar() {
        return asignaturaList;
    }

    @Override
    public Asignatura bucarPorCodigo(int codigoAsignatura) {
        Asignatura asignatura=null;
        for(var c:this.asignaturaList){
            if(codigoAsignatura==c.getCodigo()){
                asignatura=c;
                break;
            }
        }
        return asignatura;
    }   

}

