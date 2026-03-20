package poo2.ejercicios.vehiculos;

public abstract class Vehiculo {
    private final String matricula;
    private final String modelo;
    private static final String MATRICULA_POR_DEFECTO = "INVALIDA";
    private static final String MODELO_POR_DEFECTO = "MODELO_NO_VALIDO";

    protected Vehiculo(String matricula, String modelo, String tipoMatricula) {
        if (esTextoValido(modelo)) {
            this.modelo = modelo;
        } else {
            System.err.println("El modelo no puede estar vacio");
            this.modelo = MODELO_POR_DEFECTO;
        }

        if (esMatriculaValida(matricula, tipoMatricula)) {
            this.matricula = matricula;
        } else {
            System.err.println("Matricula no valida para un vehiculo " + tipoMatricula.toLowerCase());
            this.matricula = MATRICULA_POR_DEFECTO;
        }
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

    protected boolean esTextoValido(String valor) {
        return valor != null && !valor.isBlank();
    }

    protected boolean esNoNegativo(double valor) {
        return valor >= 0;
    }

    protected boolean esPositivo(int valor) {
        return valor > 0;
    }

    protected boolean esPositivo(double valor) {
        return valor > 0;
    }

    private boolean esMatriculaValida(String matricula, String tipoMatricula) {
        if (!esTextoValido(matricula)) {
            return false;
        }

        if ("TERRESTRE".equals(tipoMatricula)) {
            return esMatriculaTerrestreValida(matricula);
        }
        if ("ACUATICO".equals(tipoMatricula)) {
            return esMatriculaAcuaticaValida(matricula);
        }
        if ("AEREO".equals(tipoMatricula)) {
            return esMatriculaAereaValida(matricula);
        }
        return false;
    }

    private boolean esMatriculaTerrestreValida(String matricula) {
        if (matricula.length() != 7) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }

        for (int i = 4; i < 7; i++) {
            if (!Character.isLetter(matricula.charAt(i)) || !Character.isUpperCase(matricula.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean esMatriculaAcuaticaValida(String matricula) {
        if (matricula.length() < 3 || matricula.length() > 10) {
            return false;
        }

        for (int i = 0; i < matricula.length(); i++) {
            char letra = matricula.charAt(i);
            if (!Character.isLetter(letra) || !Character.isUpperCase(letra)) {
                return false;
            }
        }

        return true;
    }

    private boolean esMatriculaAereaValida(String matricula) {
        if (matricula.length() != 10) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if (!Character.isLetter(matricula.charAt(i)) || !Character.isUpperCase(matricula.charAt(i))) {
                return false;
            }
        }

        for (int i = 4; i < 10; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
