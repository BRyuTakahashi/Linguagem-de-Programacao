package com.mycompany.atividade02.ac01;

import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoAluno calc = new CalculoAluno();
        
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite uma nota:");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite uma segunda nota:");
        Double nota2 = leitor.nextDouble();
        
        Double media = calc.receberECalcularMedia(nota1, nota2);
        
        System.out.println(String.format("Olá %s, sua média final ficou %.2f",nome, media));
    }
}
