package poo2.ejercicios.empresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void calcularSueldoNetoMensualTramoBajo() {

        Empleado emp1 = new Empleado("Diego", "1212", 800);

        double sueldoNetoEmp = emp1.calcularSueldoNetoMensual();
        assertEquals(640, sueldoNetoEmp);
    }
    @Test
    void calcularSueldoNetoMensualTramoMedio() {

        Empleado emp1 = new Empleado("Diego", "1212", 1000);

        double sueldoNetoEmp = emp1.calcularSueldoNetoMensual();
        assertEquals(700, sueldoNetoEmp);
    }

    @Test
    void calcularSueldoNetoMensualTramoAlto() {

        Empleado emp1 = new Empleado("Diego", "1212", 2500);

        double sueldoNetoEmp = emp1.calcularSueldoNetoMensual();
        assertEquals(1500, sueldoNetoEmp);
    }
}