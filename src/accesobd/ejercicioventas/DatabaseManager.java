package accesobd.ejercicioventas;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {

    public static final String PROP_DB_USER = "db.user";
    public static final String PROP_DB_PASS = "db.pass";
    private Connection conexion;

    public DatabaseManager(){

    }

//    public Connection abrirConexion(){
////        String usuario = PropiedadesProyecto.obtenerPropiedad(PROP_DB_USER);
////        String pass = PropiedadesProyecto.obtenerPropiedad(PROP_DB_PASS);
////        conexion = DriverManager.getConnection()
//    }

}
