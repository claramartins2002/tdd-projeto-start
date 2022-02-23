package com.example.desafiotdd.extras.entreLetras;

//https://dojopuzzles.com/problems/entre-letras/

import lombok.Data;

import java.util.Arrays;
import java.util.List;
@Data
public class Alfabeto {
    private List<String> letras = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    public double distanciaDasLetras(String primeiraLetra, String segundaLetra){
        if(letras.indexOf(segundaLetra) < letras.indexOf(primeiraLetra)){
            throw new RuntimeException("Não está em ordem alfabética");
        }
        else {
            return letras.indexOf(segundaLetra) - letras.indexOf(primeiraLetra) - 1;
        }
        }


}
