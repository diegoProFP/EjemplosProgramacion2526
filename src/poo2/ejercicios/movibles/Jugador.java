package poo2.ejercicios.movibles;

public class Jugador implements Movible{

    private String nombre;
    private int x;
    private int y;
    private int energia;

    public Jugador(String nombre, int x, int y, int energia) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.energia = energia;
    }

    @Override
    public void mover(int dx, int dy) {

        if(this.energia != 0){
            this.x += dx;
            this.y += dy;

            int costeEnergia = Math.abs(dx) + Math.abs(dy);
            this.energia -= costeEnergia;

            if(energia < 0) energia = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", energia=" + energia +
                '}';
    }
}
