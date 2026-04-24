# Universidad Politécnica Salesiana 

## Práctica : La teoría de la complejidad

## Integrantes : Cabrera Sebastian - Pintado Paola -  Uyaguari Andy -  Ushca Ariel - José Vega

## 1.  ¿Qué es la Teoría de la Complejidad?

La teoria de la complejidad en Java evalua la eficiencia de los algoritmos, a mendida que aumenta el tamaño de la entrada.

## 2. Eficiencia de algoritmos

>  Coste temporal

Hace referencia a el tiempo que tarda un algoritmo en ejecutarse, dependiendo del tamaño de la entrada, ejemplo: Buscar un numero en una lista.

> Coste espacial 

Es la cantidad  de memoria que usa el algoritmo consume o necesita para su ejecucion. Ejemplo: variables, arreglos, estructuras de datos.

## 3. Factores de tiempo de ejecución

> Factores propios

Son los que depende directamente del algoritmo.

 - Numero de operaciones: 

Mientras mas instrucuiones tenga, mas tiempo tomara ejecutarlo.

- Estructura de codigo:

Cómo esta organizado el algoritmo influye mucho 
     ejemplo usar ciclos animados como usar un bucle for dentro de otro  bucle for esto aumenta el tiempo de ejecucion.

   >  Factores circunstanciales 

Son aquellos elementos fuera del algorutmo que tambien afectan el tiempo.

 - Hadware:
Un computador más rápido ejecuta el mismo algoritmo en menos tiempo.Es decir, depende de memoria RAM, procesador, etc.

 - Sistema operativo:
Influyen en como se ejecuta el programa

> Análisis teórico 

Es el estudio del algoritmo pero sin ejecutarlo, este se centra en como crece el algoritmo al aumentar los datos.
No depende del computador.

> Análisis experimental

Aqui se ejecuta el algoritmo, se mide el tiempo real  y se prueban diferentes tamaños de entrada.
ejemplo: ejecutar el algoritmo con 10, 100 y 1000 datos  mas.

una ventaja es que son resultados reales aunque depende del equipo y las condiciones.

## 4. Notación Big O

> ¿Qué es?

Big O es una forma de medir como crece el tiempo o memoria de un algoritmo cuando aumenta el tamaño de entrada(n).
No se mide segundos exactos, sino el comportamiento del crecimiento.

> Mejor Caso 

En el mejor caso el algoritmo realiza la menor cantidad de operaciones posibles, tambien se ejecuta en el menor tiempo  posible.Esto ocurre cuando los datos estan en la condicion ideal.


> Pero Caso

El peor caso en la notación Big O es cuando el algoritmo se ejecuta en la situación más desfavorable posible, es decir, cuando tarda el mayor tiempo en completarse.

>Notaciones:O, Ω, Θ

Estas notaciones sirven para describir el crecimiento de tiempo (o memoria) de un algoritmo cuanel tamaño de entrada n aumenta mucho.

 - Big  O (límite superior)

Es la mas importante representa el peor comportamiento posible de un algoritmo.Es una cota superior, es decir, marca un límite que el algoritmo no va a superar en tiempo.

- Omega Ω(n) (Límite inferior)

Representa el mejor caso posible.Es una cota inferior, es decir, el mínimo tiempo que el algoritmo puede tardar.

Muestra el potencial de eficiencia e indica qué tan rápido puede ser el algoritmo en condiciones ideales.

 -  Theta Θ(n) (Crecimiento exacto)

 Este representa el comportamiento real del algoritmo cuando, por lo contrario aquie el mejor y el peor caso son similares, es importante porque no solo dice el limite, sino el comportamiento real.

 ## 5. Cada una de las notaciones

 - Complejidad Constante O(1)  

 Significa que  el algoritmo siempre tarda lo mismo sin importar cuantos datos haya. 


- Complejidad logarítmica O(log n)

Hace referencia a que el algoritmo crece muy lentamente al aumentar n. Cada paso que da reduce el problema a la mitad. Ejemplo busqueda binaria.

- Complejidad lineal O(n)

Es el tiempo que crece proporcionalmente al tamaño de entrada, porque recorre todos los elementos una vez.

- Complejidad cuadrática O(n²)

Es el tiempo que crece mucho mas rapido que n, porque hay demasiados bucles anidados.

- Complejidad  O(n log n) 
Es una combinación de crecimiento lineal y logarítmico, ya que, se divide el problema (log n)
pero procesa todos los elementos (n).

# Ejemplos de complejidad en java.
> O(1) – Constante
### Nombre del archivo.
01jemeplo.java
### Definicion 
- La complejidad O(1) indica que el tiempo de ejecución de un algoritmo es constante y no depende del tamaño de los datos de entrada.
### Ejemplo
- La complejidad constante significa que el tiempo de ejecución no cambia sin importar el tamaño de la entrada.
### Codigo de ejemplo
public class ComplejidadConstante {
    public void ejemplo() {
        int x = 10;
        int y = x + 5;
        System.out.println("Resultado: " + y);
    }
}
### Explicación del por qué tiene esa complejidad
- El número de operaciones es fijo y no cambia.
- No depende del tamaño de la entrada de datos.
-  Siempre se ejecutan las mismas instrucciones.
  
