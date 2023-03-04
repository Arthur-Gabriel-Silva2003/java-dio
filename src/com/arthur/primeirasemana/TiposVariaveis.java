package com.arthur.primeirasemana;

public class TiposVariaveis {
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;

    short numeroCurto2 = (short) numeroNormal;



    /* Como podemos ver, ao utilizar o valor atribuído ao numeroCurto2, precisamos usar o atributo
    (short) para indicar que ele é DE FATO um short, mesmo que o valor seja baixo. Isso se deve ao fato de
    que Java é uma linguagem fortemente tipada.
     */



    // Algumas definições:

    // - Variável = pode ser redefinida.

    String nome = "Arthur";

    /* - Constantes = não podem ser redefinidas depois de declaradas, são representadas com uppercase e
    e o atributo final */

    final float PI = 3.14F;

    // obs: valores em float precisam terminar com a letra F para indicar que é float e não double.
}
