package poo2.superheroes;

public class AcademiaHeroes {

    public static void main(String[] args) {

        int contadorSuperheroes = 0;

        Superheroe[] superheroes = new Superheroe[5];
        Velocista flash = new Velocista("Flash");
        Forzudo hulk = new Forzudo("Increible Hulk");
        Telepata xavier = new Telepata("Prof. Xavier");

        superheroes[contadorSuperheroes++] = flash;
        superheroes[contadorSuperheroes++] = hulk;
        superheroes[contadorSuperheroes++] = xavier;


        System.out.println("SUPERHEROES USAN SU PODER");
        for (int cont = 0; cont < superheroes.length; cont++) {
            Superheroe heroe = superheroes[cont];
            if(heroe != null) {
                heroe.presentarse();
                heroe.usarPoder();
                System.out.println();
            }
        }

        System.out.println("SUPERHEROES ENTRENAN");
        for (int cont = 0; cont < superheroes.length; cont++) {
            Superheroe heroe = superheroes[cont];
            if(heroe != null) {
                heroe.entrenar();
                //compruebo si la variable heroe es un objeto de la clase Forzudo
                if(heroe instanceof Forzudo){
                    Forzudo unForzudo = (Forzudo) heroe;
                    unForzudo.comerProteinas();

                }
            }
        }


//        flash.usarPoder();
//        flash.usarPoder();
//        flash.usarPoder();
//
//        hulk.usarPoder();
//        hulk.usarPoder();
//        hulk.usarPoder();
//
//        xavier.usarPoder();
//        xavier.usarPoder();
//        xavier.usarPoder();
//
//        flash.entrenar();
//        xavier.entrenar();
//
//        flash.mostrarEstado();
//        hulk.mostrarEstado();
//        xavier.mostrarEstado();


    }
}
