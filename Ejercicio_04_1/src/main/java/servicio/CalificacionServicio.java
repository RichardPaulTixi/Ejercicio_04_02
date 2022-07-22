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
import modelo.Calificacion;

/**
 *
 * @author Sebas
 */
public class CalificacionServicio implements ICalificacionServicio{
    
    private static List<Calificacion> calificacionesList=new ArrayList<>();

    @Override
    public Calificacion crear(Calificacion calificacion) {
        this.calificacionesList.add(calificacion);
        try {
            this.almacenarEnArchivo(calificacion,"C:/Users/HP/Desktop/registros.dat");
            System.out.println("Archivo Guardado");
            
        } catch (Exception e) {
            System.out.println("Error General");
        }
        return calificacion;
    }
    @Override
    public List<Calificacion> listar() {
        return this.calificacionesList;
    }

    @Override
    public Calificacion modificar(int codigoCalificacion, Calificacion calificacionNuevo) {
        
       var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoCalificacion));
       this.listar().get(posicion).setcalificacion(calificacionNuevo.getcalificacion());
       this.listar().get(posicion).setPromedio(calificacionNuevo.getPromedio());
       this.listar().get(posicion).setAsignatura(calificacionNuevo.getAsignatura());
       this.listar().get(posicion).setEstudiante(calificacionNuevo.getEstudiante());
       return calificacionNuevo;
    }

    @Override
    public Calificacion eliminar(int codigoCalificacion) {
        Calificacion calificacion=this.buscarPorCodigo(codigoCalificacion);
        var posicion=this.buscarPosicion(calificacion);
        this.listar().remove(posicion);
        return calificacion;
       
    }

    @Override
    public Calificacion buscarPorCodigo(int codigoCalificacion) {
        Calificacion calificacion=null;
        for(var b:this.calificacionesList){
            if(codigoCalificacion==b.getCodigo()){
                calificacion=b;
                break;
            }
        }
        return calificacion;
    }

    

    @Override
    public int buscarPosicion(Calificacion calificacion) {
        int posicion=-1;
       for(var b:this.calificacionesList){
           posicion++;
           if(b.getCodigo()==calificacion.getCodigo()){
               break;
           }
       }
       return posicion;
    }

    @Override
    public boolean almacenarEnArchivo(Calificacion calificacion, String ruta) throws Exception {
        ObjectOutputStream salida=null;
        boolean retorno=false;
        try {
            salida= new ObjectOutputStream(new FileOutputStream(new File(ruta),true));
            salida.writeObject(calificacion);
            salida.close();
            retorno=true;
            
        } catch (Exception e1) {
            System.out.println(e1.toString());
            salida.close();
            
        }
        return retorno;
        
    }

    @Override
    public ArrayList<Calificacion> recuperarDeArchivo(String rutaArchivo) throws Exception {
        
        var calificacionList= new ArrayList<Calificacion>();
        var fis=new FileInputStream(new File(rutaArchivo));
        ObjectInputStream entrada= null;
        try {
            while (fis.available()>0) {
                entrada= new ObjectInputStream(fis);
                Calificacion calificacion=(Calificacion) entrada.readObject();
                calificacionList.add(calificacion);
            }
            entrada.close();
        } catch (Exception ex) {
            entrada.close();
        }
        System.out.println("Entro a recuperacion de archivos");
        System.out.println(calificacionList);
        return calificacionList;
    }

    @Override
    public boolean eliminarArchivo(String rutaArchivo) throws Exception {
        boolean llave= false;
        ObjectOutputStream salida=null;
        try {
            salida= new ObjectOutputStream(new FileOutputStream(new File(rutaArchivo),false));
            ObjectOutputStream salida1=salida;
            salida.close();
            llave=true;
        } catch (Exception e1) {
            System.out.println(e1.toString());
            salida.close();
        }
        return llave;
    }

}
