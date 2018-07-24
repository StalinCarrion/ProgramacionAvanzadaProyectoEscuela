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
public class GradoParalelo {

    int idGradoParalelo;
    int Grado;
    String paralelo;
    int numeroEstudiantes;

    public GradoParalelo() {
    }

    public int getIdGradoParalelo() {
        return idGradoParalelo;
    }

    public void setIdGradoParalelo(int idGradoParalelo) {
        this.idGradoParalelo = idGradoParalelo;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public GradoParalelo(int idGradoParalelo, int Grado, String paralelo, int numeroEstudiantes) {
        this.idGradoParalelo = idGradoParalelo;
        this.Grado = Grado;
        this.paralelo = paralelo;
        this.numeroEstudiantes = numeroEstudiantes;
    }

    @Override
    public String toString() {
        return "GradoParalelo{" + "idGradoParalelo=" + idGradoParalelo + ", Grado=" + Grado + ", paralelo=" + paralelo + ", numeroEstudiantes=" + numeroEstudiantes + '}';
    }
    
}
