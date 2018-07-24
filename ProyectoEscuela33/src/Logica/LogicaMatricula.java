/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Estudiante;
import Clases.GradoParalelo;
import Clases.Matricula;
import Clases.OfertaAcademica;
import Data.DataMatricula;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FRANZ
 */
public class LogicaMatricula {
    
    LogicaEstudiante ObjLogEst = new LogicaEstudiante();
    DataMatricula objDataCant = new DataMatricula();
    LogicaOfertaAcademica ObjLOA = new LogicaOfertaAcademica();
    
    public ArrayList<GradoParalelo> ObtenerParalelos(GradoParalelo objGP) throws ClassNotFoundException, SQLException {
        ArrayList<GradoParalelo> ArrayGP = new ArrayList<>();
        
        ResultSet rs = objDataCant.ObtenerParalelos(objGP);
        while(rs.next()){            
           GradoParalelo objPar = new GradoParalelo(rs.getInt("idGradoParalelo"),rs.getInt("Grado"), rs.getString("Paralelo"), rs.getInt("NumEstudiantes"));
            ArrayGP.add(objPar);
        }
        return ArrayGP;
    }
     public boolean MatricularEstudiante(Matricula ObjMat) {
        Estudiante ObjEst;
        OfertaAcademica ObjOA;
        GradoParalelo ObjGP;
        //Obtener el Id del Estudiante
        ObjEst = ObjLogEst.BuscarEstudiante(ObjMat.getEstudiante());
        ObjMat.setEstudiante(ObjEst);
        //Obtener el Id de la Oferta Académica
        ObjOA = ObjMat.getOfertaAcademica();
        
        ObjGP = (ObjOA.getIdGradoParalelo());
        
        ObjOA.setIdGradoParalelo(ObjGP);
        
        
        boolean x = objDataCant.MatricularEstudiante(ObjMat);
        return x;
     }
}
