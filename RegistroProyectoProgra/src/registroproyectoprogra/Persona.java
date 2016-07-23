package registroproyectoprogra;

import java.util.Date;

public class Persona {
     private String nombre;

    private String apellido;
    private String licencia;
    String email;
    private String direccion;
    private String telefono;
    private String infoTaxi;
    private char genero;
    private int id;
    private int edad;
    private Date fechaIngreso;
   
    
   
    public Persona() {
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

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInfoTaxi() {
        return infoTaxi;
    }

    public void setInfoTaxi(String infoTaxi) {
        this.infoTaxi = infoTaxi;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {

        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date date) {
        this.fechaIngreso = date;
        
    }
}
