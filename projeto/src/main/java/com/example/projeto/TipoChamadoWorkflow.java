package com.example.projeto;

public class TipoChamadoWorkflow implements TipoChamado{

    private static TipoChamadoWorkflow tipoChamadoWorkflow = new TipoChamadoWorkflow();

    private TipoChamadoWorkflow() {};

    public static TipoChamadoWorkflow getTipoChamadoWorkflow() {
        return tipoChamadoWorkflow;
    }
}
