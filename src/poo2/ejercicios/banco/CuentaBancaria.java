package poo2.ejercicios.banco;

public abstract class CuentaBancaria {

    protected String iban;
    protected double saldo;
    public static final double INTERES_ANUAL_BASICO = 0.02;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public void mostrarInfoCuenta(){
        System.out.println("IBAN: " + iban + " | SALDO :" + saldo);
    }

    public boolean ingresarDinero(double cantidad){
        añadir(cantidad);
        return true;
    }
    public boolean retirarDinero(double cantidad){
        if( (this.saldo - cantidad) <= 0){
            System.out.println("No se puede retirar la cantidad " + cantidad + ", la cuenta quedaria negativa");
            return false;
        }
        añadir(cantidad * -1);
        return true;
    }

    public boolean traspasarDinero(CuentaBancaria otra, double cantidad){
        //TODO
        return false;
    }

    protected abstract double calcularIntereses();

    private void añadir(double cantidad){
        this.saldo += cantidad;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }


}
