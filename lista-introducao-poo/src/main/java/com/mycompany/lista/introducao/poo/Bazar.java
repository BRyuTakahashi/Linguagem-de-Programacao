package com.mycompany.lista.introducao.poo;

public class Bazar {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda();
        encomenda.distancia = 100.0;
        encomenda.enderecoDestinatario = "Rua Machado Pedrosa, 47";
        encomenda.enderecoRemetente = "Rua Guaipá, 452";
        encomenda.tamanho = "P";
        encomenda.valorEncomenda = 80.9;
        
        encomenda.calcularFrete();
        encomenda.emitirEtiqueta();
    }
}
