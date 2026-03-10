package poo;

import java.util.Random;

public class Coche {

    //Atributos
   private String marca;
   private String modelo;
   private int numRuedas;
   private String tipoCombustible;
   private int numPuertas;
   private int kmRecorridos;
   private int combustibleRestante;
   private double consumo;

   /*
   Constructor con valores iniciales
    */
    public Coche(){
        combustibleRestante = 100;
        tipoCombustible = "ninguno";
        numPuertas = 5;
        numRuedas = 4;
        consumo = generarValorConsumo();
    }

    public Coche(String marcaInicial,
                 String modeloInicial,
                 String tipoCombustibleInicial,
                 int numPuertasInicial){
        marca = marcaInicial;
        modelo = modeloInicial;
        tipoCombustible = tipoCombustibleInicial;
        numPuertas = numPuertasInicial;
        combustibleRestante = 100;
        numRuedas = 4;
        consumo = generarValorConsumo();
    }

    private double generarValorConsumo(){
        Random aleatorios = new Random();
        return aleatorios.nextDouble(1, 100);
    }
    //Métodos
    public void conducir(){
        System.out.println("BRUUUMMM");

        int litrosAQuemar = litrosConsumidos();
        System.out.println("Se van a consumir " + litrosAQuemar + " litros");
        combustibleRestante -= litrosAQuemar;
        kmRecorridos += 5;
    }

    /*
    Este metodo devuelve cuánto consume de combustible el coche
    según su tipo de combustible y según su consumo
    La regla es:
    - Si es diesel, consumo * 0.5
    - Si es hibrido, consumo * 0.01
    - En cualquier otro caso, consumo * 0.1
     */
    private int litrosConsumidos(){
        int cantidadConsumida = 0;
        if(tipoCombustible.equalsIgnoreCase("diesel")){
            cantidadConsumida = (int) (consumo * 0.5);
        }else if(tipoCombustible.equalsIgnoreCase("hibrido")) {
            cantidadConsumida = (int) (consumo * 0.01);
        }else{
            cantidadConsumida = (int) (consumo * 0.1);
        }
        return cantidadConsumida;
    }


    public void imprimirCoche(){

        System.out.println("*** DATOS DEL COCHE ***");
        System.out.println("\t Marca = " + marca);
        System.out.println("\t Modelo = " + modelo);
        System.out.println("\t Numero ruedas = " + numRuedas);
        System.out.println("\t Numero puertas = " + numPuertas);
        System.out.println("\t Combustible restante = " + combustibleRestante);
        System.out.println("\t Tipo de combustible = " + tipoCombustible);
        System.out.println("\t KM recorridos = " + kmRecorridos);

    }

    public static Coche generarCocheAleatorio(){
        //generará un coche con marca, modelo aleatorios
        String marcaAleatoria = generarMarcaAleatoria();
        String modeloAleatorio = generarModeloAleatorio(marcaAleatoria);
        String[] combustibles = {"Diesel", "Gasolina", "Hibrido"};

        return new Coche(marcaAleatoria, modeloAleatorio, combustibles[numeroAleatorio(3)], 5);

    }
    private static String generarMarcaAleatoria(){
        String[] marcas = {"Seat", "Tesla", "Volkswagen", "Fiat"};
        return marcas[numeroAleatorio(4)];
    }
    private static String generarModeloAleatorio(String marca){

        //deberia devolver de forma aleatoria un modelo de esa marca
        String[] modelos = modelosDeMarca(marca);
        return modelos[numeroAleatorio(4)];
    }

    private static int numeroAleatorio(int limiteInclusive){
        Random aleatorio = new Random();
        return  aleatorio.nextInt(limiteInclusive);
    }

    public static String[] modelosDeMarca(String marca){
        String[] modelos= new String[4];

        switch (marca.toUpperCase()){
            case "SEAT":
                modelos[0] = "Ibiza";
                modelos[1] = "León";
                modelos[2] = "Arona";
                modelos[3] = "Ateca";
                break;
            case "TESLA":
                modelos[0] = "Model 3";
                modelos[1] = "Model Y";
                modelos[2] = "Model S";
                modelos[3] = "Model X";
               break;
               //TODO PONER RESTO DE MODELOS

        }

        return modelos;
    }

    /**
     * Obtiene el valor del atributo marca
     * @return Devuelve la marca
     */
    public String getMarca(){
        return marca;
    }

    /**
     * Asigna un nuevo valor a la marca
     * @param nuevaMarca El valor de marca que se va a asignar
     */
    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }

    public int getKmRecorridos(){
        return kmRecorridos;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String nuevoModelo){
            if(nuevoModelo.length() <= 2){
                System.out.println("Modelo no válido");
            }else{
                modelo = nuevoModelo;
            }
    }

    public int getNumRuedas(){
        return numRuedas;
    }
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public int getNumPuertas(){
        return numPuertas;
    }
    public int getCombustibleRestante(){
        return combustibleRestante;
    }



}
