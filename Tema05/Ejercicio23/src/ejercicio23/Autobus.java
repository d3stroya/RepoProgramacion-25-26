package ejercicio23;

/**
 *
 * @author d3stroya
 */
public class Autobus extends Vehiculo {
    // ATRIBUTOS
    private int numeroPlazas;

    // CONSTRUCTORES
    public Autobus() {
        super();
        this.numeroPlazas = 0;
    }

    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }
    
    // GETTERS Y SETTERS
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return "Autobus" +
                "\n · Matrícula: " + super.getMatricula() +
                "\n · Modelo: " + super.getModelo() +
                "\n · Potencia: " + super.getPotenciaCV() +
                "\n · Número de plazas: " + this.numeroPlazas;
    }
    

    

    
}
