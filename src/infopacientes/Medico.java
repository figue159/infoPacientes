
package infopacientes;


public class Medico extends Persona {
    public String nombrePaciente;

     public String lugarAtencion;
        
    public Medico(int codigo, String nombre, String apellido, char sexo, String direccion) {
        super(codigo, nombre, apellido, sexo, direccion);
    }

    public Medico(String nombrePaciente, String lugarAtencion, int codigo, String nombre, String apellido, char sexo, String direccion) {
        super(codigo, nombre, apellido, sexo, direccion);
        this.nombrePaciente = nombrePaciente;
        this.lugarAtencion = lugarAtencion;
    }
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+"es medico del lugar "+lugarAtencion+" y atendio al paciente "+nombrePaciente;
    }
    
}
