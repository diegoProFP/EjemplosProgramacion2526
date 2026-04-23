package accesobd;

import java.sql.*;

public class PruebaConsultas {

    public static void main(String[] args) {

        /*
        1. Consultar resto de campos de la tabla para que se muestre toda la info
        2. Que la consulta sólo muestre los productos mayores a 100€ (es decir, pasar el parámetro, no que esté a pelo). Usar las propiedades del prepareStatement
        3. Crear clase Producto, con los mismos campos que tiene la tabla
        4. Con cada fila recuperada, crear un objeto de Producto y meter en un ArrayList
         */

        try(Connection conexion = DriverManager.getConnection(ConstantesBd.URL, ConstantesBd.USER, ConstantesBd.PASS)){

            PreparedStatement sentenciaConsulta = conexion.prepareStatement("SELECT * FROM productos");

            ResultSet conjuntoResultado = sentenciaConsulta.executeQuery();

            while(conjuntoResultado.next()){
                //Aqui estamos en la siguiente fila
                String nombreProducto = conjuntoResultado.getString("nombre");
                double precioProducto = conjuntoResultado.getDouble("precio");

                System.out.println("El producto es: " + nombreProducto + " y su precio es: " + precioProducto);
            }

            conjuntoResultado.close();
            sentenciaConsulta.close();

        }catch (SQLException e){
            System.err.println("Error general con la BD: " + e);
        }
    }
}
