package com.mycompany.lista.introducao.poo;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double frete;
    
    void calcularFrete(){
        if(distancia <= 51){
            frete = 3.00;
        } else if(distancia <= 200){
            frete = 5.00;
        } else {
            frete = 7.00;
        }
        
        if(tamanho.equals("P")){
            valorEncomenda += valorEncomenda * 0.01;
        } else if(tamanho.equals("M")){
            valorEncomenda += valorEncomenda * 0.03;
        } else {
            valorEncomenda += valorEncomenda * 0.05;
        }
        
        valorEncomenda += frete;
    }
    
    void emitirEtiqueta(){
        Double valorTotal = valorEncomenda + frete;
        System.out.println("********** Etiqueta para envio *********");
        System.out.println(String.format("Endereço do remetente: %s", enderecoRemetente));
        System.out.println(String.format("Endereço do destinatário: %s", enderecoDestinatario));
        System.out.println(String.format("Tamanho: %s", tamanho));
        System.out.println("----------------------------------------");
        System.out.println(String.format("Valor encomenda: R$%.2f", valorEncomenda));
        System.out.println(String.format("Valor frete: R$%.2f", frete));
        System.out.println("----------------------------------------");
        System.out.println(String.format("Valor total: R$%.2f", valorTotal));
    }
}
