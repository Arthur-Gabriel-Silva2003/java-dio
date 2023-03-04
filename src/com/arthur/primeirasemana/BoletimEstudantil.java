package com.arthur.primeirasemana;

public class BoletimEstudantil {
    public static void main (String [] args ){
        int mediaFinal = 10;
        if (mediaFinal<6)
            System.out.println(" VOCÊ FOI REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("prova de recuperação");
        else
            System.out.println("Sua nota foi " + mediaFinal + ", parabéns! você foi aprovado!");
    }
}
