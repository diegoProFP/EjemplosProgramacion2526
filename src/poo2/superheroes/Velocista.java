package poo2.superheroes;

public class Velocista extends Superheroe{


    public Velocista(String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Ya te he hablado y no te has dado cuenta. Me llamo : " + nombre);
    }

    public void usarPoder() {

        if(getEnergia() < 5){
            System.out.println("El Velocista no puede usar su poder");
        }else{
            this.energia -= 5;
            this.nivel += 2;
            System.out.println("El Velocista usa su poder y corre que se las pela");
        }
    }

    @Override
    public void entrenar(){
        nivel += 1;
        System.out.println("Estoy entrenando...");
        recuperarEnergia(12);
    }
}
