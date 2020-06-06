package actividad_1;

public class Persona {
    private String nombre;
    private int edad;
    private float peso;

    public Persona(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public void setPersona(String nombre, int edad, float peso){
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
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kilos");
    }
}
