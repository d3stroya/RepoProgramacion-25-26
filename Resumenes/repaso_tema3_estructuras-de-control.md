# Estructuras de control de flujo
Hasta ahora hemos creado programas con instrucciones secuenciales:
primero una, luego otra, luego otra... Esto es un flujo lineal.

En esta unidad vamos a aprender a controlar el flujo del programa
ejecutando, por ejemplo, una instrucción varias veces
o ejecutando una instrucción u otra en función de una condición.

Entre las cosas que podemos hacer están:
* Imprimir n números desde a hasta b.
* Repetir una sentencia n veces sin escribirla n veces.
* ...

Vamos a aprender:
1. Estructuras condicionales
2. Estructuras de repetición (bucles)
3. Sentencias de salto (no recomendables)
4. Control de excepciones

## Estructuras condicionales
Valoran si se cumple una condición y ejecutan la sentencia correspondiente.

* if else: 
* switch-case: 

### If
Evalúa 1 condición. Si se cumple la condición, 
se ejecuta la sentencia

```
boolean eresPalestino = true;
int edad = 10;

if(eresPalestino == true) {
    System.out.println("Netanyahu te lanza un misil");
}

if(eresPalestino && edad < 16) {
    System.out.println("Refugiarte en un hospital no te va a salvar");
}
```

### If else
Evalúa 2 condiciones. 
Si se cumple la condición, ejecuta la sentencia. 
Si no, ejecuta la otra sentencia.

```
boolean eresPalestino = true;

if(eresPalestino) {
    System.out.println("Netanyahu te lanza un misil");
} else {
    System.out.println("Netanyahu todavía no va a por ti");
}
```

### switch case
Evalúa más de 2 condiciones y ejecuta 
la sentencia de la condición que se cumpla.

```
// Declaramos las variables
int opcion;

// Creamos nuestro escáner
Scanner entrada = new Scanner(System.in);

// Mostramos el menú
System.out.println("Elija una opción:");
System.out.println("1. Mirar a otro lado");
System.out.println("2. Protestar pacíficamente");
System.out.println("3. Entrar en guerra");
System.out.println("4. Aportar ayuda humanitaria");
System.out.println("5. Salir");

// Leemos la opción elegida por el usuario 
// y la guardamos en la variable opcion
opcion = entrada.nextInt();

// Ejecutamos el switch-case
switch(opcion) {
    case 1: 
        System.out.println("Has elegido mirar a otro lado");
    case 2:
        System.out.println("Has elegido protestar pacíficamente");
    case 3:
        System.out.println("Has elegido entrar en guerra");
    case 4: 
        System.out.println("Has elegido aportar ayuda humanitaria");
    case 5:
        System.out.println("Gracias por usar el programa");
    default:
        System.out.println("Opción no válida. Selecciona un valor entre 1 y 5.");
}
```