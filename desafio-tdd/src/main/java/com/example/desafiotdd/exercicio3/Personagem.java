package com.example.desafiotdd.exercicio3;

import lombok.Data;

@Data
public class Personagem {

    public Personagem() {
        nInstancias++;

    }

    public Personagem(String nome, Integer vida, Integer mana, Float xp, Integer forca, Integer inteligencia, Integer level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.level = level;
    }
    public static int getNumberInstances(){
        return nInstancias;
    }


    private String nome;
    private Integer vida;
    private Integer mana;
    private Float xp;
    private Integer forca;
    private Integer inteligencia;
    private Integer level;
    private static int nInstancias = 0;

    public void lvlUp() {

    }

    public double attack() {
        return 0;
    }
}
