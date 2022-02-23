package com.example.desafiotdd.exercicio3;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

public class exercicio3Testes {
    Mago mago;
    Personagem personagem = new Personagem();
    Guerreiro guerreiro;
    @Before
    public void setup() {
        List<String> magias = new ArrayList<>();
        magias.add("Abertura de portal");
         mago = new Mago("Elias", 5, 400, 10.00F, 50, 40, 1,magias );
        List <String> habilidades = new ArrayList<>();
        habilidades.add("Mortal imbatível");
         guerreiro = new Guerreiro("Valdo", 9, 200, 2.0F, 70, 10, 1, habilidades);
    }

    @Test
    public void subirDeNivelMago() throws Exception {
        mago.lvlUp();
        Assert.assertEquals(420, mago.getMana(), 0.001);
        Assert.assertEquals(60, mago.getInteligencia(), 0.001);
    }

    @Test
    public void subirDeNivelGuerreiro() throws Exception {
        guerreiro.lvlUp();
        Assert.assertEquals(29, guerreiro.getVida(), 0.001);
        Assert.assertEquals(90, guerreiro.getForca(), 0.001);
    }

    @Test
    public void deveRetornarAtaqueValidoParaMago() throws Exception {
        assertTrue("Erro, valor randômico abaixo do limite", 340 >= mago.attack());
        assertTrue("Erro, valor randômico abaixo do limite",  40  <= mago.attack());
        }

    @Test
    public void deveRetornarAtaqueValidoParaGuerreiro() throws Exception {
        assertTrue("Erro, valor randômico abaixo do limite", 370 >= mago.attack());
        assertTrue("Erro, valor randômico abaixo do limite",  70  <= mago.attack());
    }

    @Test
    public void deveRetornarONumeroDeInstancias() throws Exception {


        Assert.assertEquals(2, personagem.getNumberInstances(), 0.001);
    }

    @Test
    public void magoDeveAprenderMagia() throws Exception {
        MatcherAssert.assertThat(mago.aprenderMagia("Lança chamas"), equalTo("[Abertura de portal, Lança chamas]"));
    }

    @Test
    public void guerreiroDeveAprenderHabilidade() throws Exception {
        MatcherAssert.assertThat(guerreiro.aprenderHabilidade("Lançamento de facas"), equalTo("[Mortal imbatível, Lançamento de facas]"));
    }

    }

