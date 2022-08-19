package codigo.Modelo.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import codigo.Utilidades.*;

public class Consulta2DAO {
    public static ResultSet Consulta() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String csql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion=='Casa Campestre' AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla')";

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
