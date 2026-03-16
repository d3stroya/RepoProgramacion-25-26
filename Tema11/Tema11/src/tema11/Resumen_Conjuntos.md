# Introducción
Los conjuntos son estructuras de datos dinámicas que nos permiten 
almacenar objetos únicos, es decir, nunca habrá elementos repetidos 
en un conjunto. 

[Enlace a Vídeo](https://youtu.be/3lUdNfcaIsw)

## Ejemplos
Imagina que tenemos una aplicación que conecta usuarios según sus intereses.

* A María le gusta el surf, los perros y la cocina italiana.
* A Juan le gustan los gatos, el montañismo y la cocina italiana.
* Si comparamos ambos conjuntos, podemos quedarnos solo con los elementos 
comunes: la cocina italiana.

Pero también se puede usar en videojuegos online para mostrar los usuarios 
conectados: hay un conjunto de jugadores en línea al que se conectan o 
desconectan nuevos usuarios.

## Jerarquía
Java cuenta con una Interfaz Set, que hereda de la interfaz Collection 
y que es implementada en 3 clases: HashSet, LinkedHashSet y TreeSet.

## Tipos
Existen 3 tipos de conjuntos:
* HashSet: es el más rápido, ya que inserta los elementos sin orden. 
Lo usaremos cuando no queramos un orden específico.
* LinkedHashSet: mantiene orden de inserción, así que lo utilizaremos 
cuando queramos mantener ese orden (por ejemplo, para registrar los 
tiempos de llegada en una carrera).
* TreeSet: ordena los elementos de menor a mayor.

## Algoritmos
Las principales acciones que podemos realizar con un conjunto son:
* Insertar elementos con el método .add(elemento)
* Insertar todos los elementos de una colección preexistente, como un ArrayList, por ejemplo, con el método .addAll(colección)
* Recorrer el conjunto con for-each o con iterador (usando el método .iterator()). 
    * ¡OJO! No podemos usar un for con índice, porque los elementos del conjunto NO tienen índice.
* Eliminar un elemento del conjunto con el método .remove(elemento)
* Eliminar todos los elementos del conjunto con el método .clear()
* Comprobar si el conjunto está vacío con el método .isEmpty()
* Conocer el tamaño del conjunto con el método .size()
* Comprobar si el conjunto contiene un objeto concreto con el método .contains(elemento)
* Intersección: Quedarnos con los elementos de un conjunto que están en otra colección usando el método .retainAll(colección)

Visita la API de Java: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html
