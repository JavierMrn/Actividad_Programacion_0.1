package actividad_1;

public class Escalon {
    private final float longitud;
    private final String material;

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
