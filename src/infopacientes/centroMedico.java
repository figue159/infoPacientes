
package infopacientes;

public class centroMedico {
    public String nombreMedico;
    public String nombrePaciente;

    public centroMedico(String nombreMedico, String nombrePaciente) {
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
    }
    
    
    public String Info(){
        return "el paciente "+nombrePaciente+" fue atendido por "+nombreMedico;
    }
}
