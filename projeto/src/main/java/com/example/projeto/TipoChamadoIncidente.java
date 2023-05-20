package com.example.projeto;

public class TipoChamadoIncidente implements TipoChamado{

    private static TipoChamadoIncidente tipoChamadoIncidente = new TipoChamadoIncidente();

    private TipoChamadoIncidente() {};

    public static TipoChamadoIncidente getTipoChamadoIncidente() {
        return tipoChamadoIncidente;
    }
}
