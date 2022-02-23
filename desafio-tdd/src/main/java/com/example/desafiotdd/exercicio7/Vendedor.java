package com.example.desafiotdd.exercicio7;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }
    @Override
    public Double bonificacao() {
        return getSalario() + 3000;
    }
}
