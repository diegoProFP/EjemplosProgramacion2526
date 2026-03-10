package bucles.ejerciciostema2;

import java.util.Scanner;

/*
Se desea conocer el sueldo de N empleados cuyo pago es por hora y del modo siguiente;
    • Las horas menores o igual a 20 se pagan a una tarifa de 12€/hora.
    • Las horas mayores de 20 y menor de 30 se pagan a una tarifa de 15€/hora.
    • Las horas mayores de 30 se pagan a una tarifa de 25€/hora.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        final int TARIFA_BASICA = 12;
        final int TARIFA_INTERMEDIA = 15;
        final int TARIFA_ALTA = 25;
        int sueldoEmpleado = 0;

        int a = 5;
        int b = 2;
        b*=a;
        System.out.println(b++);

        float num= 10/3;
        System.out.println(num);


        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime horas y te digo el sueldo");
        int horas = teclado.nextInt();

        if(horas > 20){
            sueldoEmpleado += (20 * TARIFA_BASICA);
            if(horas < 30){
                sueldoEmpleado += (horas - 20) * TARIFA_INTERMEDIA;
            }else{
                sueldoEmpleado += 10 * TARIFA_INTERMEDIA;
                sueldoEmpleado += (horas - 30) * TARIFA_ALTA;
            }
        }else{
            sueldoEmpleado += horas * TARIFA_BASICA;
        }
        System.out.println("Sueldo empleado: " + sueldoEmpleado);

    }
}