> O(n) – Lineal
 ### Nombre del archivo.
02ejemplo.java
 ### Definicion 
 - La complejidad lineal significa que el tiempo de ejecución del algoritmo crece de forma proporcional al tamaño de la entrada;     es decir, a medida que aumenta la cantidad de datos, el número de operaciones aumenta en la misma proporción.
 ### Ejemplo
 - Revisar una lista de nombres para encontrar uno específico. Si la lista tiene pocos nombres, el tiempo es corto pero  si la       lista  es más grande, se tarda más, ya que se debe revisar cada elemento uno por uno
 ### Codigo de ejemplo
 public class ComplejidadLineal {
    public void ejemplo() {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
  }
  ### Explicación del por qué tiene esa complejidad
  - El número de operaciones depende directamente del tamaño de la entrada.
  - Se recorren los datos uno por uno.
  - Si aumenta la cantidad de elementos, aumenta proporcionalmente el tiempo de ejecución.
  
   > O(n²) – Cuadrática
   ### Nombre del archivo.
   03ejemplo.java
   ### Definicion 
   - La complejidad cuadrática significa que el tiempo de ejecución del algoritmo crece de forma proporcional al cuadrado del          tamaño de la entrada, es decir, a medida que aumentan los datos, el número de operaciones aumenta muy rápidamente.
   ### Ejemplo
   - Ordenar una lista comparando cada elemento con todos los demás. Si la lista es pequeña, el proceso es rápido; pero cuando la      lista crece, el número de comparaciones aumenta considerablemente porque cada elemento se compara con todos los otros, lo         que provoca un mayor tiempo de ejecución.
   ### Codigo de ejemplo
   public class ComplejidadCuadratica {
    public void ejemplo() {
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
             }
         }
     }
   }
    
  ###  Explicación del por qué tiene esa complejidad
   - Se utilizan ciclos anidados.
   - Cada elemento se compara o procesa junto con todos los demás.
   - El número de operaciones crece proporcionalmente a n × n.

   > O(log n) – Logarítmica

  ### Nombre del archivo.longejempllo.java
  Longejempllo.java
  ### Definicion 
  - La complejidad logarítmica significa que el tiempo de ejecución del algoritmo crece de forma muy lenta en comparación con el     tamaño de la entrada, ya que en cada paso se reduce considerablemente la cantidad de datos a procesar.
  ### Ejemplo.
  - Buscar un número en una lista ordenada dividiendo el conjunto de datos a la mitad en cada intento. En cada paso se descarta       una gran parte de la lista, por lo que incluso con muchos elementos, el tiempo de ejecución aumenta muy poco.
  ### Codigo de ejemplo
  O(n log n)
public class ComplejidadNLogN {
    public void ejemplo() {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            int n = arr.length;
            while (n > 1) {
                n = n / 2;
                System.out.println(arr[i]);
            }
        }
    }
}
### Explicación del por qué tiene esa complejidad
- En cada paso se reduce el tamaño del problema.
- No se recorren todos los elementos.
- El número de operaciones crece de forma logarítmica.

> O(n log n) – N log N
### Nombre del archivo.
05ejemplo.java
 ### Definicion 
 - La complejidad O(n log n) significa que el tiempo de ejecución del algoritmo crece de forma más rápida que O(n), pero mucho       más eficiente que O(n²), combinando un recorrido de los datos con una división del problema en partes más pequeñas.
### Ejemplo
- Ordenar una lista dividiéndola en partes más pequeñas, ordenar cada parte y luego unirlas. Aunque se recorren todos los elementos, el proceso de dividir el problema reduce el número total de operaciones, logrando un mejor rendimiento que los algoritmos cuadráticos.
 ### Codigo de ejemplo
 public class ComplejidadNLogN {
    public void ejemplo() {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            int n = arr.length;
            while (n > 1) {
                n = n / 2;
                System.out.println(arr[i]);
            }
        }
    }
}
### Explicación del por qué tiene esa complejidad
- Se recorren todos los elementos al menos una vez.
- El problema se divide en partes más pequeñas en cada paso.
- Combina un proceso lineal con uno logarítmico.

## Conclucion 
En esta práctica entendimos que no solo importa que el código funcione, sino qué tan eficiente es. Vimos que dependiendo de cómo se haga un algoritmo, puede ser mucho más rápido o más lento. También nos ayudó a pensar mejor antes de programar y no solo hacer las cosas sin antes haber  analizado
### 15. ¿Qué complejidad es más costosa y por qué?
- La más costosa es la O(n²) porque el número de operaciones crece mucho más rápido cuando aumentan los datos. Esto se da sobre todo cuando hay ciclos anidados, lo que hace que el tiempo de ejecución aumente bastante.
### 16. ¿Qué aprendieron del análisis?
- Aprendimos que no todos los algoritmos son igual de eficientes, aunque hagan lo mismo. También que es importante fijarse en el tiempo y en la memoria que se usa, no solo en que el programa funcione.
### 17. ¿Qué les sorprendió más al ver el código?
- Nos sorprendió que cambios pequeños en el código, como agregar otro ciclo, pueden hacer una gran diferencia en la complejidad. No pensábamos que eso afectaba tanto el rendimiento.