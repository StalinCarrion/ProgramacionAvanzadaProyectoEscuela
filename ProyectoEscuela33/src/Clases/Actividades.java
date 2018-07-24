/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Ricardo Paltin
 */
public class Actividades {

    int idActividad;
    int grado;

    String paralelo;
    String tipoActividad;
    String nombreActividad;

    Date FechaInicio;
    Date FechaFinal;

    Double aporteEconomico;
    
    Estudiante ObjEst;

    public Actividades() {
    }

    public Actividades(int grado, String paralelo, String tipoActividad, Date FechaInicio, Date FechaFinal, String nombreActividad, Double aporteEconomico, int idActividad) {
        this.grado = grado;
        this.paralelo = paralelo;
        this.tipoActividad = tipoActividad;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.nombreActividad = nombreActividad;
        this.aporteEconomico = aporteEconomico;
        this.idActividad = idActividad;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public Estudiante getObjEst() {
        return ObjEst;
    }

    public void setObjEst(Estudiante ObjEst) {
        this.ObjEst = ObjEst;
    }
    

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public Double getAporteEconomico() {
        return aporteEconomico;
    }

    public void setAporteEconomico(Double aporteEconomico) {
        this.aporteEconomico = aporteEconomico;
    }

    @Override
    public String toString() {
        return "Actividades{" + "grado=" + grado + ", paralelo=" + paralelo + ", tipoActividad=" + tipoActividad + ", FechaInicio=" + FechaInicio + ", FechaFinal=" + FechaFinal + ", nombreActividad=" + nombreActividad + ", aporteEconomico=" + aporteEconomico + ", idActividad=" + idActividad + '}';
    }

}
