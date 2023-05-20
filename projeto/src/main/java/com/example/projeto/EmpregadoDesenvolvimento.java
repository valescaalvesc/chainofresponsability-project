package com.example.projeto;

public class EmpregadoDesenvolvimento extends Empregado{

    public EmpregadoDesenvolvimento(Empregado superior) {
        listaChamados.add(TipoChamadoWorkflow.getTipoChamadoWorkflow());
        setEmpregadoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Desenvolvimento";
    }
}
