package com.mycompany.lista.introducao.poo;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    
    void comprarBolo(Integer quantidadeComprada){
        if(quantidadeVendida > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        } else if(quantidadeVendida + quantidadeComprada > 100){
            System.out.println("A quantidade desejada para compra excede o limite diário");
        } else {
            quantidadeVendida += quantidadeComprada;
            System.out.println(String.format("Você adicionou mais %d bolos de %s, totalizando %d bolos", quantidadeComprada, sabor,quantidadeVendida));
        }
    }
    
    void exibirRelatorio(){
        Double valorTotal = valor * quantidadeVendida;
        System.out.println(String.format("O bolo de sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f", sabor, quantidadeVendida, valorTotal));
    }
}
