package codigo.Modelo.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import codigo.Utilidades.*;

public class Consulta3DAO {
    public static ResultSet Consulta() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String csql = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto USING(ID_Proyecto)WHERE Proveedor=='Homecenter' AND Ciudad=='Salento'";

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
