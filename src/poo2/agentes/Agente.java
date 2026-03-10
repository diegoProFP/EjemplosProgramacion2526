package poo2.agentes;

import java.util.Random;

public abstract class Agente {

    protected final String nombre;
    protected boolean misionCompletada;
    protected String especialidadAgente;


    public Agente(String nombre){
        this.nombre = nombre;
    }

    public final void ejecutarMision(String objetivo){
        System.out.println("**** " + nombre + " inicia misión con objetivo: " + objetivo + " ****");

        //llamar a metodos abstractos
        accionPrincipal(objetivo);
        retirada(objetivo);

        System.out.println("**** " + nombre + " termina su misión ");
    }

    /**
     * Imprime por pantalla que el agente va a realizar su acción.
     * Calcula un número aleatorio entre 1 y 100, y si es mayor a 65, su parte de la misión se considera completada.
     *
     * @param objetivo El nombre del objetivo que tiene que cumplir el agente
     */
    public final void accionPrincipal(String objetivo) {

        System.out.println("Soy un tipo de agente " + obtenerTipoAgente() + "  el agente " + nombre + ", procedo a hacer lo mío para el objetivo " + objetivo);

        resolverExito();
    }

    /**
     * Obtiene el tipo concreto de agente .Es abstracto para que cada hijo implemente su propia versión
     * @return
     */
    public abstract String obtenerTipoAgente();

    private void resolverExito() {
        //generar aleatorio 1-100, y si >= probabilidad, se considera exitoso
        Random aleatorios = new Random();
        if(aleatorios.nextInt(1,101) >= probabilidadExito()){
            this.misionCompletada = true;
        }else{
            this.misionCompletada = false;
        }
    }

    public abstract double probabilidadExito();


    /**
     * Sólo imprime por pantalla que el agente con nombre XX se va a retirar, y dirá si ha completado la misión o no
     * @param objetivo
     */
    public abstract void retirada(String objetivo);


    public String getNombre() {
        return nombre;
    }

    public boolean isMisionCompletada() {
        return misionCompletada;
    }

    public void setMisionCompletada(boolean misionCompletada) {
        this.misionCompletada = misionCompletada;
    }

    public String getEspecialidadAgente() {
        return especialidadAgente;
    }

    public void setEspecialidadAgente(String especialidadAgente) {
        this.especialidadAgente = especialidadAgente;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "nombre='" + nombre + '\'' +
                ", misionCompletada=" + misionCompletada +
                ", especialidadAgente='" + especialidadAgente + '\'' +
                '}';
    }
}
