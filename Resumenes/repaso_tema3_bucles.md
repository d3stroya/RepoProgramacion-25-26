# Estructuras de repetición o bucles

Cuando tenemos que repetir varias veces lo mismo, usamos bucles 
en lugar de repetir n veces el mismo código.

En Java, disponemos de 3 bucles:
* for: repetir un número fijo de veces.
* while: repetir mientras se cumpla una condición.
* do-while: repetir al menos una vez y mientras se cumpla la condición.

## For
El bucle for se utiliza cuando sabemos cuántas veces queremos repetir algo.
Por ejemplo, queremos repetir 10 veces la sentencia System.out.println("Hola"); 10 veces:

```java
for(int i = 0; i < 10; i++) {
    System.out.println("Hola");
}
```

El bucle for tiene 3 partes:
1. Inicialización: se ejecuta una vez al inicio del bucle (int i = 0).
2. Condición: se ejecuta al inicio de cada iteración (i < 10).
3. Incremento: se ejecuta al final de cada iteración (i++).


## while
El bucle while se utiliza cuando no sabemos cuántas veces queremos repetir algo.
Por ejemplo, queremos jugar con el usuario a adivinar un número, por lo que le preguntaremos 
por un número entero mientras no lo acierte. De antemano, no sabemos cuántas veces iteraremos, 
ya que depende de cuántos intentos necesite el usuario para acertar.

```java
int numero = 5;
boolean acierto = false;

Scanner entrada = new Scanner(System.in);

while(!acierto) {
    int numeroUsuario = entrada.nextInt();
    if(numeroUsuario == numero) {
        acierto = true;
        System.out.println("Has acertado");
    } else {
        System.out.println("Has fallado");
    }
}
```

## do-while
El bucle do-while se utiliza cuando queremos repetir al menos una vez y mientras se cumpla la condición.
Habitualmente se utiliza en menús, en los que queremos mostrar y gestionar el menú hasta que el usuario decida salir.

```java
int opcion = 0;

do {
    System.out.println("Menú");
    System.out.println("1. Opción 1");
    System.out.println("2. Opción 2");
    System.out.println("3. Opción 3");
    System.out.println("4. Salir");

    opcion = entrada.nextInt();
    
    switch(opcion) {
        case 1:
            System.out.println("Has seleccionado la opción 1");
            break;
        case 2:
            System.out.println("Has seleccionado la opción 2");
            break;
        case 3:
            System.out.println("Has seleccionado la opción 3");
            break;
        case 4:
            System.out.println("Hasta luego");
            break;
        default:
            System.out.println("Opción no válida");
            break;
    }
} while(opcion != 4);


```
