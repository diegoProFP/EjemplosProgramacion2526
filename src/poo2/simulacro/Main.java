package poo2.simulacro;

import poo2.simulacro.modelo.Coordinador;
import poo2.simulacro.modelo.Empresa;
import poo2.simulacro.modelo.Tecnico;
import poo2.simulacro.modelo.Vendedor;

public class Main {

    public static void main(String[] args) {

        Tecnico tecnico1 = new Tecnico(1, "Ana Torres");
        Tecnico tecnico2 = new Tecnico(2, "Luis Martín");

        Vendedor vendedor1 = new Vendedor(3, "Marta Gómez");
        Vendedor vendedor2 = new Vendedor(4, "Pablo Ruiz");

        Coordinador coordinador = new Coordinador(5, "Sara López");

        coordinador.aniadirEmpleadoACargo(tecnico1);
        coordinador.aniadirEmpleadoACargo(tecnico2);
        coordinador.aniadirEmpleadoACargo(vendedor1);
        coordinador.aniadirEmpleadoACargo(vendedor2);

        Empresa empresa = new Empresa("TecnoServicios");

        empresa.aniadirEmpleado(tecnico1);
        empresa.aniadirEmpleado(tecnico2);
        empresa.aniadirEmpleado(vendedor1);
        empresa.aniadirEmpleado(vendedor2);
        empresa.aniadirEmpleado(coordinador);

        empresa.setCoordinador(coordinador);

        empresa.mostrarEmpleados();

        empresa.recibirTrabajo("venta de portátil", 500, 2);
        empresa.recibirTrabajo("arreglar impresora", 120, 3);
        empresa.recibirTrabajo("venta de monitor", 200, 4);
        empresa.recibirTrabajo("arreglar servidor", 700, 5);

        empresa.mostrarFacturacion();
        empresa.mostrarTotalNominas();
    }
}

