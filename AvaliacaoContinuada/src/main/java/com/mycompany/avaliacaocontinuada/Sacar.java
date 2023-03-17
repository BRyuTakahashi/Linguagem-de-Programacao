package com.mycompany.avaliacaocontinuada;

public class Sacar {
    String sacarValor(Double valorSaque, Double saldo){
        if(valorSaque < 0){
            return "Valor inválido";

        } else {
            saldo -= valorSaque;
            return "Saque realizado - Saldo atual: R$" + saldo;
        }
    }
}
