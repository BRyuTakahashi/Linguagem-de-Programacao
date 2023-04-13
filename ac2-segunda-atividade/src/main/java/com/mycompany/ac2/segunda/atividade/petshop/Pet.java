package com.mycompany.ac2.segunda.atividade.petshop;

public class Pet {
    private String nome;
    private String raca;
    private Integer qntVisitasAoPetShop;
    private Double valorGastoEmPetShop;
    
    public Pet(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
        qntVisitasAoPetShop = 0;
        valorGastoEmPetShop = 0.0;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    String getNome(){
        return nome;
    }
    
    void setRaca(String raca){
        this.raca = raca;
    }
    
    String getRaca(String raca){
        return raca;
    }
    
    void setQntVisitasAoPetShop(Integer qntVisitasAoPetShop){
        this.qntVisitasAoPetShop = qntVisitasAoPetShop;
    }
    
    Integer getQntVisitasAoPetShop(){
        return qntVisitasAoPetShop;
    }
    
    void setValorGastoEmPetShop(Double valorGastoEmPetShop){
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }
    
    Double getValorGastoEmPetShop(){
        return valorGastoEmPetShop;
    }
    
    @Override public String toString(){
        return String.format("Nome: %s;\nRaça: %s;\nQuantidade Visitas: %d;\nValor Gasto: %.2f\n", nome, raca, qntVisitasAoPetShop, valorGastoEmPetShop);
    }
}
