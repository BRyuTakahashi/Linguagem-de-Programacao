package com.mycompany.avaliacaocontinuada;

public class Depositar {
    String depositarValor(Double valorDeposito, Double saldo){
        if(valorDeposito < 0){
            return "Valor inválido";
        } else {
            saldo += valorDeposito;
            return "Depósito realizado - Saldo atual: R$" + saldo;
        }
    }

}
