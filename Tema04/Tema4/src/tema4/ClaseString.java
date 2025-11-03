package tema4;

import java.util.Scanner;


/**
 * La clase String pertenece al paquete java.lang,
 * al igual que la clase Math. Esto supone que no 
 * tenemos que importarla para poder usarla (recuerda 
 * que el paquete java.lang se importa automáticamente).
 * 
 * String es un tipo de dato que nos permite trabajar
 * con un conjunto de caracteres (palabras o frases), 
 * comúnmente llamadas "cadenas".
 * Podemos guardar esos valores en variables (entre comillas dobles ""),
 * convertirlos a mayúsculas o minúsculas, comparar
 * dos cadenas, etc.
 * 
 * @author d3stroya
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar una variable de tipo String
        String nombre;
        String nombre1;
        
        // Inicializar la variable
        nombre = "Manolo";
        nombre1 = "manolo";
        
        
        // Declarar e inicializar una variable de tipo String
        String apellido = "Arsanaliev";
        
        
        // Pedir una cadena al usuario
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("¿Cuál fue el último trofeo que ganaste?: ");
//        String trofeo = entrada.nextLine();
//        System.out.println("Has ganado el trofeo " + trofeo);
        
        
        // Comparar dos valores ( .equals() e .equalsIgnoreCase() )
        if(nombre.equals(nombre1)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        if(nombre.equalsIgnoreCase(nombre1)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
                
    }    

}
