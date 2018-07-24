/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author STALIN
 */
public class Matricula {
    int numMatricula;
    String Fecha;
    Estudiante Estudiante;
    OfertaAcademica OfertaAcademica;

    public Matricula() {
    }

    public Matricula(int numMatricula, String Fecha, Estudiante Estudiante, OfertaAcademica OfertaAcademica) {
        this.numMatricula = numMatricula;
        this.Fecha = Fecha;
        this.Estudiante = Estudiante;
        this.OfertaAcademica = OfertaAcademica;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Estudiante getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(Estudiante Estudiante) {
        this.Estudiante = Estudiante;
    }

    public OfertaAcademica getOfertaAcademica() {
        return OfertaAcademica;
    }

    public void setOfertaAcademica(OfertaAcademica OfertaAcademica) {
        this.OfertaAcademica = OfertaAcademica;
    }

    
    
}
