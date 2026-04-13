package tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 * Programa que escribe en un fichero
 * nombres que nos da el usuario
 * separados por punto y coma y luego
 * lee el fichero mostrando un nombre 
 * en cada fila, sin los puntos y coma.
 * 
 * Usaremos throws en los métodos y 
 * capturaremos las excepciones 
 * en el método main.
 * 
 * @author d3stroya
 */
public class FicherosDeTexto {
    public final static String FICHERO = "nombres.txt";
    
    // 1. Pedir nombre (lanza InputMismatchException)
    public static String pedirNombre() throws InputMismatchException {
        System.out.print("Nombre: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    // 2. Añadir nombre a la lista hasta que el usuario quiera
    public static String pedirSeguir() throws InputMismatchException {
        System.out.print("¿Quieres añadir otro nombre? (s/n): ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void insertarNombres(ArrayList<String> lNombres) {
        System.out.println("- INSERTANDO NOMBRES -");
        do {            
            lNombres.add(pedirNombre());
            System.out.println("\n[v] Nombre añadido correctamente.");
        } while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    // 3. Escribir fichero (lanza FileNotFoundException e IOException)
    public static void escribirFichero(String fichero, ArrayList<String> lNombres) throws FileNotFoundException, IOException {
        System.out.println("\n- ESCRIBIENDO FICHERO -");
        
        try(
            FileWriter fw = new FileWriter(fichero);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            // Se puede encapsular esto en un método "escribir"
            for(String nombre : lNombres) {
                pw.println(nombre + ";");
            }
        }
    }
    
    // 4. Leer fichero (lanza FileNotFoundException e IOException)
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        System.out.println("\n- LEYENDO FICHERO -");
        
        try(
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
        ) {
            // Se puede encapsular esto en un método "leer"
            String linea = br.readLine();
            
            while(linea != null) {
                linea = linea.replace(";", "");
                System.out.println(linea);
                
                linea = br.readLine();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2. Creamos una lista donde añadir los nombres
        ArrayList<String> lNombres = new ArrayList<>();
        
        // 5. Llamamos a los métodos
        // Manejamos las excepciones que hemos lanzado
        try {
            
            insertarNombres(lNombres);
            escribirFichero(FICHERO, lNombres);
            leerFichero(FICHERO);  
            
        } catch(InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch(FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch(Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }
        
    }    

}
