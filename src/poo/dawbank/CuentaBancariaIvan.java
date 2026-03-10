package poo.dawbank;

public class CuentaBancariaIvan {

    public static final int MAX_IMPORTE_HACIENDA = 3000;
    public static final int MAX_MOVIMIENTOS = 10;
    public static final int MINIMO_SALDO = 50;
    private final String iban;
    private final String titular;
    private double saldo;
    private String[] movimientos;
    //Contar los movimientos realizados
    private int contadorMovimientos;


    public CuentaBancariaIvan(String ibanX, String titularX ) {
        this.iban = ibanX;
        this.titular = titularX;
        this.saldo = 0;
        this.movimientos = new String[MAX_MOVIMIENTOS];
        this.contadorMovimientos = 0;
    }


    public String getIban(){
        return iban;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public String[] getMovimientos(){
        return movimientos;
    }

    public int getContadorMovimientos(){
        return contadorMovimientos;
    }

    public void ingresar(double cantidad){

        if (cantidad > 0){
            if (cantidad > MAX_IMPORTE_HACIENDA){
                System.err.println("AVISO NOTIFICAR A HACIENDA");
            }
            this.saldo += cantidad;
            registrarMovimiento("Ingreso de: " + cantidad + "€");
        }
    }


    public void retiradaDinero (double cantidad){
        if (cantidad <= getSaldo() + MINIMO_SALDO){
            if (cantidad > getSaldo()){
                System.err.println(" AVISO SALDO EN NEGATIVO");
            }
            this.saldo -= cantidad;
            registrarMovimiento("Retirada de: " + cantidad + "€");
        }else{
            System.err.println(" NO SE PUEDE RETIRAR ESA CANTIDAD DE DINERO ");
        }
    }


    public void registrarMovimiento(String movimiento   ){

        if (contadorMovimientos < movimientos.length) {
            movimientos[contadorMovimientos] = movimiento;
            contadorMovimientos++;
        }else{
            for (int contador = 0; contador < movimientos.length - 1; contador++) {
                movimientos[contador] = movimientos[contador + 1];
            }
            movimientos[movimientos.length - 1] = movimiento;
        }


    }
}

