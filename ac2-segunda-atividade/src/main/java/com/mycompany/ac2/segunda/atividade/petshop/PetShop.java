package com.mycompany.ac2.segunda.atividade.petshop;

public class PetShop {
    private String nome;
    private Double faturamento;
    
    public PetShop(String nome){
        this.nome = nome;
        faturamento = 0.0;
    }
    
    void darBanho(Pet nome, Double valor){
        if(valor > 0){
            nome.setValorGastoEmPetShop(nome.getValorGastoEmPetShop() + valor);
            faturamento += valor;
            nome.setQntVisitasAoPetShop(nome.getQntVisitasAoPetShop() + 1);
            System.out.println("Serviço realizado");
        } else{
            System.out.println("Vai trabalhar de graça?");
        }
    }
    
    void darBanho(Pet nome, Double valor, Integer desconto){
        if(valor > 0){
            nome.setValorGastoEmPetShop(nome.getValorGastoEmPetShop() + (valor - desconto));
            faturamento += valor;
            nome.setQntVisitasAoPetShop(nome.getQntVisitasAoPetShop() + 1);
            System.out.println("Serviço realizado");
        }
    }
    
    void setNome (String nome){
        this.nome = nome;
    }
    
    String getNome() {
        return nome;
    }
    
    Double getFaturamento(){
        return faturamento;
    }
    
    @Override public String toString(){
        return String.format("Nome: %s;\nFaturamento: %.2f\n", nome, faturamento);
    }
}
