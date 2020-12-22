Exercise 9:

 /* Write your code here: */
 createEmployeeList().forEach(item -> System.out.print(item.getName()+", "));


Exercise 10:

a. Estructuras de datos utilizadas en el algoritmo
Una vez realizado el problema del algoritmo, comenta qué estructuras de datos (Listas, Sets, etc...) has seleccionado para resolverlo y porqué la has considerado la más adecuada en cada caso. 

- He utilizado Listas, ya que algunos datos se pueden repetir y no necesito la información ordenada. Por otro lado, tengo la ventaja
de poder recorrer la lista desde un indice específico y utilizas las funciones de stream.

b. Complejidad temporal del algoritmo
Una vez resuelto el algoritmo, ¿qué complejidad temporal expresada en notación "O" crees que tiene? ¿Consideras que se podría mejorar de alguna manera?

- Notacion "O" = O (N²)
- Se podria mejorar su utilizamos java parallel streams para utilizar hilos al momento de procesar el recorrido de las comparaciones si es que 
tenemos peticiones multiples del uso de la funcion.
 