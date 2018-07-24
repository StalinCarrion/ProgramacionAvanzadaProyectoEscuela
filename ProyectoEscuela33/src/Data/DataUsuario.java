/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sun.misc.Resource;

/**
 *
 * @author STALIN
 */
public class DataUsuario extends Conexion {

    public Usuario BuscarUsuario(Usuario ObjAux) {
        Usuario ObjUsuario = new Usuario();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM usuario WHERE Usuario=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getUsuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjUsuario.setNombre(rs.getString("NombreUsuario"));
                ObjUsuario.setApellido(rs.getString("ApellidoUsuario"));
                ObjUsuario.setCedula(rs.getString("CedulaUsuario"));
                ObjUsuario.setDireccion(rs.getString("DireccionUsuario"));
                ObjUsuario.setCorreo(rs.getString("CorreoUsuario"));
                ObjUsuario.setEdad(rs.getInt("EdadUsuario"));
                ObjUsuario.setTipoUsuario(rs.getInt("TipoUsuario"));
                ObjUsuario.setUsuario(rs.getString("Usuario"));
                ObjUsuario.setPass(rs.getString("Pass"));
            }
            return ObjUsuario;
        } catch (SQLException e) {
            System.err.println(e);
            return ObjUsuario;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public boolean InsertarUsuario(Usuario ObjUsuario) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO usuario (NombreUsuario, ApellidoUsuario, CedulaUsuario, DireccionUsuario,"
                + " CorreoUsuario, EdadUsuario, TipoUsuario, Usuario, Pass) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjUsuario.getNombre());
            ps.setString(2, ObjUsuario.getApellido());
            ps.setString(3, ObjUsuario.getCedula());
            ps.setString(4, ObjUsuario.getDireccion());
            ps.setString(5, ObjUsuario.getCorreo());
            ps.setInt(6, ObjUsuario.getEdad());
            ps.setInt(7, ObjUsuario.getTipoUsuario());
            ps.setString(8, ObjUsuario.getUsuario());
            ps.setString(9, ObjUsuario.getPass());
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
