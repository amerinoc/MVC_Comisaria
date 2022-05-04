package comisaria.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection conectar() {
            System.out.println("A conectar chache");
            String url = "jdbc:mysql://localhost/comisaria";
            String user = "root";
            String pass = "";
            Connection con = null;
            try {
            con = DriverManager.getConnection(url, user, pass);          
        } // fin metodo conectar
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible conectar a la BBDD");
            System.out.println(ex.getMessage());
        } // fin bloque try/catch
        return con;
    } // fin metodo conectar()
} // fin de la clase
