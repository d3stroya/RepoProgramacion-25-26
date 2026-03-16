# Introducción
Los mapas son estructuras de datos dinámicas que nos permiten almacenar 
pares clave-valor. Esto implica que los objetos NO tienen índice, sino 
que se identifican con su clave. Una clave puede ser de cualquier tipo de 
dato (siempre que sea un objeto) y siempre será única (por ejemplo, el DNI, 
un id, etc.).

[Enlace a vídeo](https://youtu.be/QHE_wJISdNo)

## Ejemplos
Imagina que tenemos una aplicación que gestiona una tienda. 
Almacenaremos los productos en un mapa usando como clave el id del producto, 
que es único, y como valor el objeto Producto.

Pero también se utiliza, por ejemplo, en sistemas de caché, 
identificando el dato con una clave y guardándolo en el mapa la 
primera vez que se cargue. Cuando se vuelva a acceder a ese dato, 
lo buscaremos en caché y se servirá desde ella.

## Jerarquía
Java cuenta con una Interfaz Map, que es implementada en 3 clases: 
HashMap, LinkedHashMap y TreeMap.

## Tipos
Existen 3 tipos de mapas:
•	HashMap: es el más utilizado y el más rápido, ya que inserta los elementos sin orden. 
•	LinkedHashMap: mantiene orden de inserción.
•	TreeMap: ordena los elementos de menor a mayor por su clave.

## Algoritmos
Para trabajar con mapas, en su declaración, tenemos que indicar 
el tipo de dato de la clave y también del valor: 
```HashMap<Integer, String> tabla = new HashMap<>();```

Las principales acciones que podemos realizar con un mapa son:
* Insertar elementos con el método .put(clave, valor)
* Insertar todos los elementos de un mapa preexistente con el método .putAll(mapaPreexistente)
* Obtener un conjunto de las claves del mapa con .keySet()
* Recorrer el mapa con for-each, con el método .forEach() o con iterador (usando los métodos .keySet().iterator()). 
    * ¡OJO! Siempre iteraremos sobre las claves y no sobre los valores.
* Obtener un par clave-valor con el método .get(clave)
* Eliminar un elemento del mapa con el método .remove(clave)
* Eliminar todos los elementos del mapa con el método .clear()
* Comprobar si el mapa está vacío con el método .isEmpty()
* Conocer el tamaño del mapa con el método .size()
* Comprobar si el mapa contiene un objeto concreto con el método .containsKey(clave) o .containsValue(valor)

Visita la API de Java: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html
