package com.example.desafiotdd.exercicio3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Mago extends Personagem{
    private List<String> magia;

    public Mago(String nome, Integer vida, Integer mana, Float xp, Integer forca, Integer inteligencia, Integer level, List<String> magia) {
        super(nome, vida, mana, xp, forca, inteligencia, level);
        this.magia = magia;

    }



    @Override
    public void lvlUp() {
        setMana(getMana() + 20);
        setInteligencia(getInteligencia()+20);
        setForca(getForca()+10);
        setVida(getVida()+10);
    }

    @Override
    public double attack() {
        return (getInteligencia()*getLevel()) + (Math.random()*300);
    }

    public String aprenderMagia( String magia) {
        List<String> magias = new ArrayList<>();
        magias = getMagia();
        magias.add(magia);
        setMagia(magias);
return getMagia().toString();
    }
}
