
package Clases;

/**
 *
 * @author STALIN
 */
public class Representante extends Persona{
        int idRepresentante;
        String Parentesco;

    public Representante() {
    }

    public Representante(int idRepresentante, String Parentesco) {
        this.idRepresentante = idRepresentante;
        this.Parentesco = Parentesco;
    }

    public Representante(int idRepresentante, String Parentesco, String nombre, String apellido, String cedula, String telefono, String direccion, String correo, int edad) {
        super(nombre, apellido, cedula, telefono, direccion, correo, edad);
        this.idRepresentante = idRepresentante;
        this.Parentesco = Parentesco;
    }

    

    public int getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(int idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public String getParentesco() {
        return Parentesco;
    }

    public void setParentesco(String Parentesco) {
        this.Parentesco = Parentesco;
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

    
}
