/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Actividades;
import Clases.Estudiante;
import Data.DataEstudiante;
import java.util.ArrayList;

/**
 *
 * @author FRANZ
 */
public class LogicaEstudiante {

    DataEstudiante ObjDatEstudiante = new DataEstudiante();

    public Estudiante BuscarEstudiante(Estudiante objEstudiante) {
        objEstudiante = ObjDatEstudiante.BuscarEstudiante(objEstudiante);
        return objEstudiante;
    }

    public Estudiante BuscarEstudianteAct(Estudiante objEstudiante) {
        objEstudiante = ObjDatEstudiante.BuscarAlumno(objEstudiante);
        return objEstudiante;
    }

    public boolean InsertarEstudiante(Estudiante objEstudiante) {
        boolean x = ObjDatEstudiante.InsertarEstudiante(objEstudiante);
        return x;
    }

    public ArrayList<Estudiante> BuscarEstudianteActividad(Actividades ObjAct) {
        ArrayList<Estudiante> ArrayAlumnos = new ArrayList<Estudiante>();
        ArrayAlumnos = ObjDatEstudiante.BuscarAlumnoActividad(ObjAct);

        return ArrayAlumnos;
    }

    public Estudiante ComprobarEstudianteMatriculado(Estudiante ObjAux) {
        Estudiante ObjEst = new Estudiante();
        ObjEst = ObjDatEstudiante.ComprobarEstudianteMatriculado(ObjAux);
        return ObjEst;
    }
}
