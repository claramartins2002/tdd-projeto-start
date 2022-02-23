package com.example.desafiotdd.exercicio3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Guerreiro extends Personagem{
    private List<String> habilidade;

    public Guerreiro(String nome, Integer vida, Integer mana, Float xp, Integer forca, Integer inteligencia, Integer level, List<String> habilidade) {
        super(nome, vida, mana, xp, forca, inteligencia, level);
        this.habilidade = habilidade;
    }

    @Override
    public void lvlUp() {
        setMana(getMana() + 10);
        setInteligencia(getInteligencia()+10);
        setForca(getForca()+20);
        setVida(getVida()+20);
    }

    @Override
    public double attack() {
        return (getForca()*getLevel()) + (Math.random()*300);
    }

    public String aprenderHabilidade( String habilidade) {
        List<String> habilidades = new ArrayList<>();
        habilidades = getHabilidade();
        habilidades.add(habilidade);
        setHabilidade(habilidades);
        return getHabilidade().toString();
    }
}
