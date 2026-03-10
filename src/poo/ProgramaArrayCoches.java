package poo;

public class ProgramaArrayCoches {

    public static void main(String[] args) {

        //String[] palabras = new String[5];
        Coche[] coches = new Coche[5];

        Coche coche1 = new Coche("Seat", "Leon", "Diesel", 5);
        Coche coche2 = new Coche("Seat", "Ibiza", "Gasolina", 5);
        Coche coche3 = new Coche("Tesla", "V5", "Hibrido", 5);
        Coche coche4 = new Coche("Alfa Romeo", "Polaris", "Gasolina", 5);
        Coche coche5 = new Coche("Volkswagen", "Polo", "Diesel", 5);

        coches[0] = coche1;
        coches[1] = coche2;
        coches[2] = coche3;
        coches[3] = coche4;
        coches[4] = coche5;

        //Muestra todas las marcas de mi catalogo de coches
        for (int cont = 0; cont < coches.length; cont++) {
            Coche unCoche = coches[cont];
            //unCoche.imprimirCoche();
            System.out.println("Marca: " +  unCoche.getMarca());

        }
        System.out.println("A CORRERRRR");

        //Carrera. Poner a conducir todos los coches (invocar a metodo conducir) con un bucle.
        for (int cont = 0; cont < coches.length; cont++) {
            Coche unCoche = coches[cont];
            unCoche.conducir();
        }

        //mostrar informacion de todos los coches con un bucle
        mostrarTodosLosCoches(coches);

        int minimoCombustible = 100;
        int posCocheMenosCombustible = -1;
        for (int cont = 0; cont < coches.length; cont++) {
            Coche unCoche = coches[cont];
            int combustibleRestante = unCoche.getCombustibleRestante();
            if(combustibleRestante < minimoCombustible){
                posCocheMenosCombustible = cont;
                minimoCombustible = combustibleRestante;
            }
        }
        //luego, mostrar por pantalla el coche que tiene menos combustible
        if(posCocheMenosCombustible != -1){
            System.out.println("El coche que menos combustible tiene es: ");
            Coche cocheMenosComb = coches[posCocheMenosCombustible];
            cocheMenosComb.imprimirCoche();
        }
        //TODO: luego, 5 vueltas a conducir. Todo con bucles
        //1er for para las 5 vueltas
            //2do for para iterar el array de coches


        //TODO: crear función que genere 1 coche aleatoriamente. Deberá generar la marca de entre una serie de opciones predefinidas (Seat, Tesla, Volkswagen, Fiat)
        //Se deberá generar con un tipo de combustible de forma aleatoria
        //Cada marca tiene asociados unos modelos:
        /*
        Seat: Ibiza, León, Arona, Ateca
        Tesla: Model 3, Model Y, Model S, Model X
        Volkswagen: Golf, Tiguan, ID.4, T-Roc
        Fiat: 500, Panda, 600, Tipo
         */
        //TODO: generar otro programa que cree un array de 20 coches, y se encargue de generar cada coche del array de forma aleatoria con la función

    }
    public static void mostrarTodosLosCoches(Coche[] coches){

        for (int cont = 0; cont < coches.length; cont++) {
            Coche unCoche = coches[cont];
            unCoche.imprimirCoche();
        }
    }

}
