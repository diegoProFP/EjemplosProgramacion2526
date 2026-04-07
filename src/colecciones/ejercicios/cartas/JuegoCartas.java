package colecciones.ejercicios.cartas;

import java.util.*;

public class JuegoCartas {

    private String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
    private String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q", "K"};

    private List<Carta> baraja = new ArrayList<>();
    private Set<Carta> manoJugador = new HashSet<>();


    public void inicializarBaraja(){
        for(String palo : palos){
            for(String valor: valores){
                baraja.add(new Carta(palo, valor));
            }
        }
    }

    public void barajar(){
        Collections.shuffle(baraja);
    }

    public void robarCarta(){
        if(baraja.isEmpty()){
            System.out.println("No hay más cartas en la baraja");
        }else{
            //sacar carta aleatoria
            Carta aleatoria = obtenerCartaAleatoria();
            if(manoJugador.add(aleatoria)) {
                System.out.println("Has robado: " + aleatoria);
            }else{
                System.out.println("La carta ya estaba en la mano. ");
                baraja.add(aleatoria); //volvemos a meter la carta en el mazo
            }
        }
    }

    public void verMano(){
        System.out.println("Mano del jugador: ");
        for (Carta carta : manoJugador){
            System.out.println(" - " + carta);
        }
    }

    public void verCartasRestantes(){
        System.out.println("Cartas restantes en la baraja: " + baraja.size());
    }

    public void descartarCarta(int posicion){
        if(manoJugador.isEmpty()){
            System.out.println("No tienes cartas para descartarte");
        }else{
            if(posicion <= manoJugador.size() && posicion >= 1){
                int cont=1;
                Carta buscada = null;
                for(Carta carta: manoJugador){
                    if(cont == posicion){
                        buscada = carta;
                        break;
                    }
                    cont++;
                }
                manoJugador.remove(buscada);
                baraja.add(buscada);
                System.out.println("Se ha devuelto al mazo la carta" + buscada);

            }else{
                System.out.println("Ese número de carta no es válida");
            }
        }
    }

    /**
     * Coge una carta aleatoria de la baraja y la devuelve
     * @return la carta elegida aleatoriamente
     */
    private Carta obtenerCartaAleatoria(){
        int tamanyo = baraja.size();
        Random aleatorios = new Random();
        int posicionAleatoria = aleatorios.nextInt(0, tamanyo);
        return baraja.remove(posicionAleatoria);
    }

    public void mostrarEstadisticas(){
        Map<String, Integer> numCartasPorPalo = new HashMap<>();
        for(Carta cartita :  baraja){
            String palo = cartita.getPalo();
            if(numCartasPorPalo.containsKey(palo)){
                Integer totalCartasPalo = numCartasPorPalo.get(palo);
                totalCartasPalo++;
                numCartasPorPalo.put(palo, totalCartasPalo);
            }else{
                numCartasPorPalo.put(palo, 1);
            }
        }

        //Recorrer el mapa de forma normal
        for(String palo: numCartasPorPalo.keySet()){
            Integer numCartas = numCartasPorPalo.get(palo);
            System.out.println(palo + ": " + numCartas);
        }


    }






}
