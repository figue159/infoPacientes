
package infopacientes;


public class Paciente extends Persona {
    public String lugarAtencion;
    public String motivoConsulta;
    public String  medico;
    public String fecha;
    
    public Paciente(int codigo, String nombre, String apellido, char sexo, String direccion) {
        super(codigo, nombre, apellido, sexo, direccion);
    }

    public Paciente(String lugarAtencion, String motivoConsulta, String medico, String fecha, int codigo, String nombre, String apellido, char sexo, String direccion) {
        super(codigo, nombre, apellido, sexo, direccion);
        this.lugarAtencion = lugarAtencion;
        this.motivoConsulta = motivoConsulta;
        this.medico = medico;
        this.fecha = fecha;
    }
    
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+" es un paciente que fue atendido en "+lugarAtencion+" por motivo de "+motivoConsulta+" y fue atendido(a) por el medico(a)"+medico+" la fecha "+fecha;
    }
}
