package actividad_1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("Juan", 20, 67);
        Escalon[] escalones = new Escalon[2];
        Operacion resultados = new Operacion();
        float pendiente;
        
        for (int i = 0; i < escalones.length; i++) {
            String material = JOptionPane.showInputDialog("Material del escalon " + (i+1) + ": "); 
            float longitud =(float)Double.parseDouble(JOptionPane.showInputDialog("Longitud del escalon " + (i + 1) + ": "));
            escalones[i] = new Escalon(longitud,material);
        }
        
        pendiente = (float) Double.parseDouble(JOptionPane.showInputDialog("Pendiene Deseada: "));
        
        System.out.println("El usuario con la siguiente información: ");
        persona1.MostrarInformacion();
        System.out.println("Necesita una longitud de " + resultados.ObtenerResultado(escalones, pendiente));
    }
}
