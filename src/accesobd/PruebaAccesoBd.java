package accesobd;

import java.sql.*;

public class PruebaAccesoBd {

    public static void main(String[] args) {
        Connection conexion = null;
        Statement sentencia = null;
        try {
            conexion = DriverManager.getConnection(
                    ConstantesBd.URL,
                    ConstantesBd.USER,
                    ConstantesBd.PASS);
            System.out.println("Conexión exitosa");

            sentencia = conexion.createStatement();

            int numFilasAfectadas =
                    sentencia.executeUpdate("INSERT INTO caff4345tegorias(nombre) VALUES('Servidores')");

            System.out.println("Categoria insertada. Numero de filas afectadas: " + numFilasAfectadas);

        }catch (SQLSyntaxErrorException e){
            System.err.println("Algun error en la sintaxis al lanzar la sentencia: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        } finally {
            try {
                if(sentencia != null) {
                    sentencia.close();
                }
                if(conexion != null){
                    conexion.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar objetos de conexion:" + e);
            }

        }

    }
}
