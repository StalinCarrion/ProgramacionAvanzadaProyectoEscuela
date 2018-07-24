/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Usuario;
import Data.DataUsuario;

/**
 *
 * @author STALIN
 */
public class LogicaUsuario {
    DataUsuario objDatUsuario = new DataUsuario();

    public Usuario BuscarUsuario(Usuario objUsuario) {
        objUsuario = objDatUsuario.BuscarUsuario(objUsuario);
        return objUsuario;
    }
    
    public boolean InsertarUsuario (Usuario objUsuario){
        boolean x = objDatUsuario.InsertarUsuario(objUsuario);
        return x;
    }
}
