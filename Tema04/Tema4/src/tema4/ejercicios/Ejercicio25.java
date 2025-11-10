package tema4.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Ejercicio25 {
    public static double potencia(int a, int b) {
        return Math.pow(a, b);
    }
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static void main(String[] args) {
        int base, exponente;
        double resultado;
        
        try {
            System.out.print("Escribe la base: ");
            base = pedirNumero();

            System.out.print("Escribe el exponente");
            exponente = pedirNumero();
            
            if(base == 0 && exponente < 0) {
                System.out.println(base + " elevado a un número negativo es una indeterminación." );
            } else {
                resultado = Math.pow(base, exponente);
                System.out.println("El resultado es " + resultado);                
            }
            
        } catch(InputMismatchException e) {
            System.out.println("Error: tipo de dato incorrecto");
        }
                
    }
}
