package comisaria.componente.jButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JButton;

public class Componente_JButton_Personalizado extends JButton implements Serializable{
    public Componente_JButton_Personalizado(){} // fin constructor

    // color de fondo del boton
    @Override
    public void setBackground(Color color) {
        super.setBackground(new Color(219, 226, 246)); 
    }
    // color de la letra del boton
    @Override
    public void setForeground(Color color) {
        super.setForeground(new Color(0, 0, 153));
    }
    // fuente del boton
    @Override
    public void setFont(Font font) {
        super.setFont(new Font("Times New Roman", Font.PLAIN, 14));
    }
    // tamaño por defecto del boton
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100,35);
    }
    
    
    
    
} // fin de la clase
