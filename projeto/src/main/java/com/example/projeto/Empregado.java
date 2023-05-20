package com.example.projeto;

import java.util.ArrayList;

public abstract class Empregado {

    protected ArrayList listaChamados = new ArrayList();
    private Empregado empregadoSuperior;

    public Empregado getEmpregadoSuperior() {
        return empregadoSuperior;
    }

    public void setEmpregadoSuperior(Empregado empregadoSuperior) {
        this.empregadoSuperior = empregadoSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        }
        else {
            if (empregadoSuperior != null) {
                return empregadoSuperior.aprovarChamado(chamado);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }
}
