package poo2.ejercicios.anillos.accesorios;

import java.util.Arrays;

public class Carcaj {

    public static final int MAX_FLECHAS = 20;
    private String material;
    private Flecha[] flechas;

    @Override
    public String toString() {
        return "Carcaj{" +
                "material='" + material + '\'' +
                ", flechas=" + Arrays.toString(flechas) +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Flecha[] getFlechas() {
        return flechas;
    }

    public void setFlechas(Flecha[] flechas) {
        this.flechas = flechas;
    }
}
