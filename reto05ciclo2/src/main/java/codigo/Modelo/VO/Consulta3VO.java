package codigo.Modelo.VO;

import java.util.ArrayList;
import java.sql.*;
import codigo.Modelo.DAO.*;

public class Consulta3VO {
    public static ArrayList<String[]> valores() {
        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        try {
            rs = Consulta3DAO.Consulta();
            while (rs.next()) {
                /* ID_Lider,nombre, Primer Apellido,Ciudad_Residencia */
                /* ID_Compra, Constructora, Banco_Vinculado */
                int ID = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");

                /*
                 * System.out.println(String.format("%5d %-15s %-15s %-15s", ID, nombre,
                 * apellido, ciudad));
                 */
                salida.add(new String[] { ID + "", constructora, banco, });
            }
        } catch (Exception e) {
            /* TODO: handle exception */
        }
        return salida;
    }

}
