package poo2.superheroes;

public abstract class Superheroe {

    public static final int MAX_ENERGIA = 100;
    protected String nombre;
    protected int energia = MAX_ENERGIA;
    protected int nivel = 1;

    public Superheroe(String nombre) {
        this.nombre = nombre;
    }

    public abstract void presentarse();

    public void usarPoder(){
        if(energia < 10){
            System.out.println("No se puede usar el poder del superhéroe");
        }else{

            this.energia -= 10;
            System.out.println("Usamos el poder de forma genérica");
        }
    }


    public final void recuperarEnergia(int cantidad){
        int energiaRecuperada;
        if((energia + cantidad >= MAX_ENERGIA)){
            energiaRecuperada = MAX_ENERGIA - energia;
            energia = MAX_ENERGIA;
        }else{
            energia += cantidad;
            energiaRecuperada = cantidad;
        }
        System.out.println("El superhéroe " + this.nombre + " recupera " + energiaRecuperada + " de energia");
    }
    /*
    Método entrenar()
El superhéroe deberá implementar un método entrenar() con estas características:
• Aumenta el nivel en 1.
• Reduce la energía en 10.
• Después de entrenar, debe llamar al método recuperarEnergia() con la energía que recupera, por
defecto 5
     */

    public void entrenar(){
        nivel += 1;
        if( energia - 10 < 0){
            energia = 0;
        }else{
            energia -= 10;
        }
        System.out.println("Estoy entrenando...");
        recuperarEnergia(5);
    }

    public void mostrarEstado(){
        System.out.println("** SUPERHEROE **");
        System.out.println("- Nombre = " + nombre);
        System.out.println("- Energia = " + energia);
        System.out.println("- Nivel = " + nivel);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", nivel=" + nivel +
                '}';
    }
}
