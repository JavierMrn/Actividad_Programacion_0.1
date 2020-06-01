package actividad_1;

public class Persona {
    private String nombre;
    private float longEscalones;
    private float pendiente;
    private float resultado;

    public Persona(String nombre, float longEscalones, float pendiente) {
        this.nombre = nombre;
        this.longEscalones = longEscalones;
        this.pendiente = pendiente;
    }
    
    public void mostrarInformacio(){
        System.out.println("El usuario " + nombre);
    }
    
    public void calcularLongitudRampa(){
        resultado = (longEscalones / pendiente) * 100;
        
        System.out.println("La longitud en cm que se necesita para tener una pendiente de " + pendiente +" es de: " + resultado);
    }
}
