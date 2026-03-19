package colecciones;

import poo2.simulacro.modelo.Coordinador;
import poo2.simulacro.modelo.Empleado;
import poo2.simulacro.modelo.Tecnico;
import poo2.simulacro.modelo.Vendedor;

import java.util.ArrayList;

public class EjemploArrayListObjetos {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Tecnico("1", "Manolo"));
        empleados.add(new Tecnico("2", "Benito"));
        empleados.add(new Vendedor("3", "Warren"));
        empleados.add(new Coordinador("4", "Jeff"));

        //Forma nº1 de recorrer listas
        System.out.println("Cogemos de 2 en 2");
        for(int cont = 0; cont < empleados.size(); cont++){
            Empleado emp = empleados.get(cont);//empleados[cont]
            System.out.println("ID: " + emp.getId() + " | Nombre: " + emp.getNombreCompleto());
        }
        System.out.println("Ahora normal...");
        //Forma n2º de recorrer listas
        int contEmpleado = 0;
        for (Empleado emp : empleados) {
             System.out.println("ID: " + emp.getId() + " | Nombre: " + emp.getNombreCompleto());
        }

        System.out.println("La lista contiene al empleado 1 Manolo? "+ empleados.contains(new Tecnico("1", "Manolo")));



    }
}
