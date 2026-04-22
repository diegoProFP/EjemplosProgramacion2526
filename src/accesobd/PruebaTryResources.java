package accesobd;

import java.sql.*;

public class PruebaTryResources {

    public static void main(String[] args) {

        //Metemos dentro del try, los elementos que se "abren" y que
        //se cerrarán cuando termine el bloque try-catch
        try(Connection conexion = DriverManager.getConnection(
                ConstantesBd.URL,
                ConstantesBd.USER,
                ConstantesBd.PASS);
            Statement sentencia = conexion.createStatement()){

            System.out.println("Conexión exitosa");
            int numFilasAfectadas =
                    sentencia.executeUpdate("INSERT INTO categorias(nombre) VALUES('Servidores')");
            System.out.println("Categoria insertada. Numero de filas afectadas: " + numFilasAfectadas);

        }catch (SQLSyntaxErrorException e){
            System.err.println("Algun error en la sintaxis al lanzar la sentencia: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        }

    }
}
