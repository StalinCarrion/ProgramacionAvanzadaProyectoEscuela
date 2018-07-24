/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Materia;
import Data.DataMateria;
import java.util.ArrayList;

/**
 *
 * @author FRANZ
 */
public class LogicaMateria {
    DataMateria objDatMateria = new DataMateria();

    public Materia BuscarMateria(String Materia) {
        Materia objMateria = new Materia();
        objMateria.setNombreMateria(Materia);
        objMateria = objDatMateria.BuscarMateria(objMateria);
        return objMateria;
    }
    
    public boolean InsertarMateria (Materia objMateria){
        boolean x = objDatMateria.InsertarMateria(objMateria);
        return x;
    }
    public boolean ComprobarMateria(Materia objMateria){
        boolean x = objDatMateria.ComprobarMateria(objMateria);
        return x;
    }
    public ArrayList<Materia> ListarMaterias(){
        ArrayList<Materia> arrayListMaterias = new ArrayList<Materia>();
        arrayListMaterias = objDatMateria.ListarMaterias();
        return arrayListMaterias;
    }
            
    
}
