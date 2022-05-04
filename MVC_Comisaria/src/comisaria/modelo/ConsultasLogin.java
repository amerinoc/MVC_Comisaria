package comisaria.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasLogin extends Conexion{
    private Connection con;
    // al comenzar esta clase se conecta con la BBDD
    public ConsultasLogin() {
        con = conectar();
    } // fin constructor()
    
    
    public ArrayList<Integer> compruebaUsuario(String usuario) {
        ArrayList<Integer> listaUser = new ArrayList<>();
        try {            
            String sql = "SELECT COUNT(PLACA), ID_DPTO FROM POLICIAS WHERE NOMBRE = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,usuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            listaUser.add(rs.getInt(1));
            listaUser.add(rs.getInt(2));
            
        } // fin metodo compruebaUsuario()
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la consulta, comprueba la sintaxis SQL");
            System.out.println(ex.getMessage());
        }
        return listaUser;
    }
} // fin de la clase
