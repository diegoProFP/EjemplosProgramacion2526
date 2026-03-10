package funciones.ejercicios;

import java.util.Arrays;

public class EjercicioParseo {

    public static final int NUM_DATOS_ALUMNO = 4;

    public static double notaMasAlta = 0;

    public static String[][] matrizAlumnosPorCiclo = new String[10][2];
    public static int siguientePosLibre = 0;

    public static void main(String[] args) {

        String[] arrayAlumnos = ficheroAlumnos();

        System.out.println("El dscuento minimo es: " + EjercicioParseoVarGlobales.DESCUENTO_MINIMO);

        mostrarNombres(arrayAlumnos);

        System.out.println("La media d edades es: " + obtenerMediaEdades(arrayAlumnos));

        notaMasAlta = obtenerNotaMaxima(arrayAlumnos);

        imprimirNotaMasAlta();

        rellenarMatrizAlumnosPorCiclo(arrayAlumnos);


        mostrarMatrizAlumnosPorCiclo();



    }

    private static void mostrarMatrizAlumnosPorCiclo() {

        for (int contFila = 0; contFila < matrizAlumnosPorCiclo.length; contFila++) {
            for (int contColumna = 0; contColumna < matrizAlumnosPorCiclo[0].length; contColumna++) {
                System.out.print(matrizAlumnosPorCiclo[contFila][contColumna] + " ") ;
            }
            System.out.println();

        }

    }

    private static void rellenarMatrizAlumnosPorCiclo(String[] arrayAlumnos) {

        //TODO: coger cada línea de los alumnos
        for (int cont = 0; cont < arrayAlumnos.length; cont++) {
            String[] valores = parsearLinea(arrayAlumnos[cont]);
            String cicloFormativo = valores[2];

            int posicionCiclo = buscarCicloEnMatriz(cicloFormativo);
            if(posicionCiclo == -1){
                //no lo he encontrado, tengo que rellenarlo
                matrizAlumnosPorCiclo[siguientePosLibre][0] = cicloFormativo;
                siguientePosLibre++;
            }
        }



        //TODO: parsearla (con parsearLinea)
        //TODO: coger el ciclo al que pertenece el alumno
        //TODO: meterlo en la matriz, o si ya existe, incrementar el número de alumno

    }
    /*
    Busca un ciclo formativo en la matriz grande.
    Si existe, me devuelve la fila donde está
    Si no existe, me devuelve -1
     */
    public static int buscarCicloEnMatriz(String ciclo){

        int filaCiclo = -1;
        for (int contFila = 0; contFila < matrizAlumnosPorCiclo.length; contFila++) {

            String cicloEnMatriz = matrizAlumnosPorCiclo[contFila][0];
            if(cicloEnMatriz != null && cicloEnMatriz.equalsIgnoreCase(ciclo)){
                filaCiclo = contFila;
                break;
            }
        }

        return filaCiclo;
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

    public static void mostrarNombres(String[] alumnos){
        for (int cont = 0; cont < alumnos.length; cont++) {
            String lineaAlumno = alumnos[cont];
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
                "ANA|18|ADM|9.9",
                "RAUL|27|COM|5.8",
                "SOFIA|24|ASIR|7.2",
                "CARLOS|35|COM|6.9",
                "ELENA|20|DAM|8.7",
                "JORGE|29|ASIR|7.0",
                "BEATRIZ|23|DAW|9.4"
        };
        return alumnos;
    }

    public static void imprimirNotaMasAlta(){
        System.out.println("notaMasAlta = " + notaMasAlta);
    }

    public static void mostrarAlumnosPorCiclo(String[] alumnos){

    }

}
