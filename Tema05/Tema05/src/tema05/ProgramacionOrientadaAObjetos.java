package tema05;

import java.util.Scanner;


/**
 * Esta clase es la principal del proyecto 
 * y es en la que instanciaremos los objetos
 * y trabajaremos con ellos. 
 * 
 * @author d3stroya
 */
public class ProgramacionOrientadaAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Instancio un objeto del tipo que he creado
        // 1.1. Con constructor parametrizado y estableciendo valores con setters        
//        Coche miCoche = new Coche();
//        System.out.println(miCoche.toString());
//        
//        miCoche.setEspejos(5);
//        System.out.println(miCoche.toString());
//        
//        System.out.println(miCoche.getEspejos());
//        
//        miCoche.acelerar();

        
        // 1.2. Con constructor parametrizado, inicializando los atributos 
        // con los valores pasados por parámetro
        Coche tuCoche = new Coche("Michelín", "Baja", 3);
        System.out.println(tuCoche.toString());
        
        // Esto hace lo mismo que la línea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
        
    }    

}
