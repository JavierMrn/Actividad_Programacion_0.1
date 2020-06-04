package actividad_1;

public class Persona {
    private final String nombre;
    private final int edad;
    private final float peso;

    public Persona(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }
    
    public void MostrarInformacion(){
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Peso: " + peso);
    }
}
