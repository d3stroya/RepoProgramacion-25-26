package tema4.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Ejercicio14 {
    // Constante con el divisor del ejercicio
    public final static int DIVISOR = 3;
    
    /**
     * Método que pide un número entero al usuario.
     * 
     * @return el número.
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("  -> Escribe un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que comprueba que el número
     * pasado por parámetro sea mayor que 0.
     * 
     * @param num
     * @return true si el número es mayor que 0 y false en caso contrario.
     */
    public static boolean comprobarNumero(int num) {
        return num > 0;
    }
    
    /**
     * Método que pide al usuario un número 
     * hasta que sea un número entero mayor que 0.
     * 
     * @return el número validado.
     */
    public static int pedirNumeroValido() {
        int num = -1;
        boolean numValido = false;
        
        do {
            try { 
                
                num = pedirNumero();
                numValido = comprobarNumero(num);
             
                if(!numValido) {
                    System.out.println("[x] ERROR: El dato no es válido. Prueba de nuevo.");
                }
                
            } catch(InputMismatchException e) {
            
                System.out.println(
                        "[x] ERROR: No has introducido un número entero. Vuelve a intentarlo"
                );
            
            }
   
        } while(!numValido);
        
        return num;
    }
    
    /**
     * Método que devuelve si el número pasado por parámetro es múltiplo
     * del divisor también pasado por parámetro.
     * 
     * @param num
     * @param divisor
     * 
     * @return true si el número es múltiplo y false en caso contrario.
     */
    public static boolean esMultiplo(int num, int divisor) {
        return num % divisor == 0;
    }
    
    /**
     * Método que imprime los números 
     * múltiplos de 3 y la cantidad de 
     * números que ha mostrado.
     * 
     * @param num 
     */
    public static void imprimirMultiplosDe3(int num) {
        int contador = 0;
        
        System.out.println("Los múltiplos de 3 entre 1 y " + num + " son:");
        
        // Sé que las iteraciones son de 1 a num, por lo que uso un bucle for
        for(int i = 1; i <= num; i++) {
            if(esMultiplo(i, DIVISOR)) {
                System.out.print(i + " ");
                contador++;
            }
        }
        
        System.out.println("\nSe han mostrado " + contador + " números.");
    }

    /**
     * Método principal.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirMultiplosDe3(pedirNumeroValido());
    }    

}
