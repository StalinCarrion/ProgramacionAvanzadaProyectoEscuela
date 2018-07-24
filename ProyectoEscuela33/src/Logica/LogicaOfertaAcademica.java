/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.GradoParalelo;
import Clases.Materia;
import Clases.OfertaAcademica;
import Data.DataOfertaAcademica;
import java.util.ArrayList;

/**
 *
 * @author STALIN
 */
public class LogicaOfertaAcademica {

    DataOfertaAcademica objDataOfertaAcademica = new DataOfertaAcademica();

    public boolean InsertarOfertaAcademica(GradoParalelo objGradoParalelo, Materia objMateria) {
        boolean x = objDataOfertaAcademica.InsertarOfertaAcademica(objGradoParalelo, objMateria);
        return x;
    }

    public ArrayList<Materia> BuscarOfetaAcademica(GradoParalelo objGradoParalelo) {
        ArrayList<Materia> arrayListMaterias = new ArrayList<Materia>();
        arrayListMaterias = objDataOfertaAcademica.BuscarOfertaAcademica(objGradoParalelo);       
        return arrayListMaterias;
    }
    public boolean BuscarIdMateria(Materia objMateria, GradoParalelo objGradoParalelo){
        boolean x = objDataOfertaAcademica.BuscarIdMateria(objMateria, objGradoParalelo);
        System.out.println("x "+ x);
        return x;
    }
    
    public void EliminarAlumnoActividad(Materia objMateria, GradoParalelo objGradoParalelo ) {
        objDataOfertaAcademica.EliminarOfertaAcademica(objMateria, objGradoParalelo);
    }
    
    public OfertaAcademica BuscarIdOfertaAcademica(OfertaAcademica ObjOA){
        ObjOA = objDataOfertaAcademica.BuscarIdOfertaAcademica(ObjOA);
        return ObjOA;
    }
}
