package com.mycompany.avaliacao.continuada.bruno.takahashi;

public class TesteContinuada {
    public static void main(String[] args) {
        Concessionaria loja1 = new Concessionaria("Java");
        Veiculo carro1 = new Veiculo(1, "Fit");
        Veiculo carro2 = new Veiculo(2, "Santa Fé");
        
        loja1.aumentarEstoque(carro1, 5);
        loja1.aumentarEstoque(carro1, 6);
        loja1.aumentarEstoque(carro2, 3);
        
        carro1.setValorTabela(60000.0);
        carro2.setValorTabela(78000.0);
        
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        
        loja1.realizarVenda(carro1);
        loja1.realizarVenda(carro1);
        loja1.realizarVenda(carro1);
        
        loja1.realizarVenda(carro2);
        loja1.realizarVenda(carro2);
        
        loja1.realizarVenda(carro1, 10.0);
        
        System.out.println(loja1.getQuantidadeDescontosAplicados());
        System.out.println(loja1.getQuantidadeDescontosAplicados());
    }
}
