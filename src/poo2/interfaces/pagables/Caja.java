package poo2.interfaces.pagables;

public class Caja {

    public static void main(String[] args) {

        Pagable[] carrito = new Pagable[4];
        carrito[0] = new Factura(100, 0.21);
        carrito[1] = new Suscripcion(9.99, 3);
        carrito[2] = new EntradaCine("Michael Jackson", 2, 9.99, false, true);
        carrito[3] = new FacturaProforma(200, 0.21, "B23123423");

        double total = 0;
        for (int cont = 0; cont < carrito.length; cont++) {
            Pagable elementoPagable = carrito[cont];

            total += elementoPagable.calcularImporte();

            //Si el elemento además implementa la interfaz Imprimible,
            //lo "casteamos" e invocamos el metodo imprimir
            if(elementoPagable instanceof Imprimible elementoImprimible){
                elementoImprimible.imprimir();
            }

            //OLD
//            System.out.println(elementoPagable.generarTicket());
//            //Esto comprueba si el objeto es una instancia concreta de la clase Factura
//            if(elementoPagable instanceof Factura){
//                Factura facturita = (Factura) elementoPagable;
//                System.out.println("El IVa aplicado es: " + facturita.getIva()*100 + "%");
//
//            }
        }

        System.out.println("TOTAL CARRITO: " + total);
    }
}
