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
public class Estudiante extends Persona{
    int idEstudiante;
    Representante representante;
    GradoParalelo gradoParalelo;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, Representante representante) {
        this.idEstudiante = idEstudiante;
        this.representante = representante;
    }     
    
    public Estudiante(String nombre, String apellido, String cedula, String telefono, String direccion, String correo, int edad) {
        super(nombre, apellido, cedula, telefono, direccion, correo, edad);
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public GradoParalelo getGradoparalelo() {
        return gradoParalelo;
    }

    public void setGradoparalelo(GradoParalelo gradoparalelo) {
        this.gradoParalelo = gradoparalelo;
    }
    

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
