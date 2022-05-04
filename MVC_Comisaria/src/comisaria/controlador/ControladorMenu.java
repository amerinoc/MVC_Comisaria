
package comisaria.controlador;

import comisaria.modelo.ConsultasPolicias;
import comisaria.modelo.Policias;
import comisaria.vista.VistaMenu;
import comisaria.vista.VistaPolicias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu implements ActionListener{
    private VistaMenu vistaMenu;
    
    public ControladorMenu(VistaMenu vistaMenu) {
        this.vistaMenu = vistaMenu;
    }
    
    public void inicio() {
        // se prepara la ventana para visualizar lo que interese
        vistaMenu.setVisible(true);
        vistaMenu.btnAtras.setVisible(false);
        vistaMenu.btnPolis.setVisible(false);
        vistaMenu.btnRondasPoli.setVisible(false);
        vistaMenu.btnDepartamentos.setVisible(false);
        vistaMenu.btnPatrullas.setVisible(false);
        vistaMenu.btnRondasPatrol.setVisible(false);
        vistaMenu.btnZonas.setVisible(false);
        vistaMenu.btnVigilancia.setVisible(false);
        vistaMenu.btnCeldas.setVisible(false);
        vistaMenu.btnCriminales.setVisible(false);
        vistaMenu.btnRecluidos.setVisible(false);
        // se implementan los listener en los botones
        vistaMenu.btnAtras.addActionListener(this);
        vistaMenu.btnMuestraPoli.addActionListener(this);
        vistaMenu.btnMuestraPatrol.addActionListener(this);
        vistaMenu.btnMuestraVehiculos.addActionListener(this);
        vistaMenu.btnMuestraCriminales.addActionListener(this);     
        vistaMenu.btnPolis.addActionListener(this);
        vistaMenu.btnRondasPoli.addActionListener(this);
        vistaMenu.btnDepartamentos.addActionListener(this);
        
    } // fin metodo inicio()

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()) {
            case "GESTIÓN POLICÍAS":
                vistaMenu.btnAtras.setVisible(true);
                vistaMenu.btnPolis.setVisible(true);
                vistaMenu.btnRondasPoli.setVisible(true);
                vistaMenu.btnDepartamentos.setVisible(true);
                vistaMenu.btnMuestraPoli.setVisible(false);
                vistaMenu.btnMuestraPatrol.setVisible(false);
                vistaMenu.btnMuestraVehiculos.setVisible(false);
                vistaMenu.btnMuestraCriminales.setVisible(false);
                break;
            case "GESTIÓN PATRULLAS":
                vistaMenu.btnAtras.setVisible(true);
                vistaMenu.btnPatrullas.setVisible(true);
                vistaMenu.btnVigilancia.setVisible(true);
                vistaMenu.btnRondasPatrol.setVisible(true);
                vistaMenu.btnZonas.setVisible(true);
                vistaMenu.btnMuestraPoli.setVisible(false);
                vistaMenu.btnMuestraPatrol.setVisible(false);
                vistaMenu.btnMuestraVehiculos.setVisible(false);
                vistaMenu.btnMuestraCriminales.setVisible(false);
                break;
            case "GESTIÓN VEHÍCULOS":
                break;
            case "GESTIÓN CRIMINALES":
                vistaMenu.btnAtras.setVisible(true);
                vistaMenu.btnCeldas.setVisible(true);
                vistaMenu.btnCriminales.setVisible(true);
                vistaMenu.btnRecluidos.setVisible(true);
                vistaMenu.btnMuestraPoli.setVisible(false);
                vistaMenu.btnMuestraPatrol.setVisible(false);
                vistaMenu.btnMuestraVehiculos.setVisible(false);
                vistaMenu.btnMuestraCriminales.setVisible(false);

                break;
                
            case "ATRÁS":
                System.out.println("HE DADO A ATRÁS");
                
                // se oculta el submenu
                vistaMenu.btnPolis.setVisible(false);
                vistaMenu.btnRondasPoli.setVisible(false);
                vistaMenu.btnDepartamentos.setVisible(false);               
                vistaMenu.btnPatrullas.setVisible(false);
                vistaMenu.btnRondasPatrol.setVisible(false);
                vistaMenu.btnZonas.setVisible(false);
                vistaMenu.btnVigilancia.setVisible(false);
                vistaMenu.btnCeldas.setVisible(false);
                vistaMenu.btnCriminales.setVisible(false);
                vistaMenu.btnRecluidos.setVisible(false);
                // aparecen las opciones iniciales
                vistaMenu.btnMuestraPoli.setVisible(true);
                vistaMenu.btnMuestraPatrol.setVisible(true);
                vistaMenu.btnMuestraVehiculos.setVisible(true);
                vistaMenu.btnMuestraCriminales.setVisible(true);
                vistaMenu.btnAtras.setVisible(false);              
                break;
            
            case "POLICÍAS":
                ControladorPolicias cp = new ControladorPolicias(new Policias(), new ConsultasPolicias(), new VistaPolicias());
                cp.inicio();
                break;
        }
        if(ae.getSource() == vistaMenu.btnPolis) {
            System.out.println(ae.getActionCommand());
        }
        
        
    } // fin metodo listener de los botones
} // fin de la clase
