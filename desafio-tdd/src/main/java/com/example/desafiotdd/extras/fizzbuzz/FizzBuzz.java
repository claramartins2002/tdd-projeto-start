package com.example.desafiotdd.extras.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String listarParteUm() {
        List<Integer> num = new ArrayList<>();
        for(int i=1; i<=100; i++){
            num.add(i);
        }
        List<String> print = new ArrayList<>();

        for(Integer n: num){
            if(n%3==0 && n%5==0){
                print.add("FizzBuzz");
            }
            else if(n%3==0) {
                print.add("Fizz");

            }
            else if(n%5==0) {
                print.add("Buzz");

            }
            else {
                print.add(String.valueOf(n));

            }
        }
        return print.toString();
    }

    public String listarParteDois() {
        List<Integer> num = new ArrayList<>();
        for(int i=1; i<=100; i++){
            num.add(i);
        }
        List<String> print = new ArrayList<>();

        for(Integer n: num){
            if(n%3==0 && n%5==0){
                print.add("FizzBuzz");
            }
            else if(n%3==0) {
                print.add("Fizz");

            }
            else if(n%5==0) {
                print.add("Buzz");

            }
            else if(n.toString().contains("3") && !(n.toString().contains("5")) ) {
                print.add("Buzz");
            }
            else if(n.toString().contains("5") && !(n.toString().contains("3" ))) {
                print.add("Fizz");
            }
            else if(n.toString().contains("5") && (n.toString().contains("3" ))) {
                print.add("BuzzFizz");
            }

            else {
                print.add(String.valueOf(n));

            }
        }
        return print.toString();
    }


}
