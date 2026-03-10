package bucles.ejerciciostema2;

import java.util.Scanner;

public class Ejercicio5Alejandro {

    public static void main(String[] args) {

        final int tarifa_basica = 12;
        final int tarifa_intermedia = 15;
        final int tarifa_alta = 25;
        int sueldoEmpleado = 0;
        int horasExtra = 0;
        Scanner teclado = new Scanner(
                System.in
        );
        int horas = teclado.nextInt();
        if (horas <= 20){
            sueldoEmpleado += horas * tarifa_basica;
        }else if (horas > 20) {
            horasExtra = (horas - 20) * tarifa_intermedia;
            sueldoEmpleado += (20 * tarifa_basica) + horasExtra;
        }else if (horas > 30){
            horasExtra = (10 * tarifa_intermedia) + ((horas - 30) * tarifa_alta );
            sueldoEmpleado += (20 * tarifa_basica) + horasExtra;
        }
        System.out.println("Sueldo empleado: " + sueldoEmpleado);
    }
}
