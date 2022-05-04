package comisaria.app;

import comisaria.controlador.ControladorLogin;
import comisaria.modelo.ConsultasLogin;
import comisaria.modelo.Policias;
import comisaria.vista.VistaLogin;

public class MVC_ComisariaLogin {
    public static void main(String[] args) {
        // se inicializan el controlador, las consultas y la vista del login
        ControladorLogin cl = new ControladorLogin(new Policias(), new ConsultasLogin(), new VistaLogin());      
        cl.inicio();
    } // fin metodo main()   
} // fin de la clase
