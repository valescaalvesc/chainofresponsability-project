package com.example.projeto;

public class TipoChamadoChange implements TipoChamado{

    private static TipoChamadoChange tipoChamadoChange = new TipoChamadoChange();

    private TipoChamadoChange() {};

    public static TipoChamadoChange getTipoChamadoChange() {
        return tipoChamadoChange;
    }
}
