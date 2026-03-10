package poo2.interfaces.pagables;

//Una clase (padre o no) puede implementar 0 o varias interfaces
//Una clase hija hereda las implementaciones de su padre
//Una clase que implementa una interfaz, ESTÁ OBLIGADA A IMPLEMENTAR los métodos
    //pero se salva si se declara abstracta (porque si es abstracta, nunca se va a instanciar)


public class FacturaProforma extends Factura{

    private String cifCliente;

    public FacturaProforma(double base, double iva, String cifCliente) {
        super(base, iva);
        this.cifCliente = cifCliente;
    }

    @Override
    public void imprimir() {
        System.out.println("*************");
        System.out.println("FACTURA PROFORMA: ");
        System.out.println("Cif Cliente: " + cifCliente);
        super.imprimir();
    }
}
