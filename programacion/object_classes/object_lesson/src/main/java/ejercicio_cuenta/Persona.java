/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cuenta;

/**
 *
 * @author DAW
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String DNI;
    private byte edad;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellidos, String DNI, byte edad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n\t\tNombre: "+nombre + " "+apellidos + "\n\t\tDNI: "+DNI +"\n\t\tEdad: "+ edad+"\n\t\tTelefono: " + telefono;
    }
    
    
}
