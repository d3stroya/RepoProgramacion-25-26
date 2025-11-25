package ejercicio23;

/**
 *
 * @author d3stroya
 */
public class Taxi extends Vehiculo {
    // ATRIBUTOS
    private int numeroLicencia;

    // CONSTRUCTORES
    public Taxi() {
        super();
        this.numeroLicencia = 0;
    }
    
    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    // GETTERS Y SETTERS
    public int getNumeroLicencia() {
        return this.numeroLicencia;
    }
    
    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return "Taxi" +
                "\n · Matrícula: " + super.getMatricula() +
                "\n · Modelo: " + super.getModelo() +
                "\n · Potencia: " + super.getPotenciaCV() +
                "\n · Número de licencia: " + this.numeroLicencia;
    }
}
