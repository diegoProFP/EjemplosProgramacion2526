package poo2.agentes;

import java.util.Scanner;

public class LanzadorAgentes {
    public static void main(String[] args) {

//        Agente friki = new Hacker("Z3r0Co0l");
//        friki.ejecutarMision("robar credenciales");

        //crear las clases Ninja y Diplomatico, que heredan de Agente
        System.out.println("Dime cuántas misiones de máximo lanzamos");
        Scanner teclado = new Scanner(System.in);
        int maxMisiones = teclado.nextInt();

        Agente[] agentesSecretos = generarListaAgentes();

        int numeroMisiones = 0;
        boolean misionCompletada = false;
        do{
            numeroMisiones++;
            System.out.printf("\n **** LANZANDO MISION NÚMERO %d *** \n", numeroMisiones);
            misionCompletada = lanzarMision(agentesSecretos);

        }while(!misionCompletada && numeroMisiones < maxMisiones);

        if(misionCompletada){
            System.out.println("\n **** LOS AGENTES COMPLETARON LA MISION EN " + numeroMisiones + " INTENTOS ***");
        }else{
            System.out.println("\n **** LOS AGENTS NO HAN COMPLETADO LA MISION ****");
        }



    }

    private static boolean lanzarMision(Agente[] agentesSecretos) {
        boolean misionCompletada = true;

        for(int cont = 0; cont < agentesSecretos.length; cont++){
            Agente agente = agentesSecretos[cont];
            if(agente != null){
                agente.ejecutarMision("ROBAR EL BANCO DE ESPAÑA");
                if(!agente.isMisionCompletada()){
                    System.out.println("El agente: " + agente.getNombre() + " ha fallado en su mision");
                }
                misionCompletada = misionCompletada && agente.isMisionCompletada();
            }
        }

        if(!misionCompletada){
            System.out.println();
            System.out.println("ALGUIEN HA FALLADO EN SU MISIÓN");
            System.out.println();
        }

        return misionCompletada;
    }

    public static Agente[] generarListaAgentes(){
        //2 objetos de Hacker, 1 de Diplomatico, y 2 ninjas
        return new Agente[]{ new Hacker("ZeroCool"),
                            new Hacker("IT Guy"),
                            new Diplomatico("Donaldo Trumpo"),
                            new Ninja("Bruce"),
                            new Ninja("Lee")};

    }
    public static Agente[] generarListaAgentes(int numeroAgentes){
        //TODO: generar tantos agentes de forma aleatoria cmo diga la variable numeroAgentes
        return null;
    }
}
