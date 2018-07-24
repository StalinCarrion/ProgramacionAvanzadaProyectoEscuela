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
public class Facturacion {
    String Nombre;
    double Saldo;
    String Descripcion;
    Matricula matricula;

    public Facturacion() {
    }

    public Facturacion(String Nombre, double Saldo, String Descripcion, Matricula matricula) {
        this.Nombre = Nombre;
        this.Saldo = Saldo;
        this.Descripcion = Descripcion;
        this.matricula = matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }    
}
