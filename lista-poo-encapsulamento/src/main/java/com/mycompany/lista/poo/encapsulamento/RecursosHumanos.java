package com.mycompany.lista.poo.encapsulamento;

public class RecursosHumanos {
    
    Integer promossoes = 0;
    Integer reajustes = 0;
    
    void reajustarSalario(Double reajuste, Colaborador colab){
        reajustes++;
        if (reajuste > 0){
            colab.setSalario(reajuste + colab.getSalario());
        } else {
            System.out.println("Reajuste menor que o salário atual do colaborador");
        }
    };
    
    void promoverColaborador(String novoCargo, Double reajuste, Colaborador colab){
        promossoes++;
        if(colab.getSalario() < reajuste){
            colab.setCargo(novoCargo);
            colab.setSalario(reajuste + colab.getSalario());
        } else {
            System.out.println("Operação inválida");
        }   
    }
}
