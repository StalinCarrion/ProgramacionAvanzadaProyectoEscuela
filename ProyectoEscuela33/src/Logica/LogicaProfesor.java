/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Profesor;
import Data.DataProfesor;
/**
 *
 * @author Admin
 */
public class LogicaProfesor {
    DataProfesor objDatProfesor = new DataProfesor();
    Profesor objProfesor = new Profesor();

    public Profesor BuscarProfesor(Profesor objRepresentante) {
        objProfesor = objDatProfesor.BuscarProfesor(objRepresentante);
        return objProfesor;
    }
    
    public boolean InsertarProfesor (Profesor objProfesor){
        boolean x = objDatProfesor.InsertarProfesor(objProfesor);
        return x;
    }
    
}
