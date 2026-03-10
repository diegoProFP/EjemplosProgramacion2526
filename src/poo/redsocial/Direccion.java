package poo.redsocial;

public class Direccion {

    private String calle;
    private String provincia;
    private String cp;
    private String pais;

    public Direccion(String calle, String provincia, String cp, String pais) {
        this.calle = calle;
        this.provincia = provincia;
        this.cp = cp;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        //TODO: podriamos poner una validacion
        this.cp = cp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", provincia='" + provincia + '\'' +
                ", cp='" + cp + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
