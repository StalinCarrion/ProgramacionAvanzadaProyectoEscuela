/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.GradoParalelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sun.misc.Resource;

/**
 *
 * @author STALIN
 */
public class DataParalelo extends Conexion {
    
    public GradoParalelo BuscarParaleloGrado2(GradoParalelo ObjAux) {
        GradoParalelo ObjParalelo = new GradoParalelo();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT Grado, Paralelo FROM gradoparalelo WHERE Grado=? and Paralelo='"+ObjAux.getParalelo()+"'";
        //select Grado, Paralelo from gradoparalelo where Grado=4 and Paralelo = 'S';

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjAux.getGrado());
           
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjParalelo.setGrado(rs.getInt("Grado"));
                ObjParalelo.setParalelo(rs.getString("Paralelo"));

            }
            System.out.println("paralelo" + ObjParalelo.getParalelo());
            System.out.println("grado" + ObjParalelo.getGrado());
            return ObjParalelo;
        } catch (Exception e) {
            System.err.println(e);
            return ObjParalelo;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public GradoParalelo BuscarParaleloGrado(GradoParalelo ObjAux) {
        GradoParalelo ObjParalelo = new GradoParalelo();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM gradoparalelo WHERE Grado=? and Paralelo='"+ObjAux.getParalelo()+"'";
        //select Grado, Paralelo from gradoparalelo where Grado=4 and Paralelo = 'S';

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjAux.getGrado());
           
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjParalelo.setIdGradoParalelo(rs.getInt("idGradoParalelo"));
                ObjParalelo.setGrado(rs.getInt("Grado"));
                ObjParalelo.setParalelo(rs.getString("Paralelo"));

            }
            System.out.println("paralelo" + ObjParalelo.getParalelo());
            System.out.println("grado" + ObjParalelo.getGrado());
            return ObjParalelo;
        } catch (Exception e) {
            System.err.println(e);
            return ObjParalelo;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public boolean InsertarGradoParalelo(GradoParalelo ObjGradoParalelo) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO gradoparalelo (Grado, Paralelo, NumEstudiantes) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjGradoParalelo.getGrado());
            ps.setString(2, ObjGradoParalelo.getParalelo());
            ps.setInt(3, ObjGradoParalelo.getNumeroEstudiantes());
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
