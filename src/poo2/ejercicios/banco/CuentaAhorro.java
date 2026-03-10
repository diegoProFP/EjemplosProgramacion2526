package poo2.ejercicios.banco;

public class CuentaAhorro extends CuentaBancaria{

    public static final double SALDO_MINIMO = 3000.0;
    public static final double MINIMA_ANTIGUEDAD_RETIRO = 24;

    private int mesesAntiguedadCuenta;


    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    public CuentaAhorro(String iban, double saldo, int mesesAntiguedadCuenta) {
        super(iban, saldo);
        this.mesesAntiguedadCuenta = mesesAntiguedadCuenta;
    }

    /**
     * Sólo se va a poder retirar si la antiguedad de la cuenta de ahorro s SUPERIOR a la minima
     * @param cantidad
     * @return
     */
    @Override
    public boolean retirarDinero(double cantidad) {

        if(mesesAntiguedadCuenta >= MINIMA_ANTIGUEDAD_RETIRO){
            return super.retirarDinero(cantidad);
        }else{
            System.out.println("Antigüedad: " + mesesAntiguedadCuenta + ". Imposible retirar. No se tiene una antiguedad superior a " + MINIMA_ANTIGUEDAD_RETIRO);
            return false;
        }

    }

    @Override
    protected double calcularIntereses() {
        double intereses = 0;
        if(saldo < SALDO_MINIMO){
            intereses = (CuentaBancaria.INTERES_ANUAL_BASICO / 2) * saldo;
        }else{
            intereses = (CuentaBancaria.INTERES_ANUAL_BASICO * 2) * saldo;
        }
        this.saldo += intereses;

        return intereses;
    }




}
