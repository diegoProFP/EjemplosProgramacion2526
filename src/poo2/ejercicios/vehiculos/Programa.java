package poo2.ejercicios.vehiculos;

public class Programa {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Coche("1234ABC", "Seat Leon", 4, true),
                new Coche("5678DEF", "Toyota Corolla", 4, false),
                new Moto("4321ZYX", "Yamaha MT-07", 2, "Azul"),
                new Moto("8765QWE", "Honda CB500F", 2, "Roja"),
                new Barco("OCEANO", "Beneteau", 12.5, true),
                new Barco("VELERO", "Sun Odyssey", 9.8, false),
                new Submarino("NEMO", "Deep Explorer", 18.0, 350.0),
                new Submarino("TRITON", "Abyss 200", 22.4, 500.0),
                new Avion("IBER123456", "Airbus A320", 180, 6.5),
                new Avion("VOLO654321", "Boeing 737", 189, 7.0),
                new Helicoptero("HELI112233", "Airbus H145", 10, 4),
                new Helicoptero("ARES445566", "Bell 412", 13, 4),
                new VehiculoTerrestre("1111BBB", "Vehiculo terrestre generico", 6),
                new VehiculoAcuatico("MARINO", "Vehiculo acuatico generico", 15.2),
                new VehiculoAereo("AERO123456", "Vehiculo aereo generico", 24)
        };

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.imprimir();
        }
    }
}
