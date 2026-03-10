package funciones.ejercicios;

public class EjercicioParseoVarGlobales {

    public static final int NUM_DATOS_ALUMNO = 4;

    public static final double DESCUENTO_MINIMO = 5.0;

    public static double notaMasAlta = 0;

    private static String[] arrayAlumnos;

    public static void main(String[] args) {

        arrayAlumnos = ficheroAlumnos();

        mostrarNombres();

        System.out.println("La media d edades es: " + obtenerMediaEdades(arrayAlumnos));

        notaMasAlta = obtenerNotaMaxima(arrayAlumnos);

        imprimirNotaMasAlta();

    }
    /*
    Parsea una linea como esta: "   Diego Alejandro   |49|DAW|8.4"
    en array de cadenas (sin usar split)
     */
    public static String[] parsearLinea(String linea){
        String[] valoresLinea = new String[4];

        int posBarraAnterior = 0;
        int posSiguienteBarra = 0;
        int contPalabras = 0;
        posSiguienteBarra = linea.indexOf("|", 0);
        while(posSiguienteBarra != -1){
            String palabra = linea.substring(posBarraAnterior, posSiguienteBarra);
            valoresLinea[contPalabras++] = palabra;
            posBarraAnterior = posSiguienteBarra+1;
            posSiguienteBarra = linea.indexOf("|", posSiguienteBarra+1);

        }
        valoresLinea[contPalabras] = linea.substring(posBarraAnterior);

        return valoresLinea;
    }

    public static void mostrarNombres(){
        for (int cont = 0; cont < arrayAlumnos.length; cont++) {
            String lineaAlumno = arrayAlumnos[cont];
            String[] valoresAlumno = parsearLinea(lineaAlumno);
            String nombreAlumno = valoresAlumno[0];
            System.out.println("Alumno: " + convertirFormatoFrase(nombreAlumno));
        }
    }
    /*
    ["Diego Alejandro", "49", "DAW", "8.4"]
     */
    public static int obtenerEdadDeValores(String[] valores){
        String edad = valores[1];
        return Integer.parseInt(edad);
    }
    public static double obtenerNotaDeValores(String[] valores){
        String nota = valores[3];
        return Double.parseDouble(nota);
    }
    public static String convertirFormatoFrase(String palabra){

        System.out.println(NUM_DATOS_ALUMNO);

        String primeraLetra = palabra.substring(0, 1);
        String resto = palabra.substring(1);
        return primeraLetra.toUpperCase() + resto.toLowerCase();

    }

    public static float obtenerMediaEdades(String[] alumnos){
        int sumaTotal = 0;
        for (int cont = 0; cont < alumnos.length; cont++) {
            String[] valoresAlumno = parsearLinea(alumnos[cont]);
            sumaTotal += obtenerEdadDeValores(valoresAlumno);
        }
        return ((float)sumaTotal / alumnos.length);
    }
    public static double obtenerNotaMaxima(String[] alumnos){
        double notaMaxima = 0;
        for (int cont = 0; cont < alumnos.length; cont++) {
            String[] valores = parsearLinea(alumnos[cont]);
            double nota = obtenerNotaDeValores(valores);
            notaMaxima = Math.max(notaMaxima, nota);
        }
        return notaMaxima;
    }

    public static String[] ficheroAlumnos(){
        String[] alumnos = {
                "PACO|49|DAW|8.4",
                "LUCIA|22|DAM|7.9",
                "MARIO|31|ASIR|6.5",
                "ANA|18|DAW|9.9",
                "RAUL|27|DAM|5.8",
                "SOFIA|24|ASIR|7.2",
                "CARLOS|35|DAW|6.9",
                "ELENA|20|DAM|8.7",
                "JORGE|29|ASIR|7.0",
                "BEATRIZ|23|DAW|9.4"
        };
        return alumnos;
    }

    private static void imprimirNotaMasAlta(){
        System.out.println("notaMasAlta = " + notaMasAlta);
    }

}
