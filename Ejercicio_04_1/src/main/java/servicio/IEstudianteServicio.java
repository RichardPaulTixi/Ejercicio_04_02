/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import modelo.Estudiante;
import java.util.List;

/**
 *
 * @author Sebas
 */
public interface IEstudianteServicio {
    
    public Estudiante crear(Estudiante estudiante);
    public Estudiante bucarPorCodigo(int codigoEstudiante);
    public List<Estudiante> listar();
    
}
