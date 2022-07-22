/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serial;
import java.io.Serializable;
import modelo.Estudiante;
/**
 *
 * @author Sebas
 */
public class Calificacion implements Serializable{
    
    private int calificacion;
    private int promedio;
    private int codigo;
    private Asignatura asignatura; 
    private Estudiante estudiante;

    public Calificacion(int calificacion, int promedio, int codigo,Asignatura asignatura, Estudiante estudiante) {
        this.calificacion= calificacion;
        this.promedio = promedio;
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.estudiante = estudiante;
        
    }
    
    public Calificacion(Integer calificacion, Integer promedio,Integer codigo, Asignatura asignatura, Estudiante estudiante) {
        this.calificacion = calificacion;
        this.promedio = promedio;
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.estudiante = estudiante;
    }

    public int getcalificacion() {
        return calificacion;
    }

    public void setcalificacion(int calificacion) {
        this.calificacion= calificacion;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "calificacion=" + calificacion + ", promedio=" + promedio + 
               ", asignatura=" + asignatura + ", estudiante=" + estudiante + '}';
    }
    
}
