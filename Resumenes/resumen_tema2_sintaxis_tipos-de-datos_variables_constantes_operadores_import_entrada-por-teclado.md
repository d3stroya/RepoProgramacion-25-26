# Estructura y sintaxis de un programa en Java
Java se compone de **clases**; cada archivo es una clase.

Cada clase tiene:
* **Atributos** (características)
* **Métodos** (comportamientos)

Los **métodos** tienen:
* **Variables** (almacenan valores)
* **Instrucciones o sentencias** (le dicen a la máquina qué hacer)

Todos los programas tienen una **clase principal**, 
que contiene el **método principal (main)**, 
que es el que ejecuta el programa, ya que 
desde este método principal se llama al resto de métodos.

**Veamos un ejemplo:**

Imagina que quieres desarrollar un videojuego. 
Tendrás diferentes clases:
* **Jugador**
    * *Atributos* (características): 
        * Nivel de vida
        * Energía
        * Armas
    * *Métodos (comportamientos)*:
        * Andar
        * Correr
        * Saltar
        * Atacar

* **Boss**
    * *Atributos (características)*: 
        * Nivel de vida
        * Arma
    * *Métodos (comportamientos)*:
        * Correr
        * Saltar
        * Atacar
        * Defender
    
* **Clase principal**
    * *Método (comportamientos)*:
        * Empezar el juego
        * main: llama a Empezar el juego


## Tipos de datos simples
Indican el formato del dato y reservan más o menos espacio en memoria según el tipo.

Los tipos de dato simples son:
* **Números enteros**:
    * byte: 8 bits
    * short: 16 bits
    * int: 32 bits
    * long: 64 bits
* **Números decimales**:
    * float: coma flotante de precisión simple
    * double: coma flotante de precisión doble
* **Caracter**:
    * char: un caracter
* **Booleanos**:
    * boolean: true o false

```
// ENTEROS
byte nota = 4;
short edad = 18;
int velocidad = 300;
long clave = 432817284589123581051283592;

// DECIMALES
float notaMedia = 6.8f;
double medida = 72348,21958294028917239528925

// CARACTERES
char letraDni = 'A';

// BOOLEANOS
boolean encontrado = false;
boolean encendido = true;
```

## Variables
Almacenan valores en memoria. Para usarlas:
1. Declarar la variable indicando el tipo de dato que va a almacenar
para reservar el espacio adecuado en memoria.
2. Inicializar la variable asignándole el valor que queremos guardar.

```
// Declaramos la variable
int nivelVida;

// Inicializamos la variable
nivelVida = 100;
```

Podemos hacer las dos cosas al mismo tiempo:
```
int nivelVida = 100;
```
También podemos declarar e inicializar más de una variable a la vez:
```
int nivelVida, energia;
int nivelVida = 100; energia = 50;
```

### Ámbito de las variables
Las variables pueden tener dos ámbitos:
* **Local**: están dentro de un método y solo pueden actuar dentro de él; fuera no existen.
* **Global**: son atributos de la clase y pueden actuar en cualquier punto de la clase. Por tanto
cualquier método puede usarlas.

```
public class Suma {
    private int numeroGlobal = 3;

    public void imprimirNumero() {
        int numeroLocal = 6;
    }

    public static void main(String[] args) {
        int numeroLocalMain = 4, resultado;

        // Esto funciona porque numeroLocalMain forma parte de este método
        // y numeroGlobal puede actuar en toda la clase.
        resultado = numeroLocalMain + numeroGlobal;

        // Esto me da error de compilación porque numeroLocal solo existe dentro de
        // del método imprimirNumero, pero no puede actuar dentro del método main.
        resultado = numeroLocal + numeroGlobal;
    }
}
```

### Constantes
Son cajitas en las que almacenamos valores constantes, es decir, que no varían,
como la velocidad de la luz, la gravedad o el número Pi.

Se declaran e inicializan a la vez al principio de la clase, como atributos.
Es obligatorio indicar que es una constante con 'final static':
```
public class Main {
    final static float GRAVEDAD = 9.8f;
    final static int IVA = 21;

    public static void main(String[] args) {
        System.out.println("La gravedad es " + GRAVEDAD)
    }
}
```

## Operadores
Los operadores nos permiten realizar operaciones con los valores que guardamos en variables.

Existen diferentes tipos de operadores.
1. **Aritméticos**: los archiconocidos
    * '+'
    * '-'
    * '*'
    * '/'
    * '%': el resto de la división de los dos valores


2. **Relacionales**: nos dan el resultado de comparar dos valores y nos da como resultado true si se cumple la relación y false en caso contrario.
    * '<': el primer valor es menor que el segundo
    * '>': el primer valor es mayor que el segundo
    * '<=': el primer valor es menor o igual que el segundo
    * '>=': el primer valor es mayor o igual que el segundo
    * '==': los valores son iguales
    * '!=': los valores son distintos

3. **Lógicos**: valoran condiciones y nos dan como resultado un true o un false
* '&&': nos da true si los dos valores son true
* '||': nos da false cuando los dos valores son false y true en el resto de los casos
* '!': invierte el valor (true si es false y false si es true)

4. **Unarios**: un único operando
* '++': incrementa el valor en 1
* '--': decermenta el valor en 1

5. **Asignación**: asignan valores a una variable
* '=': asigna un valor a la variable
* '+=': suma el valor a la variable actual y le asigna el valor del resultado. Es lo mismo a += b que a = a + b.
* '-=' es igual que a = a - b;
* '*=' es igual que a = a * b;
* '/=' es igual que a = a / b;
* '%=' es igual que a = a % b;

## Paquetes y la sentencia *import*
Un paquete es un conjunto de clases que nos facilitan una serie de utilidades. 
De java heredan distintos paquetes, como por ejemplo, *java.io*, que nos permite trabajar con ficheros.

Para utilizar una clase de un paquete, necesitamos importarla con la sentencia import:
```
// Importamos la clase File del paquete java.io
import java.io.File;
```

También podemos importar todas las clases de un paquete:
```
// Importamos el paquete java.io completo (todas sus clases)
import java.io.*;
```

## Entrada de datos por teclados
El paquete java.util tiene un clase (Scanner) que nos permite leer datos
que el usuario introduzca por teclado.

Aunque ahora no vamos a entender muy bien qué estamos haciendo, 
siempre vamos a leer datos de esta manera:

```
// 1. Creamos nuestro escáner
Scanner entrada = new Scanner(System.in);

// 2. Pedimos el dato al usuario mostrando un mensaje por pantalla
System.out.println("¿Cuántos años tienes?");

// 3. Leemos la entrada del usuario
int edad = entrada.nextInt(); // Esto guarda en la variable edad el número entero que introduzca el usuario

// 4. Mostramos el resultado
System.out.println("Tienes " + edad + " años.");
```