/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FRANZ
 */
public class DataMateria extends Conexion{
    
    public ArrayList<Materia> ListarMaterias() {
        ArrayList<Materia> ArrayMaterias = new ArrayList<Materia>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select idMateria, NombreMateria, Horas from escuela.materia";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Materia ObjMateria = new Materia();
                ObjMateria.setIdMateria(rs.getInt("idMateria"));
                ObjMateria.setNombreMateria(rs.getString("NombreMateria"));
                ObjMateria.setHoras(rs.getInt("Horas"));
                ArrayMaterias.add(ObjMateria);
            }
            return ArrayMaterias;
        } catch (Exception e) {
            System.err.println(e);
            return ArrayMaterias;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
    
    public Materia BuscarMateria(Materia ObjAux){
        Materia ObjMateria = new Materia();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM paralelo WHERE NombreMateria=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getNombreMateria());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjMateria.setNombreMateria(rs.getString("Nombre"));
                ObjMateria.setHoras(rs.getInt("Horas")); 
            }
            return ObjMateria;
        } catch (Exception e) {
            System.err.println(e);
            return ObjMateria;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
    
    public boolean InsertarMateria(Materia ObjMateria) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO `escuela`.`materia` (`idProfesor`, `NombreMateria`, `Horas`) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjMateria.getIdProfesor());
            ps.setString(2, ObjMateria.getNombreMateria());
            ps.setInt(3, ObjMateria.getHoras());
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
    public boolean ComprobarMateria(Materia ObjAux){
        Materia ObjMateria = new Materia();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from escuela.materia where materia.NombreMateria=? and materia.Horas=? and materia.idProfesor=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getNombreMateria());
            ps.setInt(2, ObjAux.getHoras());
            ps.setInt(3, ObjAux.getIdProfesor());
            rs = ps.executeQuery();
            if (rs.next()) {                
                ObjMateria.setNombreMateria(rs.getString("NombreMateria"));
                ObjMateria.setHoras(rs.getInt("Horas")); 
                ObjMateria.setIdProfesor(rs.getInt("idProfesor"));
                if(ObjMateria.getNombreMateria()!= null){
                    return true;
                }             
            }
            return false;
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
