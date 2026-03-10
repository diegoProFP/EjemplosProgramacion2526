package poo2.ejercicios.banco;

public class CuentaCorriente extends CuentaBancaria{

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    protected double calcularIntereses() {

        double intereses = saldo * CuentaBancaria.INTERES_ANUAL_BASICO;

        saldo += intereses;

        return intereses;
    }


}
