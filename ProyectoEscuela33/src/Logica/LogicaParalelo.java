/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.GradoParalelo;
import Data.DataParalelo;

/**
 *
 * @author STALIN
 */
public class LogicaParalelo {

    DataParalelo objDatParalelo = new DataParalelo();

    public GradoParalelo BuscarParaleloGrado(int Grado, String Paralelo) {
        GradoParalelo ObjGP = new GradoParalelo();
        ObjGP.setParalelo(Paralelo);
        ObjGP.setGrado(Grado);
        ObjGP = objDatParalelo.BuscarParaleloGrado(ObjGP);
        return ObjGP;
    }
    
    public boolean InsertarParalelo (GradoParalelo objGradoParalelo){
        boolean x = objDatParalelo.InsertarGradoParalelo(objGradoParalelo);
        return x;
    }
    public GradoParalelo BuscarParaleloGrado2(String nombreParalelo, String GradoParalelo) {
        GradoParalelo objParalelo = new GradoParalelo();
        objParalelo.setParalelo(nombreParalelo);
        objParalelo.setGrado(Integer.parseInt(GradoParalelo.trim()));
        objParalelo = objDatParalelo.BuscarParaleloGrado2(objParalelo);
        return objParalelo;
    }
}
