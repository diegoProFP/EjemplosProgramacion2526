package poo2.ejercicios.vehiculos;

public abstract class Vehiculo {
    private final String matricula;
    private final String modelo;

    protected Vehiculo(String matricula, String modelo, String patronMatricula, String descripcionPatron) {
        validarTexto(modelo, "El modelo no puede estar vacio");
        validarMatricula(matricula, patronMatricula, descripcionPatron);
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void imprimir() {
        System.out.println(getClass().getSimpleName() + "{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                getDatosImpresion() +
                '}');
    }

    protected abstract String getDatosImpresion();

    protected void validarTexto(String valor, String mensajeError) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    protected void validarNoNegativo(double valor, String mensajeError) {
        if (valor < 0) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    protected void validarPositivo(int valor, String mensajeError) {
        if (valor <= 0) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    protected void validarPositivo(double valor, String mensajeError) {
        if (valor <= 0) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    private void validarMatricula(String matricula, String patronMatricula, String descripcionPatron) {
        validarTexto(matricula, "La matricula no puede estar vacia");
        if (!matricula.matches(patronMatricula)) {
            throw new IllegalArgumentException("La matricula debe cumplir el formato: " + descripcionPatron);
        }
    }
}
