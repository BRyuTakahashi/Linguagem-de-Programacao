package com.mycompany.aula2.tarefa;
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        
        System.out.println("Digite o valor da base:");
        Integer base = leitor.nextInt();
        
        System.out.println("Digite o valor do expoente:");
        Integer expoente = leitor.nextInt();
        
        numero = base;
        
        for(Integer i = 0; i < expoente - 1; i++){
            
            numero = numero * base;
        }
        
        System.out.println(numero);
    }
}
