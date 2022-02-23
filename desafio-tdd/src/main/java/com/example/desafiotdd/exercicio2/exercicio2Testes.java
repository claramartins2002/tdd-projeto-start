package com.example.desafiotdd.exercicio2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.EnumSet.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class exercicio2Testes {
    Livro livro1;
    Livro livro2;
    Videogame game1;
    Videogame game2;
    Loja americanas;
    @Before
    public void setup() {
       livro1 = new Livro("Will & Will", 30.00, 5, "John Green", 402, "romance");
       livro2 = new Livro("Phyton II", 80.00, 11, "Anastácia Gobbles", 210, "educativo");
        Livro livro3 = new Livro("Os crimes ABC", 20.00, 2, "Agatha Christie", 340, "suspense");

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);


        game1 = new Videogame("Xbox One Novo", 2000.00, 40, "Xbox", "One", false);
        game2 = new Videogame("Xbox One Usado", 1000.00, 12, "Xbox", "One", true);

        List<Videogame> videogames = new ArrayList<>();
        videogames.add(game1);
        videogames.add(game2);

       americanas = new Loja("Lojas Americanas", "123.432.3232-32",livros, videogames );
    }

    @Test
    public void deveCalcularImpostoDeLivroNormal() throws Exception {
        Assert.assertEquals(3, livro1.calculaImposto(), 0.001);
    }

    @Test
    public void deveCalcularImpostoDeLivroEducativo() throws Exception {
        Assert.assertEquals(0, livro2.calculaImposto(), 0.001);
    }

    @Test
    public void deveCalcularImpostoDeVideoGameUsado() throws Exception {
        Assert.assertEquals(250, game2.calculaImposto(), 0.001);
    }
    @Test
    public void deveCalcularImpostoDeVideoGameNovo() throws Exception {
        Assert.assertEquals(900, game1.calculaImposto(), 0.001);
    }

    @Test
    public void deveRetornarLivrosDeLoja() throws Exception {
        assertThat( americanas.listaLivro(), equalTo("[Livro{nome='Will & Will', preco=30.0, quantidade=5, autor='John Green', qtdPag=402, tema='romance'}, Livro{nome='Phyton II', preco=80.0, quantidade=11, autor='Anastácia Gobbles', qtdPag=210, tema='educativo'}, Livro{nome='Os crimes ABC', preco=20.0, quantidade=2, autor='Agatha Christie', qtdPag=340, tema='suspense'}]"));

    }

    @Test
    public void deveRetornarMensagemDeLojaSemLivrosCadastrados() throws Exception {
        List<Livro> livro = new ArrayList<>();
        americanas.setLivros(livro);
        assertThat( americanas.listaLivro(), equalTo("Não há livros cadastrados nessa loja!"));
    }

    @Test
    public void deveRetornarVideoGamesDeLoja() throws Exception {
        assertThat( americanas.listaVideogame(), equalTo("[Videogame{nome='Xbox One Novo', preco=2000.0, quantidade=40, marca='Xbox', modelo='One', isUsado=false}, Videogame{nome='Xbox One Usado', preco=1000.0, quantidade=12, marca='Xbox', modelo='One', isUsado=true}]"));
    }

    @Test
    public void deveRetornarMensagemDeLojaSemVideoGamesCadastrados() throws Exception {
        List<Videogame> videogames = new ArrayList<>();
        americanas.setVideogames(videogames);
        assertThat( americanas.listaVideogame(), equalTo("Não há videogames cadastrados nessa loja!"));
    }

    @Test
    public void deveCalcularPatrimonioDaLoja() throws Exception {
        Assert.assertEquals(93070,americanas.calculaPatrimonio(), 0.001);
    }



}
