package com.mycompany.atividade02.ac01;

import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        CalculoNutricao metodos = new CalculoNutricao();
        
        System.out.println("Digite o seu peso:");
        Double peso = leitor.nextDouble();
        
        System.out.println("Digite a sua altura(em metros):");
        Double altura = leitor.nextDouble();
        
        System.out.println(metodos.calculaIMC(peso, altura));
    }
}
