package poo2.superheroes;

public class Forzudo extends Superheroe{


    public Forzudo(String nombre) {
        super(nombre);
    }


    @Override
    public void presentarse() {
        System.out.println("Me llamo " + nombre + " y soy forzudo");
        System.out.println("Me gusta levantar pesas");
    }

    @Override
    public void usarPoder() {

        if(getEnergia() < 20){
            System.out.println("El Forzudo no puede usar su poder");
        }else{
            this.energia -= 20;
            this.nivel ++;

            System.out.println("El Forzudo usa su poder y aplasta todo");
        }
    }

    public void comerProteinas(){
        System.out.println("Como proteinas...");
    }

    @Override
    public void entrenar(){
        nivel += 1;
        if( energia - 15 < 0){
            energia = 0;
        }else{
            energia -= 15;
        }
        System.out.println("Estoy entrenando...");
        recuperarEnergia(20);
    }


}
