package com.example.projeto;

public class EmpregadoSuporte extends Empregado {

    public EmpregadoSuporte(Empregado superior) {
        listaChamados.add(TipoChamadoAcesso.getTipoChamadoAcesso());
        setEmpregadoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte";
    }

}
