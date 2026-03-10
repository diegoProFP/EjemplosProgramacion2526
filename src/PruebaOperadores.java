public class PruebaOperadores {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        int numero = 0;
        numero = 6 * 3;
        int restoDivision = 6 % 2;// caracter % es el mod
        System.out.println(numero);
        System.out.println(restoDivision);
        int contador = 5;
        contador++;
        contador = contador + 1;//equivalente a contador = contador + 1
        contador += 2;//equivalente a contador = contador + 4

        System.out.println("Contador (primer mensaje): " + contador);
        contador++;
        System.out.println("Contador (segundo mensaje): " + (contador));
        System.out.println("Contador (tercer mensaje): " +  (++contador));

        int edad1 = 18;
        int edad2 = 40;
        boolean esMenor1Que2 = edad1 < edad2;
        System.out.println("¿Es menor 1 que 2? " + esMenor1Que2);

        int notaAlumno1 = 6;
        int notaAlumno2 = 5;
        boolean sonIguales = notaAlumno1 == notaAlumno2;
        System.out.println("Notas iguales?  " + sonIguales);




        //contador /= 2;

        int numeroLargo = 2147483647;
        numeroLargo-=2;
        System.out.println("Numero largo: "+ numeroLargo);

        System.out.println("Finalizando...");
    }


}
