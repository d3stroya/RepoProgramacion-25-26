package tema4.ejercicios;

import tema4.utilidades.Utilidades;

/**
 *
 * @author d3stroya
 */
public class Ejercicio26 {
    /**
     * Método que determina si un número es primo o no.     
     * Un número es primo cuando solo es divisible por 1 o por él mismo.
     * 
     * Buscamos un divisor para el número pasado por parámetro.
     * Si se encuentra, muestra que el número no es primo.
     * Si no se encuentra un divisor, muestra que el número es primo.
     * 
     * Para ello, iteramos entre 2 y num hasta que encontramos un divisor, 
     * es decir, un número que, al dividir num entre él, el resto sea 0.
     * Si se cumple la condición, indicamos que hemos encontrado un divisor
     * y dejamos de buscar.
     * 
     * Esto se puede optimizar iterando entre 2 y num/2.
     * Y se puede optimizar más aún iterando entre 2 y la raíz cuadrada de num.
     * 
     * @param num 
     */
    public static void esPrimo(int num) {
        // Voy a iterar hasta que encuentre un divisor
        int i = 2;
        boolean enc = false;
        
        while(i <= Math.sqrt(num) && !enc) {
            if(num % i == 0) {
                enc = true;
                System.out.println(num + " es divisible por " + i + ", lo que supone que no es primo.");
            } else {
                i++;                
            }                        
            
        }
        
        if(!enc) {
            System.out.println(num + " es primo.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        esPrimo(Utilidades.pedirNumero());
    
    }    

}
