package comisaria.controlador;

import comisaria.modelo.ConsultasLogin;
import comisaria.modelo.Policias;
import comisaria.vista.VistaLogin;
import comisaria.vista.VistaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener{
    private Policias policias;
    private ConsultasLogin consultasLogin;
    private VistaLogin vistaLogin;
    
    public ControladorLogin(Policias policias, ConsultasLogin consultasLogin, VistaLogin vistaLogin) {
        System.out.println("Chache el controlador");
        this.policias = policias;
        this.consultasLogin = consultasLogin;
        this.vistaLogin = vistaLogin;
    } // fin constructor()
    
    // metodo para preparar la vista del login
    public void inicio() {
        vistaLogin.setVisible(true);
        vistaLogin.btnEntrar.addActionListener(this);
        
    } // fin metodo inicio()

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vistaLogin.btnEntrar) {
            sacaPassword();
        } // fin if el evento se hace sobre el boton de login
    } // fin metodo listener boton()

    private void sacaPassword() {
        char[] pass = vistaLogin.txtPass.getPassword();
        String password = "";
        for(char c : pass) {
            password += c;
        } // fin bucle recorre campo txtPass
            ArrayList<Integer> listaLogin = consultasLogin.compruebaUsuario(vistaLogin.txtUser.getText());
            if(listaLogin.size() > 0) {
                JOptionPane.showMessageDialog(null, "El login es correcto");
                if(listaLogin.get(1) == 1) {
                    JOptionPane.showMessageDialog(null, "La aplicación se iniciará en modo administrador / dirección");
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no tendrá privilegios de administrador.");
                }
                vistaLogin.setVisible(false);
                ControladorMenu cm = new ControladorMenu(new VistaMenu());
                cm.inicio();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario introducido no se encuentra en la BBDD");
            }
        } 
        
    
} // fin de la clase
