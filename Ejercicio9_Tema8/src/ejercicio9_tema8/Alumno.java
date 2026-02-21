package ejercicio9_tema8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private Asignatura[] asignaturas;
    private String[] NOMBRES_ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};

    // CONSTRUCTORES
    public Alumno() {
        this.nombre = "";
        this.asignaturas = new Asignatura[4];   // Creo el array
        
        // Inicializo el array con valores por defecto para evitar NullPointerException
        for(int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i], 0);
        }
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[4];
        
        for(int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i], 0);
        }
    }
    
    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }
    

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String[] getNombresAsignaturas() {
        return NOMBRES_ASIGNATURAS;
    }

    public void setNombresAsignaturas(String[] nombresAsignaturas) {
        this.NOMBRES_ASIGNATURAS = nombresAsignaturas;
    }


    // MÉTODOS
    // Pedir la nota del alumno
    public int pedirNota() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    // Rellenar notas del alumno
    public void rellenarNotas() {
        System.out.println("Notas de " + nombre);
        
        for(int i = 0; i < asignaturas.length; i++) {
            System.out.print(asignaturas[i].getNombre() + ": ");
            asignaturas[i].setNota(pedirNota());
        }
    }
    
    public void mostrarNotas() {
        System.out.println("Notas de " + nombre);
        
        for(int i = 0; i < asignaturas.length; i++) {
            System.out.print(asignaturas[i].getNombre() + ": " + asignaturas[i].getNota());
        }
    }
    
    public float notaMedia() {
        float media = 0;
        
        for(int i = 0; i < asignaturas.length; i++) {
            media += asignaturas[i].getNota();
        }
        
        return media / asignaturas.length;
    }
    
    public int contarSuspensos() {
        int suspensos = 0;
        
        for(int i = 0; i < asignaturas.length; i++) {
            if(asignaturas[i].getNota() < 5) {
                suspensos++;                
            }
        }
        
        return suspensos;
    }


    // TO STRING

    @Override
    public String toString() {
        return nombre + "\n" + Arrays.toString(asignaturas);
    }
    

}
