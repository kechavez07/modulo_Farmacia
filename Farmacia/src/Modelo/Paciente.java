
package Modelo;

import java.util.Date;


public class Paciente {
    private String nombre, apellido, seguroSocial,direccion, telefono, enfermedad, historialMedico;
    private Date fechaNacimiento;

    public Paciente(String nombre, String apellido, String seguroSocial, String direccion, String telefono, String enfermedad, String historialMedico, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.seguroSocial = seguroSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.enfermedad = enfermedad;
        this.historialMedico = historialMedico;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
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

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}