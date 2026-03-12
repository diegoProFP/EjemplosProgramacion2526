package poo2.ejercicios.empresa;

public class Programa {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("DAW Studios", "B12345678");

        empresa.anyadirEmpleado(new Empleado("EmpA", "1234A", 800));
        empresa.anyadirEmpleado(new Empleado("EmpB", "1234B", 1500));
        empresa.anyadirEmpleado(new Empleado("EmpC", "1234C", 2500));

        empresa.mostrarDniSueldoBrutoYNeto();

        System.out.println("Suma sueldos brutos: " + empresa.calcularSumaSueldosBrutos());
        System.out.println("Suma sueldos netos: " + empresa.calcularSumaSueldosNetos());

        empresa.setFacturacion(50_000);

        System.out.println("La declaracion de la empresa es: " + empresa.declarar());

    }
}
