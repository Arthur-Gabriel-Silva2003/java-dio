package com.arthur.primeirasemana;

public class MinhaClasse {
   public static void main (String [] args ) {
       System.out.print("Hello, World!");
       final int ANO_2023 = 2023;

       System.out.print(ANO_2023);
       String primeiroNome = "Arthur";
       String segundoNome = "Gabriel";
       String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
       System.out.println(nomeCompleto);
   }

   public static String nomeCompleto (String primeiroNome, String segundoNome) {
       return primeiroNome.concat(" ").concat(segundoNome);
   }
}
