package comisaria.modelo;

public class Zonas {
    private int id_zona;
    private String nombre;
    
    public Zonas(){}
    public Zonas(int id_zona, String nombre) {
        this.id_zona = id_zona;
        this.nombre = nombre;
    } // fin constructor

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // fin getters/setters
} // fin de la clase
