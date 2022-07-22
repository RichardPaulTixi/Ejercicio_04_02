/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Calificacion;

/**
 *
 * @author Sebas
 */
public interface ICalificacionServicio {
    public Calificacion crear(Calificacion calificacion);
    public Calificacion modificar(int codigoCalificacion, Calificacion calificacionNuevo);
    public Calificacion eliminar(int codigoCalificacion);
    public Calificacion buscarPorCodigo(int codigoCalificacion);
    public int buscarPosicion(Calificacion calificacion);
    public List<Calificacion> listar();
    public boolean almacenarEnArchivo(Calificacion calificacion, String ruta) throws Exception;
    public ArrayList<Calificacion> recuperarDeArchivo(String rutaArchivo) throws Exception;
    public boolean eliminarArchivo(String rutaArchivo) throws Exception;
    
    
}
