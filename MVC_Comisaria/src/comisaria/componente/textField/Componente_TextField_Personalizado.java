/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisaria.componente.textField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JTextField;

public class Componente_TextField_Personalizado extends JTextField implements Serializable{
   public Componente_TextField_Personalizado(){} // fin constructor
    
    // se cambia el color de fondo del campo
    @Override
    public void setBackground(Color color) {
        super.setBackground(new Color(219, 226, 246)); 
    }
    // color del texto
    @Override
    public void setForeground(Color color) {
        super.setForeground(new Color(0, 0, 153)); //To change body of generated methods, choose Tools | Templates.
    }
    // fuente del campo
    @Override
    public void setFont(Font font) {
        super.setFont(new Font("Times New Roman", Font.PLAIN, 14)); //To change body of generated methods, choose Tools | Templates.
    }
    
    // tamaño del campo
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(130, 23);
    }

    @Override
    public void setText(String string) {
        super.setText("");
    }
    
    
} // fin de la clase
