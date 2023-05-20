package com.example.projeto;

public class TipoChamadoAcesso implements TipoChamado{

    private static TipoChamadoAcesso tipoChamadoAcesso = new TipoChamadoAcesso();

    private TipoChamadoAcesso() {};

    public static TipoChamadoAcesso getTipoChamadoAcesso() {
        return tipoChamadoAcesso;
    }
}
