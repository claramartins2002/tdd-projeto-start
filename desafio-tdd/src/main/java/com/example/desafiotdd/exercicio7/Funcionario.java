package com.example.desafiotdd.exercicio7;

import lombok.Data;

@Data
public class Funcionario {
    public Funcionario(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    private String nome;
    private Integer idade;
    private Double salario;

    public Double bonificacao() {
        return salario;
    }
}
