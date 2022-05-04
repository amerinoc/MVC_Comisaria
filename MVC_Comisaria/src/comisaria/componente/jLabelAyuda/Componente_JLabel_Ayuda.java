package comisaria.componente.jLabelAyuda;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JLabel;

public class Componente_JLabel_Ayuda extends JLabel implements Serializable{
    public Componente_JLabel_Ayuda(){} // fin constructor()

    // fuente de la etiqueta
    @Override
    public void setFont(Font font) {
        super.setFont(new Font("Arial", Font.PLAIN, 11)); 
    }
    
    // la opacidad sera false
    @Override
    public void setOpaque(boolean bln) {
        super.setOpaque(false); 
    }
    // el color de la letra sera blanco
    @Override
    public void setForeground(Color color) {
        super.setForeground(Color.WHITE); //To change body of generated methods, choose Tools | Templates.
    }
    // ayudandonos de html damos un subrayado al texto
    @Override
    public void setText(String string) {
        super.setText("<HTML><U>Ayuda</U></HTML>");
    
    }
    
    
    
    
    
    
    
} // fin de la clase
