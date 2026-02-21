package ejercicio9_tema8;

/**
 *
 * @author d3stroya
 */
public class Asignatura {
    // ATRIBUTOS
    private String nombre;
    private float nota;

    // CONSTRUCTORES
    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
 

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return " · " + nombre + ": " + nota;
    }
    

}
