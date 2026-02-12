
package tema08arraysdeobjetos;

import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class UsoClaseArrays {
    /**
     * Método principal
     * 
     * @param args 
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] vector = new int[10];
        Marcador[] marcadores = new Marcador[3];
        
        // 1. Importar la clase Arrays
        
        // 2. Métodos de la clase Arrays:
        // 2.1. fill(vector, índiceInicioIncluido, índiceFinExcluido, dato): rellena todo el array de referencias al mismo objeto. Más útil para tipos de datos simples.
//       for(int numero : numeros) {
//            System.out.print(numero + " ");
//        }
//       
//        System.out.println("");
//       
//        Arrays.fill(numeros, -1);
//       
//        for(int numero : numeros) {
//            System.out.print(numero + " ");
//        }
//        System.out.println("");
//        
//        Arrays.fill(numeros, 0, 6, 3);
//        
//        for(int numero : numeros) {
//            System.out.print(numero + " ");
//        }
//        System.out.println("");

//        for(int i = 0; i < numeros.length; i++) {
//            numeros[i] = (int)(Math.random() * 10);
//        }

        Marcador marcadorVerde = new Marcador("Verde", 0.5f);
//         Arrays.fill(marcadores, marcadorVerde);
//         
//         marcadorVerde.setPrecio(0.57f);
//        marcadores[0].setPrecio(0.65f);
//         System.out.println(Arrays.toString(marcadores));
        
        // 2.2. equals(vector1, vector2): nos dice si dos arrays son iguales (mismo tamaño y mismos valores en cada posición)
//        System.out.println(Arrays.equals(numeros, vector));
        
        // 2.3. toString(vector): Muestra por pantalla los datos que contiene el vector (es igual que el método toString() de cualquier otro objeto
//        System.out.println(Arrays.toString(numeros));
        
        // 2.4. sort(vector): Ordena el array de mayor a menor. 
        // ¡OJO! Hay que implementar la interfaz Comparable en la clase con la que creamos los objetos
//        Arrays.sort(numeros);
//        System.out.println(Arrays.toString(numeros));

        // Rellenamos el array
        marcadores[0] = new Marcador("Verde", 0.5f);    
        marcadores[1] = new Marcador("Rosa", 0.6f);    
        marcadores[2] = new Marcador("Azul", 0.3f);  
        
        System.out.println(Arrays.toString(marcadores));
        Arrays.sort(marcadores);
        System.out.println(Arrays.toString(marcadores));
        
        
        // 2.5. binarySearch(vector, dato): Busca un dato en el array, que debe estar ordenado
//        System.out.println(Arrays.binarySearch(numeros, 11));
//        if(Arrays.binarySearch(numeros, 11) < 0) {
//            System.out.println("El número 11 no está en el array");
//        }

        System.out.println(Arrays.binarySearch(marcadores, marcadorVerde));
    }
}
