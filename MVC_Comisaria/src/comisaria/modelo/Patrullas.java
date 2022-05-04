package comisaria.modelo;

public class Patrullas {
    private int id_patrulla;
    private String nombre_patrulla;
    
    public Patrullas(){}
    public Patrullas(int id_patrulla, String nombre_patrulla) {
        this.id_patrulla = id_patrulla;
        this.nombre_patrulla = nombre_patrulla;
    } // fin de constructor

    public int getId_patrulla() {
        return id_patrulla;
    }

    public void setId_patrulla(int id_patrulla) {
        this.id_patrulla = id_patrulla;
    }

    public String getNombre_patrulla() {
        return nombre_patrulla;
    }

    public void setNombre_patrulla(String nombre_patrulla) {
        this.nombre_patrulla = nombre_patrulla;
    } // fin getters/setters 
} // fin de la clase
