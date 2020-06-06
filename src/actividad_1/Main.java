package actividad_1;

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        //Creación de Objetos
        Persona persona1 = new Persona("",0,0.0f);
        Escalon[] escalones;
        Logica logicaCentral = new Logica();
        
        //Variables
        int numeroEscalones;
        float pendiente;
        
        //Pedir Información al usuario y estblecer los valores a las variables de clase
        logicaCentral.establecerInformacionPersona(persona1);
        numeroEscalones = Integer.parseInt(JOptionPane.showInputDialog("Cuantos escalones hay?"));
        escalones = new Escalon[numeroEscalones];
        logicaCentral.establecerInformacionEscalon(escalones);
        pendiente = (float) Double.parseDouble(JOptionPane.showInputDialog("Pendiene Deseada: "));
        
        //Imprimir Resultados
        System.out.println("El usuario con la siguiente información: ");
        persona1.MostrarInformacion();
        System.out.println("Necesita una longitud de " + logicaCentral.obtenerResultado(escalones, pendiente) + " cm");
    }
}
