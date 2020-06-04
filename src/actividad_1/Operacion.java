package actividad_1;

public class Operacion {
    private float resultado;
    
    public float ObtenerResultado(Escalon[] escalon, float pendiente){
        float sumaLongitudEscalones = 0;
        
        for (Escalon escalon1 : escalon) {
            sumaLongitudEscalones += escalon1.getLongitud();
        }
        return resultado = (sumaLongitudEscalones / pendiente) * 100; 
    }
}
