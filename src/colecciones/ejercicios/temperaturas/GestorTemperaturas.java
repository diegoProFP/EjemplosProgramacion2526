package colecciones.ejercicios.temperaturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorTemperaturas {

    private Map<String, List<Integer>> temperaturasPorCiudad = new HashMap<>();

    public void listarCiudadesYTemperaturas(){
        if(temperaturasPorCiudad.isEmpty()){
            System.out.println("No hay registros de temperaturas");
        }else{
            System.out.println("Temperaturas por ciudad: ");

            for(String ciudad: temperaturasPorCiudad.keySet()){
                List<Integer> temperaturas = temperaturasPorCiudad.get(ciudad);
                System.out.println(ciudad + ": " + temperaturas);
            }
        }
    }

    public void insertarNuevaTemperatura(String ciudad, Integer valorTemperatura){

        //Si existe previamente la ciudad, cojo sus temperaturas y añado la nueva
        if(temperaturasPorCiudad.containsKey(ciudad)){
            List<Integer> temperaturas = temperaturasPorCiudad.get(ciudad);
            temperaturas.add(valorTemperatura);
        }else{
            //si no existe, tengo que crear esa lista de temperaturas y meterla en el mapa
            List<Integer> temperaturas = new ArrayList<>();
            temperaturas.add(valorTemperatura);
            temperaturasPorCiudad.put(ciudad, temperaturas);
        }

    }

}
