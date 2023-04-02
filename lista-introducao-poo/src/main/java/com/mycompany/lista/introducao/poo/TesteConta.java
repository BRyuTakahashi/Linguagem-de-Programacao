package com.mycompany.lista.introducao.poo;

public class TesteConta {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        String nomeConta1 = conta1.getNomeTitular();
        
        conta1.setNomeTitular("William");
        
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNomeTitular("Xampson");
        
   
        conta1.depositar(100.0);
        conta1.sacar(10.0);
        conta1.sacar(100.0);
        conta1.sacar(0.0);
        conta1.depositar(0.0);
    }
}
