package ejercicio09_tema08;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private Asignatura[] notas;
    private final String[] NOMBRES_ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};

    // CONSTRUCTORES
    public Alumno() {
        this.nombre = "";
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }                
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
    
    public Alumno(String nombre, Asignatura[] notas) {
        this.nombre = nombre;
        this.notas = notas;
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }


    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }


    // MÉTODOS
    public int pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota: ");
        return entrada.nextInt();
    }
    
    public void rellenarNotas() {
        for(int i = 0; i < notas.length; i++) {
            notas[i].setNota(pedirNota());
        }
    }
    
    public void mostrarNotas() {
        for(Asignatura a : notas) {
            System.out.println(a);
        }
    }
    
    public float calcularMedia() {
        float media = 0;
        
        for(Asignatura asignatura : notas) {
            media += asignatura.getNota();
        }
        
        return media / notas.length;
    }


    // TO STRING
    @Override
    public String toString() {
        return nombre + "\n · " + Arrays.toString(notas);
    }


}
