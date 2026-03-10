import java.util.Scanner;

// Comprobar que la nota es >=0 y <=10.
// Cualquier nota fuera de ese rango no es válida
//Con esa nota, tenemos que traducir a Calificación (sobresaliente, notable, etc...
//0 a menor a 5 --> es suspenso
//5 a menor a 6 --> suficiente
//6 a menor a 7 --> bien
//7 a menor a 9 --> ntable
//de 9 a 10 --> sobresaliente
public class EjercicioNotas {

    public static void main(String[] args) {
        //Pedir una nota numerica al usuario. que la nota sea double
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una nota entre 0 y 10 inclusives, y te digo la calificación");
        double nota = teclado.nextDouble();

        String calificacion = "";
        if(nota >= 0 && nota <=10){
            //es valida
            if(nota < 5){
                calificacion = "SUSPENSO";
            }else if(nota < 6){
                calificacion = "SUFICIENTE";
            }else if(nota < 7){
                calificacion = "BIEN";
            }else if(nota < 9){
                calificacion = "NOTABLE";
            }else{
                calificacion = "SOBRESALIENTE";
            }
            System.out.println("Has sacado la nota " + calificacion);
        }else{
            System.out.println("error, nota incorrecta");
        }

    //Otra forma de comprobar los rangos válidos
    //        if(nota < 0 || nota > 10){
    //            System.out.println("error, nota incorrecta");
    //        }else{
        //bla bla
        //}
        //

    }
}
