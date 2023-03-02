package com.mycompany.atividade02.ac01;

public class DescontoProgressivo {
    Double calcularDesconto(Double valor, Integer quantidade){
        Double valorTotal = valor * quantidade;
        Double valorDesconto = valorTotal * (quantidade * 0.1);
        return valorTotal - valorDesconto;
    }
    
    String exibirNotaFiscal(Double valor, Integer quantidade, Double calcularDesconto){
        return "--------------------\nValor do produto: " + valor + "\nQuantidade: " + quantidade + "\n--------------------\nValor com desconto: R$" + calcularDesconto;
    }
}
