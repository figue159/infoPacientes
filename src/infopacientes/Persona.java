
package infopacientes;

import javax.swing.JOptionPane;

public class Persona {
    public int codigo;
    public String nombre;
    public String apellido;
    public char sexo;
    public String direccion;

    public Persona(int codigo, String nombre, String apellido, char sexo, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.direccion = direccion;
    }
    public String mostrarInfo(){
        return "la persona "+nombre+"de apellidos "+apellido+" de sexo "+sexo+" que reside en "+direccion;
    }
}
