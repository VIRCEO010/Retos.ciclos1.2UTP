package codigo.Utilidades;

import java.sql.*;

public class JDBCUtilities {
    public static Connection conexion() {
        Connection conn = null;
        String url = "jdbc:sqlite:ProyectosConstruccion.db";
        try {
            conn = DriverManager.getConnection(url);

        } catch (Exception e) {

            System.out.println(e);

        }
        return conn;

    }

}
