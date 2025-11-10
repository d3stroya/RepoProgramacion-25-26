package tema4.ejercicios;

import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Ejercicio07Burbuja {
    public final static int CANTIDAD_NUMEROS = 4;
    
    /**
     * Método que pide al usuario un número entero.
     * 
     * @return el número escrito por el usuario.
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" -> ");
        return entrada.nextInt();
    }
    
    /**
     * Método que ordena los 4 números pasados por parámetro
     * utilizando el método de la burbuja con un bucle for.
     * 
     * Siempre itera n - 1 veces
     * 
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void mostrarNumerosOrdenados(int num1, int num2, int num3, int num4) {
        System.out.println("\nOrdenando  números...");
        // Declaramos una variable para guardar temporalmente el valor que queremos intercambiar
        int tmp;

        // Iteramos n - 1 veces para asegurarnos de que todos los números quedan ordenados
        for(int i = 0; i < CANTIDAD_NUMEROS - 1; i++) {
            
            // Comparo los dos primeros números
            // Si el primero es mayor que el segundo, intercambio los valores
            if(num1 > num2) {
                tmp = num1;
                num1 = num2;
                num2 = tmp;
            }
            
            // Comparo los dos siguientes números y hago lo mismo
            if(num2 > num3) {
                tmp = num2;
                num2 = num3;
                num3 = tmp;
            }
            
            // Comparo los dos siguientes números y hago lo mismo
            if(num3 > num4) {
                tmp = num3;
                num3 = num4;
                num4 = tmp;
            }
            
            System.out.println("  Orden de los números en la iteración " + (i + 1));
            System.out.println("  " + num1 + " - " + num2 + " - " + num3 + " - " + num4);            
        }
        
        System.out.println("\nLos números ordenados son:");
        System.out.println(num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
    
    // OTRA FORMA DE HACER LO MISMO, PERO DE MANERA MÁS ÓPTIMA //
    /**
     * Método que ordena los 4 números pasados por parámetro
     * utilizando un bucle do while.
     * 
     * Es necesario iterar 1 vez, como mínimo, 
     * para comprobar si los números están ordenados.
     * 
     * Solo en el peor de los casos iterará n - 1 veces.
     * 
     * Si los números ya están ordenados antes de la iteración n - 1,
     * el bucle se detiene, optimizando el algoritmo.
     * 
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void mostrarNumerosOrdenadosMasOptimo(int num1, int num2, int num3, int num4) {
        System.out.println("\nOrdenando  números...");
        int tmp;
        int i = 0;
        
        // Creo una variable booleana para comprobar si hay cambios.
        // Si no hay cambios, saldré del bucle, porque los números ya están ordenados.
        boolean cambio;
        
        // Iteramos una vez para ordenar los números.
        // Si no hay cambios, es porque ya están ordenados y saldremos del bucle.
        do {           
            // Reseteo la variable cambio
            cambio = false;
            
            // Comparo los dos primeros números
            // Si el primero es mayor que el segundo, intercambio los valores
            // y pongo cambio a true.
            if(num1 > num2) {
                tmp = num1;
                num1 = num2;
                num2 = tmp;
                cambio = true;
            } 
            
            // Comparo los dos siguientes números y hago lo mismo
            if(num2 > num3) {
                tmp = num2;
                num2 = num3;
                num3 = tmp;
                
                if(!cambio) {
                    cambio = true;
                }
            } 
            
            // Comparo los dos siguientes números y hago lo mismo
            if(num3 > num4) {
                tmp = num3;
                num3 = num4;
                num4 = tmp;
                
                if(!cambio) {
                    cambio = true;
                }
            }
            
            // Imprimo el orden actual de los números
            // Esto es totalmente prescindible, pero nos sirve para ver el proceso
            System.out.println("  Orden de los números en la iteración " + (i + 1));
            System.out.println("  " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
            
            // Incremento el índice
            i++;
                        
        } while(i < CANTIDAD_NUMEROS - 1 && cambio);
        
        // Muestro los números ordenados
        System.out.println("\nLos números ordenados son:");
        System.out.println(num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }

    /**
     * Método principal.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables
        int num1, num2, num3, num4;
        
        // Doy instrucciones al usuario
        System.out.println("- MÉTODO DE LA BURBUJA -");
        System.out.println("A continuación se te pedirán 4 números enteros"
                + " y, posteriormente, se mostrarán ordenados.");
        System.out.println("Escribe los números de uno en uno y pulsa enter para guardar cada uno:");
        
        // Pido los 4 números y los guardo en variables
        num1 = pedirNumero();
        num2 = pedirNumero();
        num3 = pedirNumero();
        num4 = pedirNumero();
        
        // Muestro los números ordenados
        System.out.println("\n- ORDENANDO NÚMEROS CON FOR -");
        mostrarNumerosOrdenados(num1, num2, num3, num4);
        
        System.out.println("\n- ORDENANDO NÚMEROS CON DO WHILE -");
        mostrarNumerosOrdenadosMasOptimo(num1, num2, num3, num4);
    }    

}
