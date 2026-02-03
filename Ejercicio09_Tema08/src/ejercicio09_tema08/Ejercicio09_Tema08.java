package ejercicio09_tema08;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09_Tema08 {
    
    public static void rellenar(Alumno[] alumnos) {
        String[] nombreAlumnos = {"Pepe", "Juan", "Marta"};
        
        for(int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(nombreAlumnos[i]);
            alumnos[i].rellenarNotas();
        }
    }
    
    public static void mostrar(Alumno[] alumnos) {
        for(Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
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
    
    // Alumno con más suspensos
    
    public static void asignaturaMasDificl(Alumno[] alumnos) {
        for(int j = 0; j < alumnos[0].getNotas().length; j++) {
            System.out.println(alumnos[0].getNotas()[j].getNombre());
            for(int i = 0; i < alumnos.length; i++) {
                // Calcular la media de la asignatura sumando las notas de los alumnos y dividiendo entre las 4 asignaturas
            }
        }
        
        // Comparo las medias para encontrar la más difícil
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        
        // Menú de opciones
    }    

}
