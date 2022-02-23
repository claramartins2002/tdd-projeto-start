package com.example.desafiotdd.exercicio7;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }
    @Override
    public Double bonificacao() {
        return getSalario() + 5000;
    }
}
