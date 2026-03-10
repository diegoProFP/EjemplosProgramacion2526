package poo2.superheroes;

public class Telepata extends Superheroe{


    public Telepata(String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Buenos dias. Te leo la mente, me llamo : "+  nombre);
        System.out.println("¿De qué signo eres?");
    }

    @Override
    public void usarPoder() {

        if(getEnergia() < 15){
            System.out.println("El Telepata no puede usar su poder");
        }else{
            this.energia -= 15;
            this.nivel += 3;

            System.out.println("El Telepata usa su poder y levita");
        }
    }
}
