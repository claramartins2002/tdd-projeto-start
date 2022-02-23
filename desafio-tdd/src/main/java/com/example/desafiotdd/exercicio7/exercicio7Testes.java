package com.example.desafiotdd.exercicio7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class exercicio7Testes {
    Gerente gerente;
    Supervisor supervisor;
    Vendedor vendedor;
    @Before
    public void setup(){
       gerente  = new Gerente("Saulo Pacheco", 56, 6000.00);
      supervisor = new Supervisor("Paula Francesca", 43, 5400.00);
       vendedor= new Vendedor("Camilo Rivera", 32, 2300.00);
    }

    @Test
    public void deveRetornarBonificacoesProporcionaisAoCargo() throws Exception {
        Assert.assertEquals(16000, gerente.bonificacao(), 0.0001);
        Assert.assertEquals(10400, supervisor.bonificacao(), 0.0001);
        Assert.assertEquals(5300, vendedor.bonificacao(), 0.0001);

    }
}
