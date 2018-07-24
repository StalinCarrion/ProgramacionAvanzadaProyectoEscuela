/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Estudiante;
import Clases.GradoParalelo;
import Clases.Matricula;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FRANZ
 */
public class DataMatricula extends Conexion{
    private Conexion conecta = new Conexion();
    
    public ResultSet ObtenerParalelos(GradoParalelo objGP) throws ClassNotFoundException, SQLException{
        Statement consulta = conecta.getConexion().createStatement();
        String sql = "select * from gradoparalelo where grado = "+objGP.getGrado();
        return consulta.executeQuery(sql);
    }
    
    public boolean MatricularEstudiante(Matricula ObjMat) {
        System.out.println(ObjMat.getEstudiante().getIdEstudiante());
        System.out.println(ObjMat.getOfertaAcademica().getIdOfertaAcademica());
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO `escuela`.`matricula` (`NumMatricula`, `Fecha`, `idEstudiante`, `idOferAcade`) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ObjMat.getNumMatricula());
            ps.setDate(2, Date.valueOf(ObjMat.getFecha()));
            ps.setInt(3, ObjMat.getEstudiante().getIdEstudiante());
            ps.setInt(4, ObjMat.getOfertaAcademica().getIdOfertaAcademica());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e + " error matricularEstudiante");
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
