/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Actividades;
import Clases.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class DataActividades extends Conexion {

    public Actividades BuscarActividad(Actividades ObjAux) {
        Actividades ObjAct = new Actividades();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM escuela.actividades WHERE NombreActividad=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getNombreActividad());
            
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjAct.setAporteEconomico(rs.getDouble("AporteEstudiante"));
                ObjAct.setNombreActividad(rs.getString("NombreActividad"));
                ObjAct.setFechaFinal(rs.getDate("FechaFinal"));
                ObjAct.setFechaInicio(rs.getDate("FechaInicio"));
                ObjAct.setTipoActividad(rs.getString("TipoActividad"));
            }
            return ObjAct;
        } catch (Exception e) {
            System.err.println(e);
            return ObjAct;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public ArrayList<Actividades> BuscarAvanzadoActividad(Actividades ObjAux) {

        ArrayList<Actividades> ArrayAct = new ArrayList<Actividades>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT actividades.* FROM escuela.actividades where NombreActividad LIKE('%" + ObjAux.getNombreActividad() + "%');";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Actividades ObjAct = new Actividades();
                ObjAct.setAporteEconomico(rs.getDouble("AporteEstudiante"));
                ObjAct.setNombreActividad(rs.getString("NombreActividad"));
                ObjAct.setFechaFinal(rs.getDate("FechaFinal"));
                ObjAct.setFechaInicio(rs.getDate("FechaInicio"));
                ObjAct.setTipoActividad(rs.getString("TipoActividad"));
                ObjAct.setIdActividad(rs.getInt("idActividad"));
                ArrayAct.add(ObjAct);
            }
            return ArrayAct;
        } catch (Exception e) {
            System.err.println(e);
            return ArrayAct;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public boolean InsertarActividad(Actividades ObjAct) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO actividades (TipoActividad, FechaInicio, FechaFinal, NombreActividad, AporteEstudiante) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAct.getTipoActividad());
            ps.setDate(2, ObjAct.getFechaInicio());// FECHAS
            ps.setDate(3, ObjAct.getFechaFinal()); // FECHAS
            ps.setString(4, ObjAct.getNombreActividad());
            ps.setDouble(5, ObjAct.getAporteEconomico());
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

    public boolean InsertarActividadAlumno(Actividades ObjAct, Estudiante ObjEst) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO escuela.actividadesestudiante (idEstudiante, idActividad) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjEst.getIdEstudiante());
            ps.setInt(2, ObjAct.getIdActividad());

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

    public Actividades ComprobarActividadAlumno(Actividades ObjAuxAct, Estudiante ObjAuxEst) {
        Actividades ObjAct = new Actividades();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT actividadesestudiante.* FROM escuela.actividadesestudiante where idActividad = ? and idEstudiante = ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjAuxAct.getIdActividad());
            ps.setInt(2, ObjAuxEst.getIdEstudiante());
            rs = ps.executeQuery();

            if (rs.next()) {
                ObjAct.setIdActividad(rs.getInt("idActividad"));
            }
            return ObjAct;
        } catch (Exception e) {
            System.err.println(e);
            return ObjAct;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
    public boolean EliminarAlumnoActividad(Estudiante ObjEst) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM escuela.actividadesestudiante WHERE idActividadesEstudiante=?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjEst.getIdEstudiante());// Se seteó en el idEstudiante el idActividadesEstudiante

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
