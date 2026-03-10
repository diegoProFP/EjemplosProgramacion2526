package poo.ejercicios.modificaciones;

public class PrincipalRectangulo2 {

    public static void main(String[] args) {
        //TODO crear rectangulos usando puntos (obj de clase Punto)
        //Rectangulo 1: (1,1)(5,4)
        Punto punto1Rect1 = new Punto(1,1);
        Punto punto2Rect1 = new Punto(5,4);

        Rectangulo rect1 = new Rectangulo(punto1Rect1, punto2Rect1);
        rect1.imprimir();

        System.out.println("El area del rect1 es: " + rect1.getArea());
        System.out.println("El perimetro del rect1 es: " + rect1.getPerimetro());

        //Rectangulo 2: (2,1)(6,3)
        Punto punto1Rect2 = new Punto(2,1);
        Punto punto2Rect2 = new Punto(6,3);

        Rectangulo rect2 = new Rectangulo(punto1Rect2, punto2Rect2);
        rect2.imprimir();
        System.out.println("El area del rect2 es: " + rect2.getArea());
        System.out.println("El perimetro del rect2 es: " + rect2.getPerimetro());

        //Rectangulo 3: (5,5)(2,2)
        Punto punto1Rect3 = new Punto(5,5);
        Punto punto2Rect3 = new Punto(2,2);

        Rectangulo rect3 = new Rectangulo(punto1Rect3, punto2Rect3);



    }
}
