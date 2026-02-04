package ejercicio09_tema08;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09_Tema08 {
    
    /**
     * Método que rellena el array de alumnos
     * con sus notas.
     * 
     * @param alumnos 
     */
    public static void rellenar(Alumno[] alumnos) {
        String[] nombreAlumnos = {"Pepe", "Juan", "Marta"};
        
        for(int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(nombreAlumnos[i]);
            alumnos[i].rellenarNotas();
        }
    }
    
    /**
     * Método que muestra el array de alumnos
     * y sus notas.
     * 
     * @param alumnos 
     */
    public static void mostrar(Alumno[] alumnos) {
        for(Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
    /**
     * Método que muesta el alumno
     * con mejor nota media.
     * 
     * @param alumnos 
     */
    public static void mejorAlumno(Alumno[] alumnos) {
        Alumno mejorAlumno = new Alumno();
        float mejorMedia = 0;
        
        for(int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].calcularMedia() > mejorMedia) {
                mejorMedia = alumnos[i].calcularMedia();
                mejorAlumno = alumnos[i];
            }
        }
        
        System.out.println("El mejor alumno es " + mejorAlumno + " con una media de " + mejorMedia);
        
    }
    
    // TODO: Alumno con más suspensos
    
    /**
     * Método que muestra la asignatura con peor media.
     * Recorre las asignaturas (índice j) y, dentro,
     * recorre los alumnos sumando sus notas y dividiéndola
     * entre el número de alumnos (tamaño del array alumnos).
     * Luego, compara las medias y muestra la asignatura con
     * media más baja.
     * 
     * @param alumnos 
     */
    public static void asignaturaMasDificl(Alumno[] alumnos) {
        float mediaMasBaja = 11;
        Asignatura asignaturaMasDificil = null;
        
        for(int j = 0; j < alumnos[0].getNotas().length; j++) {
            System.out.println("Calculando media de " + alumnos[0].getNotas()[j].getNombre());
            
            for(int i = 0; i < alumnos.length; i++) {
                // Sumar las notas de los alumnos
            }
            
            // Calcular la media de la asignatura
            
            // Comparar la media actual con la media más baja
        }
        
        // Mostrar la asignatura con media más baja y su nota media.        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        
        // TODO: Menú de opciones
    }    

}
