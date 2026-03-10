package poo.ejercicios;

public class PrincipalRectangulo {

    public static void main(String[] args) {
        //(0,0)(5,5) y (7,9)(2,3).
        Rectangulo rectangulo1 = new Rectangulo(0,0, 5, 5);
        Rectangulo rectangulo2 = new Rectangulo(2,3,7,9);

        System.out.println("El rectangulo 1 tiene sus puntos en:");
       // System.out.println(String.format("(%d, %d) - (%d, %d)", rectangulo1.getX1(), rectangulo1.getY1(),
         //                                                       rectangulo1.getX2(), rectangulo1.getY2()));
        rectangulo1.imprimir();

        System.out.println("El rectangulo 2 tiene sus puntos en:");
        rectangulo2.imprimir();


        System.out.println("El area del 1 es: " + rectangulo1.getArea());
        System.out.println("El perimetro del 1 es: " + rectangulo1.getPerimetro());

        System.out.println("El area del 2 es: " + rectangulo2.getArea());
        System.out.println("El perimetro del 2 es: " + rectangulo2.getPerimetro());

        System.out.println("Probamos a cambiar datos...");

        rectangulo2.setY2(-4);

    }


    public static int calcularArea(Rectangulo rect){
        int base = obtenerBase(rect);
        int altura = obtenerAltura(rect);
        return base * altura;
    }

    public static int calcularPerimetro(Rectangulo rect){
        //obtener la base y la altura del rectangulo
        int base = obtenerBase(rect);
        int altura = obtenerAltura(rect);
        return ( (base * 2) + (altura * 2));
    }

    public static int obtenerBase(Rectangulo rect){
        return Math.abs(rect.getX1() - rect.getX2());
    }
    public static int obtenerAltura(Rectangulo rect){
        return Math.abs(rect.getY1() - rect.getY2());
    }

}
