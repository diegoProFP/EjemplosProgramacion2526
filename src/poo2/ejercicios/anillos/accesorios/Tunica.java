package poo2.ejercicios.anillos.accesorios;

public class Tunica {

    private String color;
    private String material;

    public Tunica(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Tunica{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
