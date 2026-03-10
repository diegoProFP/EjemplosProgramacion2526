package poo.ejercicios;

public class Rectangulo {

    public static final int MAX = 100;
    public static final int MIN = 0;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo(int nuevoX1, int nuevoY1, int nuevoX2, int nuevoY2) {

        if (nuevoX1 <= nuevoX2 && nuevoY1 <= nuevoY2) {
            //TA TO BIEN
            if (esValorValido(nuevoX1) && esValorValido(nuevoX2)&&
                    esValorValido(nuevoY1) && esValorValido(nuevoY2)) {
                this.x1 = nuevoX1;
                this.y1 = nuevoY1;
                this.x2 = nuevoX2;
                this.y2 = nuevoY2;

            }else{
                System.out.println("Alguno de los 4 valores está fuera de los rangos");
            }

        } else {
            System.err.println("ERROR! Las coordenadas del primer punto NO son inferiores a las del segundo punto");
        }
    }

    public void imprimir() {
        System.out.println("Rectangulo: "
                + String.format("(%d, %d) - (%d, %d)", this.x1, this.y1, this.x2, this.y2));
    }

    public int getArea() {
        return obtenerBase() * obtenerAltura();
    }

    public int getPerimetro() {
        int base = obtenerBase();
        int altura = obtenerAltura();

        return base * 2 + altura * 2;
    }

    public int obtenerBase() {
        return Math.abs(this.x1 - this.x2);
    }

    public int obtenerAltura() {
        return Math.abs(this.y1 - this.y2);
    }

    public static boolean esValorValido(int valor) {
        return valor > MIN && valor < MAX;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 > this.x2) {
            System.err.println("La nueva x1 " + x1 + " no puede ser mayor que la x2 " + this.x2);
        } else {
            this.x1 = x1;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 > this.y2) {
            System.err.println("La nueva y1 no puede ser mayor que la y2");
        } else {
            this.y1 = y1;
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if (x2 < this.x1) {
            System.err.println("La nueva x2 no puede ser menor que la x1");
        } else {
            this.x2 = x2;
        }

    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if (y2 < this.y1) {
            System.err.println("La nueva y2 no puede ser menor que la y1");
        } else {
            this.y2 = y2;
        }
    }
}
