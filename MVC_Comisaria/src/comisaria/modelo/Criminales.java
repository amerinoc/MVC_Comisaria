package comisaria.modelo;
public class Criminales {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String mote;
    private String placa;
    
    public Criminales(){}
    public Criminales(String dni, String nombre, String apellidos, int edad, String mote, String placa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.mote = mote;
        this.placa = placa;
    } // fin constructor

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    } // fin getters/setters
} // fin de la clase
