
package infopacientes;

import javax.swing.JOptionPane;

public class InfoPacientes {

    
    public static void main(String[] args) {
        InfoPacientes obj = new InfoPacientes();
        obj.llenaInfo();
    }
    public  void llenaInfo(){
        int n,codigo,codigom,opc;
        char sexo,sexom;
        String lugarAtencion,motivoConsulta,medico,fecha,nombre,apellido,direccion,direccionm,apellidom,nombreBus;
        
         n=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de pacientes a procesar: "));   
         Paciente p1[]= new Paciente[n];
         Medico m1[]= new Medico[n];
         centroMedico cm1[]= new centroMedico[n];
         
         for(int i=0; i<n; i++){
             JOptionPane.showMessageDialog(null,"a continuacion se procedera a llenar los datos del paciente "+(i+1)+" :");
            lugarAtencion = JOptionPane.showInputDialog("nombre del lugar donde fue atendido: ");
            motivoConsulta = JOptionPane.showInputDialog("motivo de su consulta: ");
            medico = JOptionPane.showInputDialog("nombre del medico que lo atendio: ");
            fecha = JOptionPane.showInputDialog("fecha en la que fue atendido: ");
            nombre = JOptionPane.showInputDialog("¿Cual es su nombre?");
            apellido = JOptionPane.showInputDialog("¿Cual es su apellido?");
            direccion = JOptionPane.showInputDialog("direccion de residencia");
             codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite codigo de paciente ")); 
              sexo = JOptionPane.showInputDialog("escriba su sexo(m si es masculino y f si es femenino)").charAt(0);
              JOptionPane.showMessageDialog(null,"a continuacion se llenara la informacion del medico de cabecera: ");
              codigom=Integer.parseInt(JOptionPane.showInputDialog("Digite codigo del doctor:  ")); 
              apellidom = JOptionPane.showInputDialog("apellido del medico ");
              sexom = JOptionPane.showInputDialog("escriba sexo del medico (m si es masculino y f si es femenino)").charAt(0);
              direccionm = JOptionPane.showInputDialog("direccion de residencia del medico: ");
            p1[i]= new Paciente(lugarAtencion, motivoConsulta, medico, fecha, codigo, nombre, apellido, sexo, direccion);
            m1[i]= new Medico(nombre,lugarAtencion,codigom,medico,apellidom,sexom,direccionm);
            cm1[i]= new centroMedico(medico, nombre);
         }
        opc=Integer.parseInt(JOptionPane.showInputDialog("menu de consulta: "+"\n"+".Digite 1 para consultar por nombre de paciente"+"\n"+".Digite 2 para consultar por nombre del medico"+"\n"+".Digite 3 para consultar por puesto medico"));  
        if(opc == 1){
            nombreBus = JOptionPane.showInputDialog("nombre del paciente: ");
            for(int i=0; i<p1.length; i++){
                if(nombreBus.equals(p1[i].nombre)){
                    JOptionPane.showMessageDialog(null,"la informacion encontrada fue: "+p1[i].mostrarInfo());
                }else if (!(nombreBus.equals(p1[i].nombre))){
                    JOptionPane.showMessageDialog(null,"no se encontro el nombre del paciente en nuestra lista, favor volver a intentar");
                }
            }
        }else if(opc == 2){
            nombreBus=JOptionPane.showInputDialog("nombre del medico: ");
        
        for(int i=0; i<p1.length; i++){
                if(nombreBus.equals(p1[i].nombre)){
                    JOptionPane.showMessageDialog(null,"la informacion encontrada fue: "+m1[i].mostrarInfo());
                }else if(!(nombreBus.equals(p1[i].nombre))){
                    JOptionPane.showMessageDialog(null,"no se encontro el nombre del medico en nuestra lista, favor volver a intentar");
                }
        }
        }
        else if(opc == 3){
            nombreBus=JOptionPane.showInputDialog("nombre del centro medico: ");
        
        for(int i=0; i<p1.length; i++){
                if(nombreBus.equals(p1[i].lugarAtencion)){
                    JOptionPane.showMessageDialog(null,"la informacion encontrada fue: "+cm1[i].Info());
                }else if (!(nombreBus.equals(p1[i].nombre))){
                    JOptionPane.showMessageDialog(null,"no se encontro el nombre del  centro medico en nuestra lista, favor volver a intentar");
                }
        }
      }
    }
}
    
    
  

