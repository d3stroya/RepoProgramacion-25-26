package tema4.ejercicios;

import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Ejercicio20 {
    // ATRIBUTOS
    
    // Preguntas
    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    // Respuestas
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Cristóbal Colón";
    
    public final static int PUNTOS_ACIERTO = 5;
    
    // MÉTODOS
    
    /**
     * Método que pide al usuario la respuesta
     * @return la respuesta que dé el usuario
     */
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("  -> ");
        return entrada.nextLine();
    }
    
    /**
     * Método que muestra la pregunta pasada por parámetro
     * @param pregunta 
     */
    public static void mostrarPregunta(String pregunta) {
        System.out.println(pregunta);
    }        
    
    /**
     * Método que comprueba si la respuesta del usuario
     * es igual que la respuesta correcta.
     * 
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * 
     * @return true si las respuestas coinciden y false en caso contrario
     */
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
        return respuestaUsuario.equalsIgnoreCase(respuestaCorrecta);
    }
    
    /**
     * Método que suma los puntos al usuario
     * en su nota total.
     * 
     * @param puntuacion
     * @return la puntuación.
     */
    public static int sumaAcierto(int puntuacion) {
        puntuacion += PUNTOS_ACIERTO;
        return puntuacion;
    }
    
    /**
     * Método que muestra un mensaje de éxito 
     * cuando el usuario acierta.
     */
    public static void mostrarMensajeAcierto() {
        System.out.println("\n¡Genial! Has acertado\n");
    }
    
    /**
     * Método que muestra un mensaje un mensaje 
     * de fallo y da la respuesta correcta.
     * @param respuestaCorrecta 
     */
    public static void mostrarMensajeFallo(String respuestaCorrecta) {
        System.out.println("\n¡Ups...! Has fallado");
        System.out.println("La respuesta correcta es " + respuestaCorrecta + "\n");
    }
    
    /**
     * Método principal.
     * Hace las preguntas al usuario, recoge 
     * sus respuestas y suma puntos por cada 
     * acierto. Finalmente, muestra la nota final.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacion = 0;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        // Primera pregunta
        mostrarPregunta(PREGUNTA1);
        if(comprobarRespuesta(pedirRespuesta(), RESPUESTA1)) {
            puntuacion = sumaAcierto(puntuacion);
            mostrarMensajeAcierto();
        } else {
            mostrarMensajeFallo(RESPUESTA1);
        }
        
        // Segunda pregunta
        mostrarPregunta(PREGUNTA2);
        if(comprobarRespuesta(pedirRespuesta(), RESPUESTA2)) {
            puntuacion = sumaAcierto(puntuacion);
            mostrarMensajeAcierto();
        } else {
            mostrarMensajeFallo(RESPUESTA2);
        }
        
        System.out.println("Tu nota final es: " + puntuacion);
    }    

}
