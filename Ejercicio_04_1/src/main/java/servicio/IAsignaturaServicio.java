/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author Sebas
 */
public interface IAsignaturaServicio {
    public Asignatura crear(Asignatura asignatura);
    public Asignatura bucarPorCodigo(int codigoAsignatura);
    public List<Asignatura> listar();
    
    
}
