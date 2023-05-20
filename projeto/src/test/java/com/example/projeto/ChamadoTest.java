package com.example.projeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChamadoTest {

    EmpregadoGestor gestor;
    EmpregadoDesenvolvimento desenvolvimento;
    EmpregadoERP erp;
    EmpregadoSuporte suporte;

    @BeforeEach
    void setUp() {
        gestor = new EmpregadoGestor(null);
        desenvolvimento = new EmpregadoDesenvolvimento(gestor);
        erp = new EmpregadoERP(desenvolvimento);
        suporte = new EmpregadoSuporte(erp);
    }

    @Test
    void deveRetornarSuporteParaChamadoAcesso() {
        assertEquals("Suporte", suporte.aprovarChamado(new Chamado(TipoChamadoAcesso.getTipoChamadoAcesso())));
    }

    @Test
    void deveRetornarERPParaChamadoRequest() {
        assertEquals("ERP", suporte.aprovarChamado(new Chamado(TipoChamadoRequest.getTipoChamadoRequest())));
    }

    @Test
    void deveRetornarDesenvolvimentoParaChamadoWorkflow() {
        assertEquals("Desenvolvimento", suporte.aprovarChamado(new Chamado(TipoChamadoWorkflow.getTipoChamadoWorkflow())));
    }

    @Test
    void deveRetornarGestorParaChaamdoChange() {
        assertEquals("Gestor", suporte.aprovarChamado(new Chamado(TipoChamadoChange.getTipoChamadoChange())));
    }

    @Test
    void deveRetornarSemAssinaturaParaChamadoIncidente() {
        assertEquals("Sem assinatura", suporte.aprovarChamado(new Chamado(TipoChamadoIncidente.getTipoChamadoIncidente())));
    }

}
