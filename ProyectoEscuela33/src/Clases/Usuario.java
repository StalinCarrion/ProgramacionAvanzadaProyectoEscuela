
package Clases;

/**
 *
 * @author STALIN
 */
public class Usuario extends Persona {

    int tipoUsuario;
    String Usuario;
    String pass;

    public Usuario() {
    }

    public Usuario(int tipoUsuario, String Usuario, String pass) {
        this.tipoUsuario = tipoUsuario;
        this.Usuario = Usuario;
        this.pass = pass;
    }

    public Usuario(int tipoUsuario, String Usuario, String pass, String nombre, String apellido, String cedula, String telefono, String direccion, String correo, int edad) {
        super(nombre, apellido, cedula, telefono, direccion, correo, edad);
        this.tipoUsuario = tipoUsuario;
        this.Usuario = Usuario;
        this.pass = pass;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
