package com.mycompany.lista.poo.encapsulamento;

public class RecursosHumanos {
    
    Integer totalPromocoes;
    Integer totalReajustes;
    
    public RecursosHumanos(Integer totalPromocoes, Integer totalReajustes){
        this.totalPromocoes = totalPromocoes;
        this.totalReajustes = totalReajustes;
    }

    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }

    public Integer getTotalReajustes() {
        return totalReajustes;
    }
    
    void reajustarSalario(Double valorReajuste, Colaborador colab){
        if (valorReajuste > 0){
            totalReajustes++;
            colab.setSalario(valorReajuste + colab.getSalario());
            System.out.println("Salário Reajustado!");
        } else {
            System.out.println("não é possível fazer reajustes negativos");
        }
    };
    
    void promoverColaborador(String novoCargo, Double valorReajuste, Colaborador colab){
        if(valorReajuste > colab.getSalario() && !novoCargo.equals(colab.getCargo())){
            totalPromocoes++;
            colab.setCargo(novoCargo);
            colab.setSalario(valorReajuste);
            System.out.println(String.format("Funcionário %s promovido", colab.getNome()));
        } else {
            System.out.println("Operação inválida");
        }   
    }
    
    @Override public String toString(){
        return String.format("Total Promoções: %d;\nTotal Reajustes: %d.\n", totalPromocoes, totalReajustes);
    }
}
