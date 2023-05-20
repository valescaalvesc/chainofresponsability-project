package com.example.projeto;

public class EmpregadoERP extends Empregado{

    public EmpregadoERP(Empregado superior) {
        listaChamados.add(TipoChamadoRequest.getTipoChamadoRequest());
        setEmpregadoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "ERP";
    }
}
