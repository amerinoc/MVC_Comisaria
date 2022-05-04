package comisaria.modelo;

public class Celdas {
    private String ala;
    private int numero;
    
    public Celdas() {}
    public Celdas(String ala, int numero) {
        this.ala = ala;
        this.numero = numero;
    } // fin constructor

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    } // fin getters/setters
    
    
} // fin de la clase
