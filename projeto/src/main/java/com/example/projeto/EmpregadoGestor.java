package com.example.projeto;

public class EmpregadoGestor extends Empregado{

    public EmpregadoGestor(Empregado superior) {
        listaChamados.add(TipoChamadoChange.getTipoChamadoChange());
        setEmpregadoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gestor";
    }
}
