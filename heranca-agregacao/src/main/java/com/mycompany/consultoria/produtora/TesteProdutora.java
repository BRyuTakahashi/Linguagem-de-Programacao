package com.mycompany.consultoria.produtora;

public class TesteProdutora {
    public static void main(String[] args) {
        Produtora produtora1 = new Produtora("Warner", 3);
        
        Protagonista protagonista1 = new Protagonista(22, 80.40, "Ryu", 4, 40.75);
        Protagonista protagonista2 = new Protagonista(24, 84.60, "Miyu", 2, 44.35);
        Ator ator1 = new Ator("Bruno", 14, 70.85);
        Ator ator2 = new Ator("Estela", 13, 71.40);
        
        produtora1.contratar(protagonista1);
        produtora1.contratar(protagonista2);
        produtora1.contratar(ator1);
        produtora1.contratar(ator2);
        
        System.out.println(produtora1.existePorNome("Miyu"));
        System.out.println(produtora1.getQuantidadeAtores());
        System.out.println(produtora1.getQuantidadeProtagonistas());
        System.out.println(produtora1.getTotalSalario());
        
        System.out.println(produtora1.buscarAtorPorNome("Ryu"));
    }
}
