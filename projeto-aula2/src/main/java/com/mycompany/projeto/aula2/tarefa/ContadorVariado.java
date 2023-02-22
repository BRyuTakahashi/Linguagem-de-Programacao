package com.mycompany.projeto.aula2.tarefa;

public class ContadorVariado {
    public static void main(String[] args) {
        
        Double numero = 0.15;
        
        for(Integer i = 0; numero < 5; i++){
            System.out.println(String.format("Número atual: %.2f", numero));
            numero = numero + 0.15;
        }
    }
    
}
