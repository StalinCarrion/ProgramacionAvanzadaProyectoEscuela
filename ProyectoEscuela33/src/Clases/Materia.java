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
public class Materia {
    int IdMateria;
    String nombreMateria;
    int horas;
    int idProfesor;
    GradoParalelo gradoparalelo;
    Profesor profesor;

    public GradoParalelo getGradoparalelo() {
        return gradoparalelo;
    }

    public void setGradoparalelo(GradoParalelo gradoparalelo) {
        this.gradoparalelo = gradoparalelo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    
    
    public Materia() {
    }

    public Materia(int IdMateria, String nombreMateria, int horas, int idProfesor) {
        this.IdMateria = IdMateria;
        this.nombreMateria = nombreMateria;
        this.horas = horas;
        this.idProfesor = idProfesor;
    }

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    
}
