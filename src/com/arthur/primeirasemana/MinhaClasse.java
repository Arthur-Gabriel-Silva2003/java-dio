package com.arthur.primeirasemana;

public class MinhaClasse {
   public static void main (String [] args ) {
       System.out.println("Hello, World!");
       final int ANO_2023 = 2023;

       System.out.println(ANO_2023);
       String primeiroNome = "Arthur";
       String segundoNome = "Gabriel";
       String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
       System.out.println(nomeCompleto);
   }

   public static String nomeCompleto (String primeiroNome, String segundoNome) {
       return primeiroNome.concat(" ").concat(segundoNome);
   }
}
