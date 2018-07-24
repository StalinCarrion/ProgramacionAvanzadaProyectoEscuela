/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Actividades;
import Clases.Estudiante;
import Clases.GradoParalelo;
import Clases.Representante;
import Logica.LogicaRepresentante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FRANZ
 */
public class DataEstudiante extends Conexion{
    
    Representante ObjRepre = new Representante();
    LogicaRepresentante ObjLogRep = new LogicaRepresentante();
    
    public Estudiante BuscarEstudiante(Estudiante ObjAux) {
        Estudiante ObjEstudiante = new Estudiante();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM estudiante WHERE CedulaEstudiante=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getCedula());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjEstudiante.setIdEstudiante(rs.getInt("idEstudiante"));
                ObjEstudiante.setNombre(rs.getString("NombreEstudiante"));
                ObjEstudiante.setApellido(rs.getString("ApellidoEstudiante"));                
                ObjEstudiante.setCedula(rs.getString("CedulaEstudiante"));
                ObjEstudiante.setDireccion(rs.getString("DireccionEstudiante"));
                ObjEstudiante.setEdad(rs.getInt("EdadEstudiante"));
                ObjRepre.setIdRepresentante(rs.getInt("idRepresentante"));
                ObjEstudiante.setRepresentante(ObjLogRep.BuscarRepresentanteConId(ObjRepre));
            }
            return ObjEstudiante;
        } catch (Exception e) {
            System.err.println(e);
            return ObjEstudiante;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public boolean InsertarEstudiante(Estudiante ObjEstudiante) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO `escuela`.`estudiante` (`NombreEstudiante`, `ApellidoEstudiante`, `CedulaEstudiante`, `DireccionEstudiante`, `EdadEstudiante`,`idRepresentante`) VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjEstudiante.getNombre());
            ps.setString(2, ObjEstudiante.getApellido());
            ps.setString(3, ObjEstudiante.getCedula());
            ps.setString(4, ObjEstudiante.getDireccion());
            ps.setInt(5, ObjEstudiante.getEdad());
            ps.setInt(6, ObjEstudiante.getRepresentante().getIdRepresentante());
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
    public Estudiante BuscarAlumno(Estudiante ObjAux) {
        System.out.println(ObjAux.getCedula());
        
        Estudiante ObjEstudiante = new Estudiante();
        GradoParalelo ObjGradoPar = new GradoParalelo();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT estudiante.idEstudiante,estudiante.NombreEstudiante, estudiante.ApellidoEstudiante, gradoparalelo.Grado, gradoparalelo.Paralelo FROM escuela.estudiante, escuela.gradoparalelo WHERE  estudiante.CedulaEstudiante = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ObjAux.getCedula());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjEstudiante.setIdEstudiante(rs.getInt("idEstudiante"));
                ObjEstudiante.setNombre(rs.getString("NombreEstudiante"));
                ObjEstudiante.setApellido(rs.getString("ApellidoEstudiante"));
                ObjGradoPar.setGrado(rs.getInt("Grado"));
                ObjGradoPar.setParalelo(rs.getString("Paralelo"));
            }
            ObjEstudiante.setGradoparalelo(ObjGradoPar);
            System.out.println(ObjEstudiante.getNombre());
            System.out.println(ObjEstudiante.getGradoparalelo().getGrado()+" " + ObjEstudiante.getGradoparalelo().getParalelo());

            return ObjEstudiante;
        } catch (Exception e) {
            System.err.println(e);
            return ObjEstudiante;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public ArrayList<Estudiante> BuscarAlumnoActividad(Actividades ObjAux) {
        ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT idActividadesEstudiante, NombreEstudiante, ApellidoEstudiante, NombreActividad, Grado, Paralelo\n"
                + "FROM\n"
                + "\n"
                + "escuela.actividadesestudiante,\n"
                + "escuela.estudiante,\n"
                + "escuela.actividades,\n"
                + "escuela.matricula,\n"
                + "escuela.ofertaacademica, \n"
                + "escuela.gradoparalelo\n"
                + "\n"
                + "where actividadesestudiante.idActividad = actividades.idActividad\n"
                + "and actividadesestudiante.idEstudiante = estudiante.idEstudiante\n"
                + "and matricula.idOferAcade = ofertaacademica.idOferAcade\n"
                + "and matricula.idEstudiante = estudiante.idEstudiante\n"
                + "and ofertaacademica.idGradoParalelo = gradoparalelo.idGradoParalelo\n"
                + "and gradoparalelo.paralelo = gradoparalelo.paralelo\n"
                + "and actividadesestudiante.idActividad = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjAux.getIdActividad());
            rs = ps.executeQuery();
            while (rs.next()) {
                Estudiante ObjEstudiante = new Estudiante();
                GradoParalelo ObjGradoPar = new GradoParalelo();

                ObjEstudiante.setIdEstudiante(rs.getInt("idActividadesEstudiante")); // Se setea en el idEstudiante el idActividadesEstudiante
                ObjEstudiante.setNombre(rs.getString("NombreEstudiante"));
                ObjEstudiante.setApellido(rs.getString("ApellidoEstudiante"));
                ObjGradoPar.setGrado(rs.getInt("Grado"));
                ObjGradoPar.setParalelo(rs.getString("Paralelo"));
                ObjEstudiante.setGradoparalelo(ObjGradoPar);
                ArrayEstudiante.add(ObjEstudiante);
            }

            return ArrayEstudiante;
        } catch (Exception e) {
            System.err.println(e);
            return ArrayEstudiante;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public Estudiante ComprobarEstudianteMatriculado(Estudiante ObjAux) {
        System.out.println(ObjAux.getCedula()+"DATA1");
        Estudiante ObjEstudiante = new Estudiante(); 
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT estudiante.idEstudiante,estudiante.NombreEstudiante, ApellidoEstudiante FROM escuela.estudiante, escuela.matricula WHERE matricula.idEstudiante = estudiante.idEstudiante and estudiante.idEstudiante = ?;";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjAux.getIdEstudiante());
            rs = ps.executeQuery();
            System.out.println(ObjEstudiante.getNombre()+"DATA2-1");
            if (rs.next()) {
                
                ObjEstudiante.setIdEstudiante(rs.getInt("idEstudiante"));
                ObjEstudiante.setNombre(rs.getString("NombreEstudiante"));
                ObjEstudiante.setApellido(rs.getString("ApellidoEstudiante"));
                System.out.println(ObjEstudiante.getNombre()+"DATA2");
            }
            return ObjEstudiante;
        } catch (Exception e) {
            System.err.println(e);
            return ObjEstudiante;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }
}
