/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.GradoParalelo;
import Clases.Materia;
import Clases.OfertaAcademica;
import Clases.Profesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author STALIN
 */
public class DataOfertaAcademica extends Conexion {

    public boolean BuscarIdMateria(Materia objMateria, GradoParalelo objGradoParalelo) {
//        Materia objMateria = new Materia();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "Select idMateria from ofertaacademica, gradoparalelo \n"
                + "where ofertaacademica.idMateria = ? \n"
                + "and ofertaacademica.idGradoParalelo = gradoparalelo.idGradoParalelo\n"
                + "and gradoparalelo.Grado = ?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, objMateria.getIdMateria());
            ps.setInt(2, objGradoParalelo.getGrado());
            System.out.println("ps " + ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                objMateria.setIdMateria(rs.getInt("idMateria"));
                return true;
            }
            return false;//ssssssssssssssssssssssssssssssssssss
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

    public ArrayList<Materia> BuscarOfertaAcademica(GradoParalelo objGradoAux) {
        ArrayList<Materia> ArrayMaterias = new ArrayList<Materia>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT materia.idMateria, idOferAcade, NombreMateria, Horas, Grado, Paralelo, NombreProfesor\n"
                + "FROM\n"
                + "\n"
                + "escuela.ofertaacademica,\n"
                + "escuela.materia,\n"
                + "escuela.gradoParalelo,\n"
                + "escuela.profesor\n"
                + "\n"
                + "where ofertaacademica.idGradoParalelo = gradoParalelo.idGradoParalelo\n"
                + "and ofertaacademica.idMateria = materia.idMateria\n"
                + "and materia.idProfesor = profesor.idProfesor\n"
                + "and gradoparalelo.Grado = ? and gradoparalelo.Paralelo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, objGradoAux.getGrado());
            ps.setString(2, objGradoAux.getParalelo());
            
            rs = ps.executeQuery();

            while (rs.next()) {
                Materia objMateria = new Materia();
                Profesor objProfesor = new Profesor();
                GradoParalelo objGradoParalelo = new GradoParalelo();

                objMateria.setIdMateria(rs.getInt("idMateria"));
                objMateria.setNombreMateria(rs.getString("NombreMateria"));
                objMateria.setHoras(rs.getInt("Horas"));
                objGradoParalelo.setGrado(rs.getInt("Grado"));
                objGradoParalelo.setParalelo(rs.getString("Paralelo"));
                objProfesor.setNombre(rs.getString("NombreProfesor"));

                objMateria.setGradoparalelo(objGradoParalelo);
                objMateria.setGradoparalelo(objGradoParalelo);
                objMateria.setProfesor(objProfesor);

                ArrayMaterias.add(objMateria);

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

    public boolean InsertarOfertaAcademica(GradoParalelo objGradoParalelo, Materia objMateria) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO ofertaacademica (idGradoParalelo, idMateria) select gradoparalelo.idGradoParalelo, materia.idMateria "
                + "from gradoparalelo, materia where Grado = ? and idMateria = ?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, objGradoParalelo.getIdGradoParalelo());
//          ps.setInt(2, Integer.parseInt(objMateria.getIdMateria()));
            ps.setInt(2, objMateria.getIdMateria());

            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e + " Insertar");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public boolean EliminarOfertaAcademica(Materia objMateria, GradoParalelo objGradoParalelo) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE  FROM ofertaacademica Where ofertaacademica.idMateria = ? \n"
                + "and ofertaacademica.idGradoParalelo IN (SELECT idGradoParalelo \n"
                + "FROM gradoparalelo \n"
                + "WHERE gradoparalelo.Grado = ?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, objMateria.getIdMateria());
            ps.setInt(2, objGradoParalelo.getGrado());
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
    public OfertaAcademica BuscarIdOfertaAcademica(OfertaAcademica ObjAux) {
//        Materia objMateria = new Materia();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM ofertaacademica WHERE idGradoParalelo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjAux.getIdGradoParalelo().getIdGradoParalelo());
            rs = ps.executeQuery();
            if (rs.next()) {
                ObjAux.setIdOfertaAcademica(rs.getInt("idOferAcade"));
            }
            return ObjAux;
        } catch (Exception e) {
            System.err.println(e);
            return ObjAux;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }

    }
}
