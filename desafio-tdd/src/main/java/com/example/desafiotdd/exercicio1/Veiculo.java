package com.example.desafiotdd.exercicio1;

import lombok.Data;
import org.springframework.boot.convert.Delimiter;

@Data
public class Veiculo {

    public Veiculo(String marca, String modelo, String placa, String cor, Float km, Boolean isligado, Integer litroscombustivel, Integer velocidade, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isligado = isligado;
        this.litroscombustivel = litroscombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private Float km;
    private Boolean isligado;
    private Integer litroscombustivel;
    private Integer velocidade;
    private Double preco;

    public void acelerar() {
        setVelocidade(getVelocidade() + 20);
    }

    public void frear() {
        if(getVelocidade()==0){
            throw new RuntimeException("Carro já parado!!");
        }
        else {
            setVelocidade(getVelocidade() - 20);
        }
    }


    public void abastecer(Integer litros) {
        if(getLitroscombustivel() >=60 || getLitroscombustivel() + litros > 60){
            throw new RuntimeException("Limite excedido");
        }
        else {
            setLitroscombustivel(getLitroscombustivel()+litros);
        }
    }

    public void pintar(String cor) {
        setCor(cor);
    }

    public void ligar() {
        if(getIsligado() == false) {
            setIsligado(true);
        }
    }

    public void desligar() {
        if(getVelocidade() > 0){
            throw new RuntimeException("Primeiro zere a velocidade, depois desligue");
        }
        else {
            setIsligado(false);
        }
    }
}
