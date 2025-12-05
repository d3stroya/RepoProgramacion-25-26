# Algoritmos recurrentes

## Ordenación

### Método de la burbuja
Dados 3 números enteros n1, n2 y n3, ordenarlos de menor a mayor.

```java
/**
 * Método que recibe por parámetro 3 números enteros
 * y los ordena de menor a mayor, mostrándolos al final.
 */
public void burbuja(int n1, int n2, int n3) {
    // Variable auxiliar para intercambiar los valores
    int aux;

    // Comparamos los valores de dos en dos n - 1 veces (en este caso, 3 - 1 = 2 veces)
    for(int i = 0; i < 3; i++) {
        if(n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if(n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
    }

    System.out.println(n1 + " " + n2 + " " + n3);
}
```

## Búsqueda
Buscamos un número dado entre 1 y 10.
```java
// ïndice
int i = 1

// Variable booleana que nos ayuda a saber si hemos encontrado lo que buscamos. 
// Cuando lo encontramos, paramos de buscar.
boolean encontrado = false;

// Bucle while para buscar mientras no encontramos lo que buscamos
while(!encontrado && i <= 10) {
    if(i == numeroBuscado) {
        encontrado = true;
        System.out.println("Encontrado: " + i);
    } else {
        i++;
    }
}

```


## Menú
Un ménu SIEMPRE tiene 3 elementos anidados en este orden:
1. do-while
2. try-catch
3. switch-case

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public static int pedirOpcion() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Elige una opción: ");
    return entrada.nextInt();
}

public static void mostrarMenu() {
    System.out.println("- MENÚ -");
    System.out.println("1. Opción 1");
    System.out.println("2. Opción 2");
    System.out.println("3. Salir");
}

int opcion = 0;

// Mostramos el menú con DO-WHILE y lo gestionamos mientras el usuario no pulse salir (3).
do {

    // Intentamos gestionar el menú con TRY-CATCH, teniendo en mente que el usuario puede equivocarse
    // e introducir un tipo de dato erróneo (ver bloque catch).
    try {
        mostrarMenu();
        opcion = pedirOpcion();

        // Gestionamos la opción elegida por el usuario con un SWITCH-CASE
        switch(opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 1");
                break;
            case 2:
                System.out.println("Has seleccionado la opción 2");
                break;
            case 3:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    // Capturamos la excepción en caso de que el usuario introduzca un tipo de dato erróneo.
    } catch (InputMismatchException e) {
        System.out.println("Error: Introduce un número entero.");
    }

    
} while(opcion != 3);
```