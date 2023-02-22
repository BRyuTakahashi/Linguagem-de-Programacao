package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nomeAluno = leitor.nextLine();

        System.out.println("Digite uma nota:");
        Double nota1 = leitor.nextDouble();

        System.out.println("Digite outra nota:");
        Double nota2 = leitor.nextDouble();
        
        if(nota1 < 0 || nota2 < 0){
            System.out.println("Onde já se viu uma nota negativa?");
            
        } else if (nota1 > 10 || nota2 > 10) {
            System.out.println("Onde já se viu uma nota maior que 10?");
            
        } else {
        Double mediaNota = (nota1 + nota2) / 2;

        System.out.println("Olá " + nomeAluno + ". A sua média foi de " + mediaNota);
        
        }
    }
}
