package poo2.ejercicios.banco;

public class ProgramaCuentas {

    public static void main(String[] args) {


        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("ES1234", 0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("ES9999", 5000);

        cuentaCorriente1.ingresarDinero(500);
        cuentaCorriente1.ingresarDinero(700);
        cuentaCorriente1.mostrarInfoCuenta();

        System.out.println("Se van a calcular los intereses de la cuenta corriente. Son: " + cuentaCorriente1.calcularIntereses());

        cuentaCorriente1.mostrarInfoCuenta();

        System.out.println("---------------------");

        cuentaAhorro.ingresarDinero(1000);
        cuentaAhorro.mostrarInfoCuenta();

        System.out.println("Se van a calcular los interses de la cuenta de ahorro. Son: " + cuentaAhorro.calcularIntereses());
        cuentaAhorro.mostrarInfoCuenta();

        //cuentaCorriente1.retirarDinero(1000);

        System.out.println("-------------");

        CuentaAhorro cuentaAhorroMeses = new CuentaAhorro("ES8888", 2000, 10);

        cuentaAhorroMeses.retirarDinero(100);

        cuentaAhorroMeses.mostrarInfoCuenta();


    }
}
