/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Representante;
import Data.DataRepresentante;

/**
 *
 * @author FRANZ
 */
public class LogicaRepresentante {
    DataRepresentante objDatRepresentante = new DataRepresentante();

    public Representante BuscarRepresentante(Representante objRepresentante) {
        objRepresentante = objDatRepresentante.BuscarRepresentante(objRepresentante);
        return objRepresentante;
    }
    
    public Representante BuscarRepresentanteConId(Representante objRepresentante) {
        objRepresentante = objDatRepresentante.BuscarRepresentanteConId(objRepresentante);
        return objRepresentante;
    }
    
    public boolean InsertarRepresentante (Representante objRepresentante){
        boolean x = objDatRepresentante.InsertarRepresentante(objRepresentante);
        return x;
    }
    
}
