/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Profesor;
import Clases.Representante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FRANZ
 */
public class DataProfesor extends Conexion{
    
    public ArrayList<Profesor> BuscarProfesor() {
        ArrayList<Profesor> ArrayPro = new ArrayList<Profesor>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select NombreProfesor, ApellidoProfesor, CedulaProfesor, idProfesor from escuela.profesor";        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profesor ObjPro = new Profesor();
                ObjPro.setNombre(rs.getString("NombreProfesor"));
                ObjPro.setApellido(rs.getString("ApellidoProfesor"));
                ObjPro.setCedula(rs.getString("CedulaProfesor"));
                ObjPro.setIdProfesor(rs.getString("idProfesor"));
                ArrayPro.add(ObjPro);
            }
            return ArrayPro;
        } catch (Exception e) {
            System.err.println(e);
            return ArrayPro;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }  
    public boolean InsertarProfesor(Profesor ObjProfesor) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO `escuela`.`profesor` (`NombreProfesor`, `ApellidoProfesor`, `CedulaProfesor`, `DireccionProfesor`, `CorreoProfesor`) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjProfesor.getNombre());
            ps.setString(2, ObjProfesor.getApellido());
            ps.setString(3, ObjProfesor.getCedula());
            ps.setString(4, ObjProfesor.getDireccion());
            ps.setString(5, ObjProfesor.getCorreo());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
    
    public Profesor BuscarProfesor(Profesor ObjAux) {
        Profesor ObjProfesor = new Profesor();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM profesor WHERE CedulaProfesor=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getCedula());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjProfesor.setNombre(rs.getString("NombreProfesor"));
                ObjProfesor.setApellido(rs.getString("ApellidoProfesor"));
                ObjProfesor.setCedula(rs.getString("CedulaProfesor"));
                ObjProfesor.setDireccion(rs.getString("DireccionProfesor"));
                ObjProfesor.setCorreo(rs.getString("CorreoProfesor"));
                
            }
            return ObjProfesor;
        } catch (Exception e) {
            System.err.println(e);
            return ObjProfesor;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
    
}
