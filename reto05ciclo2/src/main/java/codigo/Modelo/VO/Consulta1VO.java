package codigo.Modelo.VO;

import java.util.ArrayList;
import java.sql.*;
import codigo.Modelo.DAO.*;

public class Consulta1VO {
    public static ArrayList<String[]> valores() {
        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        try {
            rs = Consulta1DAO.Consulta();
            while (rs.next()) {
                /* ID_Lider,nombre, Primer Apellido,Ciudad_Residencia */
                int ID = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");
                /*
                 * System.out.println(String.format("%5d %-15s %-15s %-15s", ID, nombre,
                 * apellido, ciudad));
                 */
                salida.add(new String[] { ID + "", nombre, apellido, ciudad });
            }
        } catch (Exception e) {
            /* TODO: handle exception */
        }
        return salida;
    }

}