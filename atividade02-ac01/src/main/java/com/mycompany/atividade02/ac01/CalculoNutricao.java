package com.mycompany.atividade02.ac01;

public class CalculoNutricao {
    String calculaIMC (Double peso, Double altura){
        Double imc = peso / (altura * altura);
        String frase = String.format("Seu IMC ficou %.2f", imc);
        return frase;
    }
}
