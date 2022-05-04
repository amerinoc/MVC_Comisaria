package comisaria.modelo;

public class Vehiculos {
    private String matricula;
    private String marca;
    private String modelo;
    private int kms;
    
    public Vehiculos(){}
    public Vehiculos(String matricula, String marca, String modelo, int kms) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
    } // fin de constructor

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    } // fin getters/setters
} // fin de la clase
