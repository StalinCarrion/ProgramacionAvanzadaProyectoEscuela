/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Actividades;
import Clases.Estudiante;
import Data.DataActividades;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class LogicaActividades {

    DataActividades objDatActividades = new DataActividades();

    public ArrayList<Actividades> BuscarAvanzadoActividades(Actividades ObjAux) {
        ArrayList<Actividades> ArrayAct = new ArrayList<Actividades>();
        ArrayAct = objDatActividades.BuscarAvanzadoActividad(ObjAux);
        return ArrayAct;
    }

    public Actividades BuscarActividad(Actividades ObjAct) {
        Actividades ObjAux = new Actividades();
        ObjAux = objDatActividades.BuscarActividad(ObjAct);
        return ObjAux;
    }

    public boolean InsertarActividades(Actividades objAct) {
        boolean x = objDatActividades.InsertarActividad(objAct);
        return x;
    }

    public boolean InsertarActividadAlumno(Actividades ObjAct, Estudiante ObjEstudiante) {
        boolean x = objDatActividades.InsertarActividadAlumno(ObjAct, ObjEstudiante);
        return x;
    }

    public Actividades ComprobarActividadAlumno(Actividades ObjAct, Estudiante ObjEst) {
        Actividades ObjAux = new Actividades();
        ObjAux = objDatActividades.ComprobarActividadAlumno(ObjAct, ObjEst);
        return ObjAux;
    }

    public void EliminarAlumnoActividad(Estudiante ObjEst) {
        objDatActividades.EliminarAlumnoActividad(ObjEst);

    }
}
