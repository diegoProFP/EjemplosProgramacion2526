package examen.ut2;

import java.util.Scanner;

/**
 Desarrolla un programa que registre la carga de trabajo diaria de distintos servidores de un centro de
 datos. Se deberá solicitar al usuario el nombre del servidor, el uso medio de CPU (en %) y el uso medio de
 RAM (en %) de cada servidor, todos los datos en la misma línea separados por un espacio. Los nombres de
 los servidores no deben contener espacios.
 A partir de esos datos, el programa calculará un Índice de Carga Total (ICT) para cada servidor usando la
 siguiente fórmula:
 Índice=CPU +(RAM/100)×10
 donde:
 • CPU es el uso medio de CPU en tanto por ciento (valor decimal).
 • RAM es el uso medio de RAM en tanto por ciento (valor decimal).
 Según el valor del índice, clasifica la carga del servidor en:
 • Baja carga: Índice < 25
 • Carga media: 25 ≤ Índice < 35
 • Carga alta: Índice ≥ 35
 Una vez calculados todos los ICT a partir de los datos recogidos, el programa debe terminar escribiendo en
 pantalla un mensaje indicando el nombre del servidor y la clasificación de carga (Baja carga, Carga media,
 Carga alta), en base a la lógica anterior.

 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("*** MONITORIZACIÓN DE SERVIDORES ***");

		System.out.print("¿Cuántos servidores registramos? ");
		int numServidores = teclado.nextInt();
		teclado.nextLine(); // Limpiar buffer

		String[] nombresServidores = new String[numServidores];
		double[] indiceCarga = new double[numServidores];
		String[] clasificaciones = new String[numServidores];

		// Recoger datos de los servidores y calcular ICT
		for (int cont = 0; cont < numServidores; cont++) {
			System.out.println("- INTRODUCE DATOS DEL SERVIDOR " + (cont + 1));

			// Extraer datos
			String nombreServidor = teclado.nextLine();
			double cpu = teclado.nextDouble();
			double ram = teclado.nextDouble();
			teclado.nextLine();

			// Calcular ICT
			double ict = cpu + (ram / 100) * 10;
			nombresServidores[cont] = nombreServidor;
			indiceCarga[cont] = ict;

			// Clasificar carga del servidor
			if (ict < 25) {
				clasificaciones[cont] = "Baja carga";
			} else if (ict < 35) {
				clasificaciones[cont] = "Carga media";
			} else {
				clasificaciones[cont] = "Carga alta";
			}
		}

		// Mostrar resultados
		System.out.println("***** RESULTADO *****");
		for (int cont = 0; cont < numServidores; cont++) {

			//System.out.printf("%s: %s %n", nombresServidores[cont], clasificaciones[cont]);
            System.out.println(nombresServidores[cont] + " : " + clasificaciones[cont]);
		}

		teclado.close();
	}
}
