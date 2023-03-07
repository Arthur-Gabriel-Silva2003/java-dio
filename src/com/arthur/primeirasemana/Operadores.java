package com.arthur.primeirasemana;

public class Operadores {
   public static void main (String [] args) {

       // utilizar o operador de adição em strings causa a concatenação.
       String nomeCompleto = "Arthur " + "Gabriel";
       System.out.println(nomeCompleto);

       // o mesmo vale ao concatenar números com strings.

       String concatenacao = 1 + "1";
       System.out.println(concatenacao);

       /* String testeConcatenacao = 1 + 2 + 3 + "4";
       System.out.println(testeConcatenacao);

       O resultado desta operação é 64 (somou os ints 1, 2, 3 e concatenou com a string "4".
       */

       // INCREMENTO E DECREMENTO

       //Para aumentar valores em 1, podemos utilizar ++

       int valor = 5;
       valor++;
       System.out.println(valor);

       // também podemos fazer o decremento de valores em 1 utilizando --

       Boolean verdadeiro = true;
       Boolean falso = false;

       if (verdadeiro && falso) {
           System.out.println("as duas variáveis são verdadeiras!");
       } else {
           System.out.println("uma das variáveis é falsa!");
       }



   }
}
