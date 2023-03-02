package com.mycompany.atividade02.ac01;

public class ValidacaoNumerica {
    String verificarPrimo (Integer numero){
        Integer contador = 0;
        for(Integer i = 1; i <= numero; i++){
            if(numero % i == 0){
                contador++;
            }
        }
        if(contador == 2){
            return "Seu número é primo";
        } else{
            return "Seu número não é primo";
        }
    }
}
