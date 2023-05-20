package com.example.projeto;

public class TipoChamadoRequest implements TipoChamado{

    private static TipoChamadoRequest tipoChamadoRequest = new TipoChamadoRequest();

    private TipoChamadoRequest() {};

    public static TipoChamadoRequest getTipoChamadoRequest() {
        return tipoChamadoRequest;
    }
}
