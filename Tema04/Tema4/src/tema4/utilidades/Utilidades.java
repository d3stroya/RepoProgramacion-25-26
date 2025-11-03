package tema4.utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Utilidades {
    /**
     * Método que pide al usuario un número
     * 
     * @return el número escrito por el usuario
     */
    public static int pedirNumero() {
        int num = -1;
        
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escribe un número: ");
            num = entrada.nextInt();                        
        } catch(InputMismatchException e) {
            System.out.println("Has introducido un valor no válido");
        }
        
        return num;
    }
    
    /**
     * Método que devuelve una letra aleatoria 
     * dentro del rango establecido por parámetro.
     * 
     * Ayúdate de https://pythontutor.com/ para visualizar el algoritmo
     * 
     * @param a: letra inicio de rango
     * @param b: letra fin de rango
     * @return la letra aleatoria
     */
    public static char generarLetraAleatoria(char a, char b) {
        int numAleatorio;

        // Convierto las letras a su código ASCII (número entero)
        int inicioRango = (int)a;
        int finRango = (int)b;        
                
        // Creo un número aleatorio entre el inicio y fin del rango
        numAleatorio = (int)(Math.random() * (finRango + 1 - inicioRango) + inicioRango);
        
        // Devuelvo el número convertido a char
        return (char)numAleatorio;        
    }
}
