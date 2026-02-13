package ejercicio9_tema8;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Ejercicio9_Tema8 {
    private final static String[] NOMBRES = {"Pepe", "Juan", "Marta"};
    
    /**
     * Método que pide al usuario una opción para el menú
     * @return la opción introducida.
     */
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * Método que rellena el array con objetos Alumno
     * y sus notas medias.
     * 
     * @param alumnos
     * @param NOMBRES 
     */
    public static void rellenarAlumnos(Alumno[] alumnos, String[] NOMBRES) {
        System.out.println("\n-> Rellenando alumnos...");
        
        for(int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(NOMBRES[i]);
            alumnos[i].rellenarNotas();
        }
        
        System.out.println("\n[√] Notas rellenas correctamente.");
        
    }
    
    /**
     * Método que muestra los alumnos del array
     * con sus notas medias.
     * 
     * @param alumnos 
     */
    public static void mostrarAlumnos(Alumno[] alumnos) {
        if(alumnos[0] != null) {
            for(Alumno alumno : alumnos) {
                System.out.println(alumno);                
            } 
        } else {
            System.out.println("\n[x] Aún no hay notas que mostrar.");
        }
    }
    
    /**
     * Método que busca y muestra el alumno con mejor media.
     * @param alumnos 
     */
    public static void alumnoConMejorMedia(Alumno[] alumnos) {
        
        if(alumnos[0] != null) {
            System.out.println("\n-> Calculando alumno con mejor media...");
            float mejorMedia = -1;
            int indiceMejorAlumno = -1;

            for (int i = 0; i < alumnos.length; i++) {

                if(alumnos[i].notaMedia() > mejorMedia) {
                    mejorMedia = alumnos[i].notaMedia();
                    indiceMejorAlumno = i;
                }

            }

            System.out.println("\n[√] El alumno con mejor nota media es:");
            System.out.println(alumnos[indiceMejorAlumno].getNombre() + ", con una media de " + mejorMedia);
            
        } else {
            System.out.println("\n[x] Aún no hay notas que mostrar.");
        }
    }
    
    /**
     * Método que busca y muestra el alumno con más suspensos.
     * 
     * @param alumnos 
     */
    public static void alumnoConMasSuspensos(Alumno[] alumnos) {
        if(alumnos[0] != null) {
            System.out.println("\n-> Calculando alumno con más suspensos...");
            float suspensos = 0;
            int numSuspensosActual;
            int indicePeorAlumno = -1;

            for (int i = 0; i < alumnos.length; i++) {
                numSuspensosActual = alumnos[i].contarSuspensos();

                if(numSuspensosActual > suspensos) {
                    suspensos = numSuspensosActual;
                    indicePeorAlumno = i;
                }

            }

            System.out.println("\n[√] El alumno con más suspensos es:");
            System.out.println("    " + alumnos[indicePeorAlumno].getNombre() + ", con " + suspensos + " suspensos");
    
        } else {
            System.out.println("\n[x] Aún no hay notas que mostrar.");
        }
    }
    
    /**
     * Método que calcula y muestra la asignatura con peor media.
     * 
     * @param alumnos 
     */
    public static void asignaturaConPeorMedia(Alumno[] alumnos) {
        if(alumnos[0] != null) {
            System.out.println("\n-> Calculando asignatura con peor media...");
            float media = 11, mediaActual = 0;
            int indiceAsignaturaMasDificil = -1;

            for(int j = 0; j < alumnos[0].getAsignaturas().length; j++) {

                for(int i = 0; i < alumnos.length; i++) {
                    mediaActual += alumnos[i].getAsignaturas()[j].getNota();
                }

                mediaActual /= alumnos[0].getAsignaturas().length;

                if(mediaActual < media) {
                    media = mediaActual;
                    indiceAsignaturaMasDificil = j;
                }

            }

            System.out.println("\n[√] La asignatura con peor media es:");
            System.out.println(alumnos[0].getAsignaturas()[indiceAsignaturaMasDificil].getNombre() +
                    ", con una nota media de " + media);
            
        } else {
            System.out.println("\n[x] Aún no hay notas que mostrar.");
        }
    }

    /**
     * Método principal con el menú del programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];        
        int opcion = 0;
        
        do {
            try {
                
                System.out.println("\n- MENÚ -");
                System.out.println("1. Rellenar notas");
                System.out.println("2. Mostrar notas");
                System.out.println("3. Alumno con mejor media");
                System.out.println("4. Alumno con más suspensos");
                System.out.println("5. Asignatura con peor media");           
                System.out.println("6. Salir");

                System.out.print("Elige una opción: ");
                opcion = pedirOpcion();

                switch(opcion) {
                    case 1 -> rellenarAlumnos(alumnos, NOMBRES);                    
                    case 2 -> mostrarAlumnos(alumnos);
                    case 3 -> alumnoConMejorMedia(alumnos);
                    case 4 -> alumnoConMasSuspensos(alumnos);
                    case 5 -> asignaturaConPeorMedia(alumnos);
                    case 6 -> System.out.println("Cerrando programa...");
                }
                
            } catch(InputMismatchException e) {
                System.out.println("\n[x] Error: Has introducido un dato incorrecto.");
                System.out.println("->  Por favor, escribe un número enteror entre 1 y 6.");
            }
        } while(opcion != 6);
    }    

}
