package com.example.desafiotdd.exercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class exercicio1Testes {
    Veiculo veiculo;

    @Before
    public void setup() {
       veiculo = new Veiculo("Ford", "KA", "ABCD-0123", "Branco", 1000.00F, false, 40, 50, 20000.00);

    }


    @Test
    public void deveAcelerarOVeiculo() throws Exception {
        veiculo.acelerar();
        Assert.assertEquals(veiculo.getVelocidade(), 70, 0.001);
    }

    @Test
    public void deveFrearOVeiculo() throws Exception {
        veiculo.frear();
        Assert.assertEquals(veiculo.getVelocidade(), 30, 0.001);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveFrearVeiculoJaParado() throws Exception {
        veiculo.setVelocidade(0);
        veiculo.frear();
    }

    @Test
    public void deveAbastecerVeiculoEmCondicoesNormais() throws Exception {
        veiculo.abastecer(10);
        Assert.assertEquals(veiculo.getLitroscombustivel(), 50, 0.001);


    }

    @Test(expected = RuntimeException.class)
    public void naoDeveAbastecerVeiculoJaCheio() throws Exception {
        veiculo.setLitroscombustivel(60);
        veiculo.abastecer(10);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveAbastecerVeiculoAcimaDaCapacidade() throws Exception {
        veiculo.setLitroscombustivel(50);
        veiculo.abastecer(70);
    }

    @Test
    public void devePintar() throws Exception {
        veiculo.pintar("Amarelo");
        Assert.assertSame(veiculo.getCor(), "Amarelo");

    }

    @Test
    public void deveLigarVeiculo() throws Exception {
        veiculo.ligar();
        Assert.assertTrue(veiculo.getIsligado());
    }
    @Test
    public void deveDesligarVeiculoEmCondicoesNormais() throws Exception {
        veiculo.setVelocidade(0);
        veiculo.desligar();
        Assert.assertFalse(veiculo.getIsligado());
    }
    @Test(expected = RuntimeException.class)
    public void naoDeveDesligarVeiculoComVelocidadeAcimaDeZero() throws Exception {
        veiculo.setVelocidade(10);
        veiculo.desligar();
    }






}
