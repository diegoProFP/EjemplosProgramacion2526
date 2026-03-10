package poo2.ejercicios.anillos.accesorios;

public class Flecha {

    private int velocidad;
    private String color;
    private boolean venenosa;

    public Flecha(int velocidad, String color, boolean venenosa) {
        this.velocidad = velocidad;
        this.color = color;
        this.venenosa = venenosa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    @Override
    public String toString() {
        return "Flecha{" +
                "velocidad=" + velocidad +
                ", color='" + color + '\'' +
                ", venenosa=" + venenosa +
                '}';
    }
}
