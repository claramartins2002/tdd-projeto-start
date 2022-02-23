package com.example.desafiotdd.exercicio2;

import lombok.Data;

import java.util.List;

@Data
public class Loja {
    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<Videogame> videogames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videogames = videogames;
    }

    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<Videogame> videogames;

    public String listaLivro() {
        if (getLivros().isEmpty()) {
            return ("Não há livros cadastrados nessa loja!");
        } else {
            return getLivros().toString();
        }
    }

    public String listaVideogame() {
        if (getVideogames().isEmpty()) {
           return ("Não há videogames cadastrados nessa loja!");
        } else {
            return getVideogames().toString();
        }
    }

    public double calculaPatrimonio() {
        Double patrimonio = 0.00;
        for(Videogame n: getVideogames()) {
            patrimonio+=n.getPreco()*n.getQuantidade();
        }
        for(Livro n: getLivros()) {
            patrimonio+=n.getPreco()*n.getQuantidade();
        }
        return patrimonio;

    }
}



