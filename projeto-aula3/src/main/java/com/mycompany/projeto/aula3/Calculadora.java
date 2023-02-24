package com.mycompany.projeto.aula3;

public class Calculadora {
    Integer somar(Integer numero01, Integer numero02){
        System.out.println("Soma:");
        return numero01 + numero02;
    }
    void exibirSoma(Integer numero01, Integer numero02){
        System.out.println(numero01 + numero02);
    }
    Integer subtrair(Integer numero01, Integer numero02){
        return numero01 - numero02;
    }
    
    void exibirSubtracao(Integer numero01, Integer numero02){
        System.out.println(numero01 - numero02);
    }
    Integer multiplicar(Integer numero01, Integer numero02){
        return numero01 * numero02;
    }
    void exibirMultiplicacao(Integer numero01, Integer numero02){
        System.out.println(numero01 * numero02);
    }
    
   Double dividir(Double numero01, Double numero02){
       return numero01 / numero02;
   }
    void exibirDivisao(Double numero01, Double numero02){
        System.out.println(numero01 / numero02);
    }
    
    String retornaFraseAprovacao(Double nota){
        if(nota >= 6){
            return "Passou!";
        } else {
            return "Reprovado, tente novamente";
        }
    }
}
