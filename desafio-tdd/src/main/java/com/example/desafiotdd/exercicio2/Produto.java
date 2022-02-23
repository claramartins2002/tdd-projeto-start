package com.example.desafiotdd.exercicio2;

import lombok.Data;

@Data
public abstract class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
