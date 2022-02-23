package com.example.desafiotdd.exercicio7;

public class Gerente extends Funcionario{

    public Gerente(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }
    @Override
    public Double bonificacao() {
        return getSalario() + 10000;
    }
}
