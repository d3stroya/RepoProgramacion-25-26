# Tres en Raya

Si quisiéramos montar un juego de tres en raya, 
querríamos saber si el tablero está resuelto, ¿verdad? 

¡Nuestro objetivo es crear una función que lo compruebe por nosotros!

Supongamos que el tablero viene en forma de una matriz de 3x3, 
donde el valor es 0si un espacio está vacío, 1si es una "X" o 2si es una "O", 
como se muestra a continuación:

```
[[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]]
```

Queremos que nuestra función devuelva:

* -1 Si el tablero aún no está terminado Y nadie ha ganado todavía (hay espacios vacíos),
* 1 Si "X" ganaba,
* 2 Si "O" ganaba,
* 0 si es un juego de gatos (es decir, un empate).

Puede asumir que el tablero presentado es válido en el contexto de una partida de Tres en Raya.
