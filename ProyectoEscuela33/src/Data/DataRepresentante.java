/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Representante;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author FRANZ
 */
public class DataRepresentante extends Conexion{
     
    public Representante BuscarRepresentante(Representante ObjAux) {
        Representante ObjRepresentante = new Representante();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM representante WHERE CedulaRepresentante=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getCedula());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjRepresentante.setNombre(rs.getString("NombreRepresentante"));
                ObjRepresentante.setApellido(rs.getString("ApellidoRepresentante"));
                ObjRepresentante.setParentesco(rs.getString("Parentesco"));
                ObjRepresentante.setCedula(rs.getString("CedulaRepresentante"));
                ObjRepresentante.setDireccion(rs.getString("DireccionRepresentante"));
                ObjRepresentante.setCorreo(rs.getString("CorreoRepresentante"));
                ObjRepresentante.setIdRepresentante(rs.getInt("idRepresentante"));
            }
            return ObjRepresentante;
        } catch (Exception e) {
            System.err.println(e);
            return ObjRepresentante;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
    
    public Representante BuscarRepresentanteConId(Representante ObjAux) {
        Representante ObjRepresentante = new Representante();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM representante WHERE idRepresentante=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjAux.getIdRepresentante());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjRepresentante.setNombre(rs.getString("NombreRepresentante"));
                ObjRepresentante.setApellido(rs.getString("ApellidoRepresentante"));
                ObjRepresentante.setParentesco(rs.getString("Parentesco"));
                ObjRepresentante.setCedula(rs.getString("CedulaRepresentante"));
                ObjRepresentante.setDireccion(rs.getString("DireccionRepresentante"));
                ObjRepresentante.setCorreo(rs.getString("CorreoRepresentante"));
                ObjRepresentante.setIdRepresentante(rs.getInt("idRepresentante"));
            }
            return ObjRepresentante;
        } catch (Exception e) {
            System.err.println(e);
            return ObjRepresentante;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
    
    public boolean InsertarRepresentante(Representante ObjRepresentante) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO `escuela`.`Representante` (`NombreRepresentante`, `ApellidoRepresentante`, `Parentesco`, `CedulaRepresentante`, `DireccionRepresentante`, `CorreoRepresentante`) VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjRepresentante.getNombre());
            ps.setString(2, ObjRepresentante.getApellido());
            ps.setString(3, ObjRepresentante.getParentesco());
            ps.setString(4, ObjRepresentante.getCedula());
            ps.setString(5, ObjRepresentante.getDireccion());
            ps.setString(6, ObjRepresentante.getCorreo());
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
}
