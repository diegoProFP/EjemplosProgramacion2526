package poo2.interfaces.pagables;

public interface Pagable {

    /**
     * Calcula el importe de un elemento pagable
     * @return El importe total
     */
    double calcularImporte();

    String generarTicket();


}
