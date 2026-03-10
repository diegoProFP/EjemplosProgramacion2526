package poo.dawbank;

public class CuentaBancaria {

    public static final int MAX_MOVIMIENTOS = 4;
    public static final int IMPORTE_MAXIMO_HACIENDA = 3000;
    public static final int LIMITE_MINIMO_CUENTA = -50;
    private final String iban;
    private final String nombreCompletoTitular;
    private double saldo;
    private double[] movimientos;
    private int posicionProximoMovimiento = 0;

    public CuentaBancaria(String iban, String nombreCompletoTitular) {
        this.iban = iban;
        this.nombreCompletoTitular = nombreCompletoTitular;
        movimientos = new double[MAX_MOVIMIENTOS];
    }

    public boolean ingresar(double importe){
        if(importe > 0){
            this.saldo += importe;
            registrarMovimiento(importe);
            comprobacionHacienda(importe);
            return true;
        }
        return false;
    }
    public boolean retirar(double importe){
        if(importe > 0){
            if( (this.saldo - importe) < LIMITE_MINIMO_CUENTA){
                System.out.printf("ERROR: Saldo de la cuenta es %f y se quiere retirar %f. Se va a superar mínimo disponible de %d", saldo, importe, LIMITE_MINIMO_CUENTA);
            }else{
                this.saldo -= importe;
                registrarMovimiento( (importe * -1));
                comprobacionHacienda(importe);
                return true;
            }
        }
        return false;
    }

    private void comprobacionHacienda(double importe) {
        if(importe >= IMPORTE_MAXIMO_HACIENDA){
            System.out.println("SE HA SUPERADO EL IMPORTE MÁXIMO PARA HACIENDA (" + IMPORTE_MAXIMO_HACIENDA + "). EMITIENDO AVISO");
        }

    }

    private void registrarMovimiento(double importe) {

        if(posicionProximoMovimiento < MAX_MOVIMIENTOS){
            movimientos[posicionProximoMovimiento] = importe;
            posicionProximoMovimiento++;
        }else{
            desplazarMovimientos();
            movimientos[movimientos.length - 1] = importe;
        }

    }

    public void mostrarMovimientos(){
        System.out.println("** MOSTRANDO MOVIMIENTOS (del más reciente al más antiguo)");
        int posicionInicio;
        if(posicionProximoMovimiento != movimientos.length){
            posicionInicio = posicionProximoMovimiento;
        }else{
            posicionInicio = movimientos.length;
        }

        for(int pos = posicionInicio-1; pos >= 0; pos--){
            System.out.println(movimientos[pos] + "€");
        }
    }

    private void desplazarMovimientos() {
        for(int cont = 0; cont < movimientos.length-1; cont++){
            movimientos[cont] = movimientos[cont + 1];
        }

    }

    public void imprimirCuentaBancaria(){
        System.out.println("*** INFO CUENTA BANCARIA ***");
        System.out.println("IBAN: " + iban);
        System.out.println("Titular: " + nombreCompletoTitular);
        System.out.println("Saldo: " + saldo);

    }

    public String getIban() {
        return iban;
    }

    public String getNombreCompletoTitular() {
        return nombreCompletoTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}
