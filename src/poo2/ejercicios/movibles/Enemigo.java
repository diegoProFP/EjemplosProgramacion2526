package poo2.ejercicios.movibles;

public class Enemigo implements Movible{

    private TipoEnemigo tipo;
    private int x;
    private int y;
    private int agresividad;

    public Enemigo(TipoEnemigo tipo, int x, int y, int agresividad) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
        this.agresividad = agresividad;
    }

    //ampliacion: si no recibo la agresividad, se calcula según su tipo (en el codigo
    //del enumerado)
    public Enemigo(TipoEnemigo tipo, int x, int y) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
        this.agresividad = TipoEnemigo.agresividadPorTipo(tipo);
    }

    @Override
    public void mover(int dx, int dy) {
        x += dx * agresividad;
        y += dy * agresividad;
    }


    public TipoEnemigo getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnemigo tipo) {
        this.tipo = tipo;
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

    public int getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(int agresividad) {
        this.agresividad = agresividad;
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "tipo=" + tipo +
                ", x=" + x +
                ", y=" + y +
                ", agresividad=" + agresividad +
                '}';
    }


}
