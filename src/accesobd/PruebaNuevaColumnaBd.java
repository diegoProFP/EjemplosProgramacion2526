package accesobd;

import java.sql.*;

public class PruebaNuevaColumnaBd {

    public static void main(String[] args) {

        //ALTER TABLE `daw_tienda`.`categorias`
        //ADD COLUMN `oferta` TINYINT NULL AFTER `nombre`;
        try {
            Connection conexion = DriverManager.getConnection(
                    ConstantesBd.URL,
                    ConstantesBd.USER,
                    ConstantesBd.PASS);
            System.out.println("Conexión exitosa");

            Statement sentencia = conexion.createStatement();

            sentencia.execute("ALTER TABLE categorias ADD COLUMN oferta TINYINT NULL");

            System.out.println("Nueva columna creada");

            sentencia.close();

            conexion.close();

        }catch (SQLSyntaxErrorException e){
            System.err.println("Algun error en la sintaxis al lanzar la sentencia: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        }

    }
}
