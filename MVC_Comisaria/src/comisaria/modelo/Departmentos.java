package comisaria.modelo;
public class Departmentos {
    private int id_dpto;
    private String nombre;
    
    public Departmentos(){}
    public Departmentos(int id_dpto, String nombre) {
        this.id_dpto = id_dpto;
        this.nombre = nombre;
    } // fin constructor

    public int getId_dpto() {
        return id_dpto;
    }

    public void setId_dpto(int id_dpto) {
        this.id_dpto = id_dpto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // fin getters/setters
} // fin de la clase
