
package ejemploordenacion;

import java.util.Comparator;


/**
 * Clase Alumno
 * 
 * @author Daniel
 */
public class Alumno implements Comparable<Alumno>{
    
    //Atributos
    private String nombre;
    private int numero;
        
    //Constructores
    public Alumno() {
        this.nombre = "";
        this.numero = 0;
    }
        
    public Alumno(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    
    //Getters / Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", numero=" + numero + '}';
    }

    //compareTo
    @Override
    // OPCIÓN 1
    public int compareTo(Alumno a) {
        if(this.numero < a.getNumero()) {
            return 1;
        } else if (this.numero > a.getNumero()) {
            return -1;
        } else {
            return 0;
        }        
    }
    
    // OPCIÓN 2
//    public int compareTo(Alumno a) {
//        return a.getNumero() - this.numero;
//    }
    
    // OPCIÓN 3
//    public int compareTo(Alumno a) {
//        return Integer.compare(a.getNumero(), this.numero);
//    }

}
