package com.mycompany.lista.introducao.poo;

public class ContaBancaria {
//    Atributos = características
    private Double saldo = 0.0;
    private String nomeTitular = "";

//    Métodos = Comportamentos
    void depositar(Double valorDeposito){
        if(valorDeposito > 0.0){
            saldo += valorDeposito;
            System.out.println(String.format("Deposito realizado! Saldo restante: R$%.2f.", saldo));
        } else{
            System.out.println("Valor inválido!");
        }
    }

    void sacar(Double valorSaque){
        if(valorSaque > 0.0 && valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println(String.format("Saque realizado! Saldo atual: R$%.2f.", saldo));
        } else if(valorSaque > saldo){
            System.out.println(String.format("Quantidade insuficiente para saque! Saldo atual: R$%.2f.", saldo));
        } else{
            System.out.println("Não é possível sacar valores abaixo de 0.0.");
        }

    }

//    Usamos "this" para apontar qual é o argumento. Útil quando temos uma variável/argumento com o mesmo nome

    void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    String getNomeTitular() {
        return nomeTitular;
    }

    Double getSaldo(){
        return saldo;
    }


}
