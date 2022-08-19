package codigo.Modelo.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import codigo.Utilidades.*;

public class Consulta1DAO {
    public static ResultSet Consulta() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String csql = "SELECT ID_Lider,nombre, Primer_Apellido, Ciudad_Residencia  FROM Lider ORDER BY Ciudad_Residencia;";

        try {
            conn = JDBCUtilities.conexion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);

        } catch (Exception e) {
            /* TODO: handle exception/* */
        }
        return rs;
    }
}
