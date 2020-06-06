package actividad_1;

import javax.swing.JOptionPane;

public class Logica {
    
    public void establecerInformacionPersona(Persona persona){
        String nombre = JOptionPane.showInputDialog("Nombre del Paciente: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del Paciente: "));
        float peso = (float) Double.parseDouble(JOptionPane.showInputDialog("Peso Del Paciente: "));
        persona.setPersona(nombre, edad, peso);
    }
 
    public void establecerInformacionEscalon(Escalon[] escalon){
        for (int i = 0; i < escalon.length; i++) {
            String material = JOptionPane.showInputDialog("Material del escalon " + (i+1) + ": "); 
            float longitud =(float)Double.parseDouble(JOptionPane.showInputDialog("Longitud del escalon " + (i + 1) + ": "));
            escalon[i] = new Escalon(longitud,material);
        }
    }
    
    public float obtenerResultado(Escalon[] escalon, float pendiente){
        float sumaLongitudEscalones = 0;

        for (Escalon escalon1 : escalon) {
            sumaLongitudEscalones += escalon1.getLongitud();
        }

        return (sumaLongitudEscalones / pendiente) * 100; 
    }
}
