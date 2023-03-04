package com.arthur.primeirasemana;

public class TiposVariaveis {
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;

    short numeroCurto2 = (short) numeroNormal;



    /* como podemos ver, ao utilizar o valor atribuído ao numeroCurto2, precisamos usar o atributo
    (short) para indicar que ele é DE FATO um short, mesmo que o valor seja baixo. Isso se deve ao fato de
    que Java é uma linguagem fortemente tipada.
     */
}
