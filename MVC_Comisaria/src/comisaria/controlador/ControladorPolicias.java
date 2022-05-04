package comisaria.controlador;

import comisaria.modelo.ConsultasPolicias;
import comisaria.modelo.Policias;
import comisaria.vista.VistaPolicias;


public class ControladorPolicias {
    private Policias policias;
    private ConsultasPolicias consultasPolicias;
    private VistaPolicias vistaPolicias;
    
    public ControladorPolicias(Policias policias, ConsultasPolicias consultasPolicias, VistaPolicias vistaPolicias) {
        this.policias = policias;
        this.consultasPolicias = consultasPolicias;
        this.vistaPolicias = vistaPolicias;
    } // fin constructor()
    
    public void inicio() {
        
    } // fin metodo inicio()
} // fin de la clase
