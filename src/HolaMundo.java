public class HolaMundo {

    public static void main(String[] args) {

        // Esto es un comentario de línea
        int numero; //Declaramos una variable
        numero = -9;     //Usando la variable (para asignarle un nuevo valor)

        final double PI = 3.1416;
        final float valorGravedad = 9.8f;


        {
            int miVariable = 10;
            miVariable = miVariable + 1;
            numero = numero + 1;
        }


        byte variableByte = 11;
        short variableShort= -15000;
        int contador = 1_000_000;
        long contadorGrande = 4837592843789237487l;

        float notaAlumno = (15f / 9);
        System.out.println("La nota es: " + notaAlumno);

        double notaMaxima = 10.0;
        char respuestaSi = 'S';
        char respuestaNo = 'N';
        boolean haAcertado = false;
        boolean esFestivo = true;
        boolean aprobado = false;
        boolean esPositivo = (numero == 0);
        String nombre = "Paco";


        System.out.println("La variable esPositivo tiene valor: " + esPositivo);
        System.out.println("Me llamo Diego. Contador: " + contador);
        System.out.print("Hola, mi edad es: " + 18);
        System.out.println("Mi nombre es " + nombre + " y tengo " + variableByte + " años");

    }

}
