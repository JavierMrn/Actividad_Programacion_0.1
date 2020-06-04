package actividad_1;

public class Escalon {
    private float longitud;
    private String material;

    public Escalon(float longitud, String material) {
        this.longitud = longitud;
        this.material = material;
    }

    public float getLongitud() {
        return longitud;
    }

    public String getMaterial() {
        return material;
    }
}
