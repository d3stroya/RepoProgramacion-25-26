package ejercicio23;

/**
 *
 * @author d3stroya
 */
public class Vehiculo {
    // ATRIBUTOS
    private String matricula;
    private String modelo;
    private int potenciaCV;

    // CONSTRUCTORES
    public Vehiculo() {
        this.matricula = "";
        this.modelo = "";
        this.potenciaCV = 0;
    }
    
    public Vehiculo(String matricula, String modelo, int potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    // GETTERS Y SETTERS
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getPotenciaCV() {
        return this.potenciaCV;
    }
    
    public void setPotencia(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return "Vehículo: " + modelo + " con matrícula " + matricula + " tiene " + potenciaCV + "CV";
    }
}
