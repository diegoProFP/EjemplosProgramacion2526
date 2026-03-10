package poo2.ejercicios.movibles;

public class Robot implements Movible {

    private String id;
    private int x;
    private int y;
    private int bateria;

    public Robot(String id, int x, int y, int bateria) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.bateria = bateria;
    }

    @Override
    public void mover(int dx, int dy) {
        int consumoRobot = 2 * (Math.abs(dx) + Math.abs(dy));
        if (this.bateria >= consumoRobot) {
            this.x += dx;
            this.y += dy;

            this.bateria -= consumoRobot;
            if (bateria < 0)
                bateria = 0;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id='" + id + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", bateria=" + bateria +
                '}';
    }
}
