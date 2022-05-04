package comisaria.componente.jLabel;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JLabel;

public class Componente_JLabel_Personalizado extends JLabel implements Serializable{
    public Componente_JLabel_Personalizado(){} // fin constructor
     
    // fuente de la etiqueta
    @Override
    public void setFont(Font font) {
        super.setFont(new Font("Times New Roman", Font.BOLD, 18));
    }
    
    // color de la letra
    @Override
    public void setForeground(Color color) {
        super.setForeground(Color.WHITE);
    }
    // se le quita la opacidad
    @Override
    public void setOpaque(boolean bln) {
        super.setOpaque(false); 
    }
    // se define que la posicion del texto debe ser el centro tanto en la X como en la Y
    @Override
    public void setAlignmentY(float f) {
        super.setAlignmentY(JLabel.CENTER_ALIGNMENT);
    }

    @Override
    public void setAlignmentX(float f) {
        super.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
} // fin de la clase
