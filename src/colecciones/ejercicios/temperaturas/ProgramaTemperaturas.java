package colecciones.ejercicios.temperaturas;

public class ProgramaTemperaturas {

    public static void main(String[] args) {

        GestorTemperaturas gestor = new GestorTemperaturas();
        gestor.insertarNuevaTemperatura("Madrid", 15);
        gestor.insertarNuevaTemperatura("Madrid", 19);
        gestor.insertarNuevaTemperatura("Lugo", 11);

        gestor.listarCiudadesYTemperaturas();
    }
}
