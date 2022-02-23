package com.example.desafiotdd.exercicio2;

import lombok.Data;

@Data
public class Videogame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private Boolean isUsado;

    public Videogame() {
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "nome='" + getNome() + '\'' +
                ", preco=" +getPreco() +
                ", quantidade=" + getQuantidade() +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", isUsado=" + isUsado +
                '}';
    }

    public Videogame(String nome, Double preco, Integer quantidade, String marca, String modelo, Boolean isUsado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    @Override
    public double calculaImposto() {
        if(getIsUsado() == true){
            return getPreco() * 0.25;
        }
        else {
             return getPreco() * 0.45;
    }
    }
}
