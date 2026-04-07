package arrays;

import java.util.Arrays;
/*

   private String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
    private String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q", "K"};

 public void mostrarEstadisticas(){
        Map<String, Integer> numCartasPorPalo = new HashMap<>();
        for(Carta cartita :  baraja){
            String palo = cartita.getPalo();
            if(numCartasPorPalo.containsKey(palo)){
                Integer totalCartasPalo = numCartasPorPalo.get(palo);
                totalCartasPalo++;
            }else{
                numCartasPorPalo.put(palo, 1);
            }
        }


    }
 */
public class EjemploClaseArrays {

    public static void main(String[] args) {

        int valores[] = new int[23];
        Arrays.fill(valores,-1); // Almacena -1 en todo el array ‘valores

        String arrayEnString = Arrays.toString(valores);
        System.out.println(arrayEnString);
        //TODO: ¿cómo rellenar a -1 una matriz de 3x2?? --> miradlo

        //Prueba Arrays.equals
        int[] array1 = new int[]{2,3,4,5,6};
        int[] array2 = new int[]{8,191,4242,6,3,44,2, -54};
        boolean arraysIguales = Arrays.equals(array1, array2);
        System.out.println("¿Son iguales?: " + arraysIguales);


        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        //Búsqueda de elementos sobre array ordenado
        int indiceBuscado = Arrays.binarySearch(array2, 9);
        if(indiceBuscado >= 0){
            System.out.println("El número 191 está en la posicion: " + indiceBuscado);
        }else{
            System.out.println("No existe el num 191 en el array");
        }



    }
}
