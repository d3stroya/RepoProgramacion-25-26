package tema07.ejercicios;

/**
 * 1. Vector de 10 números enteros
 * 
 * 2. Rellenar el vector con 10 números aleatorios entre el 1 y el 8
 * 
 * 3. Mostrar el array
 * 
 * 4. Sustituir los números repetidos por 0
 * 
 *  4.2. Tengo que saber si un número está repetido. Cuando sepa, cambio
 *  los números que sean igual a ese de referencia.
 * 
 *      4.2.1. Recorro el array. Compruebo si el número actual está repetido 
 *      y si lo está cambio esos valores por 0
 *      
 *      4.2.3. Otra opción: Recorro el array comprobando cada número con todos los demas.
 *      Si el que comparo es igual al de referencia, cambio el comparado. 
 *      Solo al final, cambio el de referencia.
 * 
 * 5. Mostrar el array modificado
 * 
 *  5.1. Esto implica que solo trabajamos con 1 array, no con 2.
 * 
 * @author d3stroya
 */
public class Ejercicios10 {
    /**
     * Método que rellena el vector 
     * con números enteros aleatorios
     * entre 1 y 8.
     * 
     * @param vector 
     */
    public static void rellenar(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 8 + 1);
        }
    }
    
    /**
     * Método que muestra el vector
     * 
     * @param vector 
     */
    public static void mostrar(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
    
    /**
     * Método que busca en el array a partir 
     * de la posición siguiente a la actual
     * si hay algún número igual al que 
     * pasamos por parámetro (el número actual).
     * 
     * @param numero
     * @param vector
     * @param posicion
     * 
     * @return true si encuentra un número repetido y false en caso contrario
     */
    public static boolean esRepetido(int numero, int[] vector, int posicion) {
        boolean encontrado = false;
        
        while(posicion < vector.length && !encontrado) {
            if(vector[posicion] == numero) {
                encontrado = true;
            } else {
                posicion++;
            }
        }
        
        return encontrado;
    }
    
    /**
     * Método que sustituye los números repetidos por 0
     * buscando si el número actual está repetido y, en 
     * su caso, sustituyendo los números igual a él por 0.
     * 
     * @param vector 
     */
    public static void sustituirRepetidos(int[] vector) {
       int numActual;
        // Recorro el vector
        for(int i = 0; i < vector.length; i++) {
            
            // Si el número acutal es 0, es porque ya está cambiado,
            // así que lo ignoro
            if(vector[i] != 0) {
                
                // Compruebo si el número actual está repetido,
                // comparando el número actual con el resto de números
                // a partir de la siguiente posición.
                numActual = vector[i];
                if(esRepetido(numActual, vector, i + 1)) {

                    // Sustituyo el número en la posición actual por 0
                    vector[i] = 0;

                    // Recorro el vector a partir de la posición siguiente 
                    // cambiando el número repetido por 0
                    for(int j = i + 1; j < vector.length; j++) {
                        if(vector[j] == numActual) {
                            vector[j] = 0;
                        }
                    }
                }
            
            }
        }
    }
    
    
    /**
     * Método que sustituye los números repetidos por 0
     * tomando uno de referencia y comparándolo con los 
     * números del resto del vector desde su posición en adelante.
     * 
     * @param vector 
     */
    public static void cambiarRepetidos(int[] vector) {
        boolean repetido = false;
        int num1, num2;
        
        // Tomamos un número de referencia
        for(int i = 0; i < vector.length; i++) {
            num1 = vector[i];
            
            if(num1 != 0) { // Ya está en 0, no tenemos que hacer nada
                
                // Comprobamos el resto de números (num2) con el número de referencia (num1)
                for(int j = i + 1; j < vector.length; j++) {
                    num2 = vector[j];
                    
                    if(num2 == num1) {  // Si coinciden, se sustituye num2 por 0 y marcamos repetido como true
                        vector[j] = 0;
                        repetido = true;
                    }
                }   
                
            }
            
            if(repetido) {  // Si el número es repetido, ponemos num1 a 0
                vector[i] = 0;                    
                repetido = false;   // IMPORTANTE: reseteamos repetido a false para volver a comprobar. Si no, pondrá todos los números a 0.
            }
        }        
    }
    
    public static void main(String[] args) {
        // 1. Creo un vector de 10 posiciones
        int[] vector = new int[10];
        
        // 2. Relleno el vector
        rellenar(vector);
        
        // 3. Muestro el vector
        mostrar(vector);
        System.out.println("");
        
        // 4. Intercambio los valores repetidos
//        sustituirRepetidos(vector);
        cambiarRepetidos(vector);

        
        // 5. Muestro el vector de nuevo
        mostrar(vector);
        
    }
}
