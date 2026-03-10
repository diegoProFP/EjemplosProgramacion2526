public class EjemplosCasting {
    public static void main(String[] args) {

        final double PI = 3.1416;
        System.out.println("PI = " + PI);
        float f = (float) PI;
        System.out.println("f = " + f);

        int unInt = 5000;
        byte unByte = (byte) unInt;
        System.out.println("el resultado es: " + unByte);

        String informacionAlumno = "PACO,19,DAW,7.8";

        String edad = "25";
        int edadNumero = Integer.parseInt((String) edad);
        if(edadNumero > 18){
            System.out.println("Eres mayor de edad");
        }

        int numeroDni = 52487456;
        String dniEnString = String.valueOf(numeroDni);
        System.out.println("La longitd es: " + dniEnString.length());

        char inicial = 'A';
        String cadena = Character.toString(inicial);
        System.out.println("La inicial en minusculas es: " + cadena.toLowerCase());
//
        String respuestaUsuario = "trrrue";
        
        boolean valorBoolean = Boolean.parseBoolean(respuestaUsuario);
        System.out.println("valorBoolean = " + valorBoolean);




    }
}
