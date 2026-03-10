package funciones.ejercicios;

import java.util.Scanner;

/**
 * Queremos pedir al usuario un nº de productos a introducir. Con cada producto, se le pedirá nombre y precio. Se deberán almacenar en algún sitio.
 * Una vez hecho esto, hay que obtener el precio con IVA de cada producto, utilizando la función:
 * double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 * La salida del programa deberá mostrar la siguiente información de cada producto:
 * Nombre de producto | Precio normal | Precio con IVA (toda la info del producto en 1 sola línea)
 * Además, deberemos realizar la media de precios con IVA de los productos y mostrarlo por pantalla.
 * Finalmente, mostrar cuál es el producto más caro. De esta manera:
  El producto más caro es el XXXX, con un precio con IVA de YYYY (siendo XXXX el nombre del producto e YYYY el precio con IVA).
 * BONUS: La utilidad de calcular el producto más caro deberá realizarse en una función, que recibirá la información que sea posible para ello.
 */
public class Ejercicio6Extension {

    //Declaracion de una constante del fichero/clase
    public static final double IVA = 21;

    public static void main(String[] args) {

        System.out.println(redondeo2Decimales(52.36987234100023412));

        // Queremos pedir al usuario un nº de productos a introducir. Con cada producto, se le pedirá nombre y precio. Se deberán almacenar en algún sitio.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuántos productos hacemos. Le aplicaré el IVA del " + IVA);
        int numProductos = teclado.nextInt();
        teclado.nextLine();
        String[] nombresProducto = new String[numProductos];
        double[] preciosProducto = new double[numProductos];
        double[] preciosConIva = new double[numProductos];
        for (int cont = 0; cont < numProductos; cont++) {
            System.out.println("Ok, el producto num " + (cont+1) + ". Dime nombre y precio");
            String nombreProducto = teclado.nextLine();
            double precioProducto = teclado.nextDouble();
            teclado.nextLine();

            nombresProducto[cont] = nombreProducto.trim();
            preciosProducto[cont] = precioProducto;

        }

        //VIENE EL DESCUENTASO!
        descontarPrecios(nombresProducto, preciosProducto);
        /*

        2 funciones separadas:
        TODO: hacemos una funcion que reciba el array de precios,
        y a cada precio le aplica un descuento del 5%

        TODO2: lo de antes PERO en vez de 5%, que el descuento sea igual a la longitud
        del nombre de cada producto. Por ejemplo: iPhone tiene un 6% de descuento. Colonia tiene un 7% de descuento....
        */


        mostrarValores(nombresProducto);

        double sumaTotalPreciosIva = 0;
        //Recorro los productos para calcular el precio con IVA de cada uno
        for (int cont = 0; cont < preciosProducto.length; cont++) {
            //Invoco a la funcion de "precioConIva" y le paso por param el precio extraido del array
            preciosConIva[cont] = precioConIVA(preciosProducto[cont]);
            sumaTotalPreciosIva += preciosConIva[cont];
        }

        System.out.println(" **** INFORMACIÓN COMPLETA DE PRODUCTOS **** ");
        System.out.println();
        //Mostrar la información completa de los productos
        mostrarTodosLosProductos(nombresProducto, preciosProducto, preciosConIva);


    }

    /*
    Recibe una colección de precios y los altera aplicándoles un descuento del 5%
     */
    public static void descontarPrecios(double[] precios){

        final double descuento = 5.0f;
        for (int cont = 0; cont < precios.length; cont++) {
            double precioProducto = precios[cont];
            precios[cont] = aplicarDescuento(precioProducto, descuento);
        }
    }
    public static void descontarPrecios(String[] nombres, double[] precios){

        double descuento = 0;
        for (int cont = 0; cont < precios.length; cont++) {
            double precioProducto = precios[cont];
            String nombreProducto = nombres[cont];
            descuento = nombreProducto.length();
            precios[cont] = aplicarDescuento(precioProducto, descuento);
        }
    }

    public static double aplicarDescuento(double precio, double descuento){
        return precio - (precio * descuento/100);
    }


    public static void mostrarTodosLosProductos(String[] nombres, double[] precios, double[] preciosIva) {

        for (int cont = 0; cont < nombres.length; cont++) {
            String nombre = nombres[cont];
            double precioNormal = precios[cont];
            double precioIva = preciosIva[cont];

            //los precios estén redondeados a 2 decimales
            precioNormal = redondeo2Decimales(precioNormal);
            precioIva = redondeo2Decimales(precioIva);

            mostrarInfoProducto(nombre, precioNormal, precioIva);
        }
    }

    public static void mostrarInfoProducto(String nombreProducto, double precioNormal, double precioIva){

        System.out.printf("Producto: %s | Precio: %f € | PrecioIVA: %f € \n", nombreProducto, precioNormal, precioIva);

    }

    public static double redondeo2Decimales(double precio){

        //1º muevo la coma 2 posiciones a la derecha (*100)
        precio = precio * 100;
        //2º redondeo/trunco
        precio = Math.round(precio);
        //3º volver la coma hacia atrás 2 posiciones (/100)
        precio = precio / 100;

        return precio;
    }

    public static double precioConIVA(double precio){

        return precio *  (IVA/100) + precio;
    }

    public static void mostrarValores(String[] array){

        for(int cont = 0; cont < array.length; cont++){
            System.out.println("Valor: " + array[cont]);
        }
    }

}








