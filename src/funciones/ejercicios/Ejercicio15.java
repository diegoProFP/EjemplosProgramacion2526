package funciones.ejercicios;

/**
 * Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
 * Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
 * array y otra que calcule la media de un array
 */
public class Ejercicio15 {
    public static void main(String[] args) {

        //invocar a funcion que me devuelva un array de 100 posiciones con los 100 nºos naturales
        int[] numeros = crearArrayConNumeros(12);

        mostrarValoresArray(numeros);

        //invocar a funcion que le paso el array y me devuelve la suma de sus elementos
        System.out.println();
        int suma = sumarElementos(numeros);
        System.out.println("La suma es: " + suma);

        //invocar a funcion que le paso el array y me devuelve la media de los nºos
        System.out.println("La media de los numeros es: " + mediaDeNumeros(numeros) );
    }

    private static int sumarElementos(int[] numeros) {
        int sumaTotal = 0;
        for (int cont = 0; cont < numeros.length; cont++) {
            sumaTotal += numeros[cont];
        }
        return sumaTotal;
    }

    /**
     * Crear array con una longitud. Rellenará valores desde el 1 hasta el valor de longitud
     * @param longitud La longitud del array a crear
     * @return
     */
    public static int[] crearArrayConNumeros(int longitud){
        if(longitud <= 0){
            System.out.println("No es posible crear arrays con longitud 0 o negativa");
            return null;
        }

        int[] arrayNumeros = new int[longitud];
        for (int num = 0; num < longitud; num++) {
            arrayNumeros[num] = (num+1);
        }

        return arrayNumeros;
    }
    public static void mostrarValoresArray(int[] array){
        if(array != null){
            System.out.println("Contenido del array:");
            for (int cont = 0; cont < array.length; cont++) {
                System.out.print(array[cont] + " ");
            }
        }
    }
    public static float mediaDeNumeros(int[] numeros){

        float media = 0;
        if(numeros != null){
            int suma = sumarElementos(numeros);
            media = (float)suma / numeros.length;
        }

        return media;
    }

}
