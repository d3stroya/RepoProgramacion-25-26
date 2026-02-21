package ejercicio07_tema08;

/**
 *
 * @author d3stroya
 */
public class Dia {
    // ATRIBUTOS
    private String nombreDia;
    private int temperatura;

    // CONSTRUCTORES
    public Dia() {
        this.nombreDia = "";
        this.temperatura = 0;
    }
    
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }

    // GETTERS Y SETTERS
    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }


    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return "\n" + nombreDia + ": " + temperatura + "ºC";
    }


}
