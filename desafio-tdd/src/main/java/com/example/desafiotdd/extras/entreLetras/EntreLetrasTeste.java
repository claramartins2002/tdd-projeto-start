package com.example.desafiotdd.extras.entreLetras;

import org.junit.Assert;
import org.junit.Test;

public class EntreLetrasTeste {
    @Test
    public void deveRetornarDistanciaDeDuasLetras() throws Exception {
        Alfabeto alfabeto = new Alfabeto();
        Assert.assertEquals(3, alfabeto.distanciaDasLetras("A", "E"), 0.001);
    }

    @Test
    public void deveRetornarDistanciaDasDuasPrimeirasLetras() throws Exception {
        Alfabeto alfabeto = new Alfabeto();
        Assert.assertEquals(0, alfabeto.distanciaDasLetras("A", "B"), 0.001);
    }
    @Test(expected = RuntimeException.class)
    public void deveBarrarRetornoDeLetrasDesordenadas() throws Exception {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.distanciaDasLetras("Z", "A");
    }

}
