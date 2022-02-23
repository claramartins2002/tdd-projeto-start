package com.example.desafiotdd.exercicio2;

import lombok.Data;

@Data
public class Livro extends Produto implements Imposto {
    private String autor;
    private Integer qtdPag;
    private String tema;

    public Livro() {
    }

    @Override
    public String toString() {
        return "Livro{" +
        "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidade=" + getQuantidade() +
                ", autor='" + autor + '\'' +
                ", qtdPag=" + qtdPag +
                ", tema='" + tema + '\'' +
                '}';
    }

    public Livro(String nome, Double preco, Integer quantidade, String autor, Integer qtdPag, String tema) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.qtdPag = qtdPag;
        this.tema = tema;
    }

    @Override
    public double calculaImposto() {
        if(getTema() == "educativo"){
            return 0;
        }
        else {
            return getPreco() * 0.1;
        }
    }
}
