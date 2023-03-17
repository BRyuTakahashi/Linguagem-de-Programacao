package com.mycompany.lista.introducao.poo;

public class App {
    public static void main(String[] args) {
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();
        
        bolo1.sabor = "morango";
        bolo1.quantidadeVendida = 90;
        bolo1.valor = 30.00;
        
        bolo2.sabor = "chocolate";
        bolo2.quantidadeVendida = 5;
        bolo2.valor = 50.00;
        
        bolo3.sabor = "abacaxi";
        bolo3.quantidadeVendida = 12;
        bolo3.valor = 30.00;
        
        bolo1.comprarBolo(5);
        bolo1.comprarBolo(5);
        bolo1.comprarBolo(5);
        bolo1.comprarBolo(5);
        bolo1.comprarBolo(5);
        bolo1.exibirRelatorio();
    }
}
