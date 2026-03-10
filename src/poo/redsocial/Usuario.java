package poo.redsocial;

public class Usuario {

    private String nick;
    private String email;
    private boolean activo = true;//valor inicial de true
    private Direccion direccion;

    public Usuario(String nick, String email) {
        this.nick = nick;
        this.email = email;
    }

    public Usuario(String nick, String email, Direccion direccion) {
        this.nick = nick;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", activo=" + activo +
                ", direccion=" + direccion +
                '}';
    }
}
