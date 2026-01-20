package tema07;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Un array es un contenedor de longitud fija
 * que guarda elementos indexables del mismo tipo 
 * en celdas contiguas de la memoria.
 * 
 * Se usan cuando sabemos cuántos elementos
 * necesitamos almacenar.
 * 
 * Es una estructura muy rápida para acceder 
 * a los valores (a través de un índice).
 * 
 * @author d3stroya
 */
public class MiClaseDeArrays {
    
    public static void main(String[] args) {
        // 1. DECLARAR UN ARRAY
        // Declarar un array con valores predefinidos
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Declarar un array sin valores predefinidos (indicamos su tamaño)
        int[] temperaturasPorSemana = new int[7];
        
        // ¡IMPORTANTE!: Por defecto, se inicializan con todas sus posiciones a 0.
        System.out.println(Arrays.toString(temperaturasPorSemana));
        
        

        // 2. ACCEDER A UN ELEMENTO DEL ARRAY: [indice]
        int indice = 2;
        System.out.print("El día " + (indice + 1) + " de la semana es: ");
        
        System.out.println(diasSemana[indice]);
        
        
        
        
        
        // 3. INSERTAR UN ELEMENTO EN UNA POSICIÓN: array[indice] = valor;
        temperaturasPorSemana[0] = 1;
        
        
        
        
        // 4. RECORRER Y MOSTRAR UN ARRAY
        // Obtener la longitud de un array
        System.out.println("\n-> Tamaño de diasSemana: " + diasSemana.length);
        
        System.out.println("\n-> Mostrando con for...");
        mostrar(diasSemana);
        
        System.out.println("\n-> Mostrando con for-each...");
        mostrarConForEach(diasSemana);
        
        
        
        // 5. RELLENAR UN ARRAY
        rellenarArray(temperaturasPorSemana);
        
        
        
        // 6. BUSCAR UN ELEMENTO EN EL ARRAY
        System.out.print("\n-> ¿Está 'Martes' en el array diasSemana? ");
        System.out.println(buscar(diasSemana, "Martes"));
        
           
        
        // 7. DEVOLVER VARIOS VALORES
//        temperaturasPorSemana = devolverTemperaturas(diasSemana);
//        mostrarConArrayAuxiliar(temperaturasPorSemana, diasSemana);
        


        // 8. ORDENAR UN ARRAY
        System.out.println("\n-> Ordenando array...");
        ordenarArray(temperaturasPorSemana);
        
        // Lo mostramos
        for(int i = 0; i < temperaturasPorSemana.length; i++) {            
            System.out.print(temperaturasPorSemana[i] + "ºC");
            if(i < temperaturasPorSemana.length - 1) {
                System.out.print(", ");
            }                        
        }
        

        
        // AMPLIACIÓN: OTRAS FORMAS DE MOSTRAR UN ARRAY
        System.out.println("\n\n-> Arrays.toString()");
        System.out.println(Arrays.toString(diasSemana));
        
        System.out.println("\n-> Arrays.stream(array).forEach()");
        Arrays.stream(diasSemana).forEach(System.out::println);
        
        
        
        // 9. ERRORES COMUNES
        // ArrayIndexOutOfBoundsException: intentamos acceder a un índice que no existe
        System.out.println(diasSemana[7]);
        
        // Lo manejamos con try-catch
        try {
            System.out.println(diasSemana[7]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Estás intentando acceder a un índice que no existe");
        }
        
    }
    
    
    
    
    
    /**
     * Método que recorre y muestra los elementos del 
     * array pasado por parámetro.
     * 
     * @param array 
     */
    public static void mostrar(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ] ");            
        }
        System.out.println();
    }
    
    /**
     * Método que recorre y muestra los elementos 
     * del array pasado por parámetro usando
     * un bucle for-each: for ( tipoDeDato variableIndexable : arrayRecibido )
     * 
     * @param array 
     */
    public static void mostrarConForEach(String[] array) {
        for(String elemento : array) {
            System.out.print("[ " + elemento + " ]");
        }
        System.out.println();
    }
    
    /**
     * Método que busca dentro del array diasSemana 
     * pasado por parámetro el día también pasado por parámetro.
     * 
     * @param array
     * @param elemento     
     * @return true si lo encuentra y false en caso contrario
     */
    public static boolean buscar(String[] array, String elemento) {
        boolean encontrado = false;
        int i = 0;
        
        while(i < array.length && !encontrado) {
            if(array[i].equalsIgnoreCase(elemento)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        
        return encontrado;
    }
    
    /**
     * Método que recorre un array y lo rellena
     * con números aleatorios entre el 1 y el 10.
     * 
     * @param array 
     */
    public static void rellenarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10 + 1);
        }
    }
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        // Inicializo con un número fuera del rango
        int numero = -1000;
        
        // Lo pido hasta que sea válido (se sobreescriba su valor con el que nos dé el usuario).
        do {
            
            try {
                numero = entrada.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Dato incorrecto. Introduce un número entero, por favor.");
                entrada.next();
            }
            
        } while(numero == -1000);
        
        return numero;
    }
    
    /**
     * Método que devuelve las temperaturas de los 7 días de la semana.
     * @param diasSemana 
     * @return array de enteros con las temperaturas de la semana
     */
    public static int[] devolverTemperaturas(String[] diasSemana) { 
        int[] temperaturas = new int[diasSemana.length];
        
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura del " + diasSemana[i] + ": ");
            temperaturas[i] = pedirNumero();
            System.out.println();
        }
        
        return temperaturas;
    }
    
    /**
     * Método que recorre los dos arrays pasados por parámetro
     * para mostrar los valores del mismo índice,
     * haciendo corresponder cada día con su temperatura.
     * 
     * @param temperaturas
     * @param diasSemana 
     */
    public static void mostrarConArrayAuxiliar(int[] temperaturas, String[] diasSemana) {
        System.out.println("- TEMPERATURAS DE LA SEMANA -");
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.println(" · " + diasSemana[i] + ": " + temperaturas[i]);
        }
    }
    
    /**
     * Método que ordena de menor a mayor 
     * todos los elementos de un array.
     * ¡¡OJO!! Esto modifica el array. 
     * Si lo queremos mantener, hay que hacer una copia.
     * 
     * @param array 
     */
    public static void ordenarArray(int[] array) {
        int aux;
        
        // Recorremos el array para ordenar todos sus elementos
        for(int i = 0; i < array.length; i++) {
            
            // Recorremos n - 1 veces para ordenar los elementos
            for(int j = 0; j < array.length - 1; j++) {
                
                // Comparamos los elementos por pares y los intercambiamos si es necesario
                if(array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }
}
