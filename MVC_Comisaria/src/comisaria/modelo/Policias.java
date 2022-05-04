package comisaria.modelo;
public class Policias {
    private String placa;
    private String nombre;
    private String apellidos;
    private String rango;
    private int id_dpto;
    
    public Policias(){}
    public Policias(String placa, String nombre, String apellidos, String rango, int id_dpto) {
        
        this.placa = placa;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rango = rango;
        this.id_dpto = id_dpto;
    } // fin constructor
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getId_dpto() {
        return id_dpto;
    }

    public void setId_dpto(int id_dpto) {
        this.id_dpto = id_dpto;
    } // fin getters/setters
} // fin de la clase
