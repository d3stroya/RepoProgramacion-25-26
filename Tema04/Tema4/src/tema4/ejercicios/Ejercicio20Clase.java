package tema4.ejercicios;

import java.util.Scanner;




/**
 *
 * @author d3stroya
 */
public class Ejercicio20Clase {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";
    
    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    public final static int PUNTUACION = 5;
    
    /**
     * Método que le pide al usuario 
     * la respuesta a la pregunta
     * @return la respuesta del usuario
     */
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        String respuestaUsuario = entrada.nextLine();
        return respuestaUsuario;
    }
    
    /**
     * Método que compara que la respuesta del usuario 
     * con la respuesta correcta y devuelve true o false.
     * 
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * 
     * @return true si la respuesta correcta y false en caso contrario
     */
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
        boolean correcto;
        
        if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            correcto = true;
        } else {
            correcto = false;
        }
        
        return correcto;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacionFinal = 0;
        String respuesta;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        // Primera pregunta
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta, RESPUESTA1)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntuacionFinal += PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA1);
        }
        
        // Segunda pregunta
        System.out.println(PREGUNTA2);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta, RESPUESTA2)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntuacionFinal += PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA2);
        }
        
        System.out.println("NOTA DEL EXAMEN: " + puntuacionFinal);
    }    

}
