package poo.navidad;

public class ReyMago {

    public static String ORIGEN = "Oriente";

    private String nombre;
    private boolean canoso;
    private String colorTunica;
    private String regalo;
    private boolean vaEnCamello;

    public ReyMago(String nombreIni, boolean canosoIni, String colorTunicaIni){
        nombre = nombreIni;
        canoso = canosoIni;
        colorTunica = colorTunicaIni;
    }
    public ReyMago(String nombreIni, boolean canosoIni, String colorTunicaIni, boolean vaEnCamelloIni){
        nombre = nombreIni;
        canoso = canosoIni;
        colorTunica = colorTunicaIni;
        vaEnCamello = vaEnCamelloIni;
    }

    /*
    Segun el color de tunica y el regalo que traigan, me dice el poder
     */
    public String obtenerPoderMagico(){

        if(colorTunica.equalsIgnoreCase("verde")){
            return "Naturaleza";
        }else if(colorTunica.equalsIgnoreCase("rojo")){
            return "Fuego";
        }else{
            if(regalo.contains("o")){
                return "Agua";
            }
        }
        return "(no tiene poder)";
    }

    public void presentarse(){
        System.out.println(Colores.RESET + "******** ");
        System.out.println(" Hola, soy "  + nombre);
        if(vaEnCamello){
            System.out.println("Voy en camello");
        }else{
            System.out.println("NO Voy en camello");
        }

        System.out.println("Mi tunica es de color: " + colorTunica);
        if(regalo != null){
            System.out.println("Y traigo el regalo: " + regalo);
        }

        System.out.println("El poder que tengo es: " + obtenerPoderMagico());

        System.out.println();
    }

    public String getNombre(){
        return nombre;
    }
    public boolean isCanoso(){
        return canoso;
    }
    public void setCanoso(boolean nuevoValor){
        canoso = nuevoValor;
    }
    public String getColorTunica(){
        return colorTunica;
    }
    public void setColorTunica(String nuevoColor){
        colorTunica = nuevoColor;
    }
    public String getRegalo(){
        return regalo;
    }
    public void setRegalo(String nuevoRegalo){
        regalo = nuevoRegalo;
    }


}
