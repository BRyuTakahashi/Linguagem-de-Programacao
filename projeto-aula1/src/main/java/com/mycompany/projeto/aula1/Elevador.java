package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite de peso do elevador:");
        Double pesoMaximo = leitor.nextDouble();

        System.out.println("Digite o limite de pessoas no elevador:");
        Integer pessoasMaximas = leitor.nextInt();

        System.out.println("Digite o peso da primeira pessoa a entrar no elevador:");
        Double pesoPessoa1 = leitor.nextDouble();

        System.out.println("Digite o peso da segunda pessoa a entrar no elevador:");
        Double pesoPessoa2 = leitor.nextDouble();

        System.out.println("Digite o peso da terceira pessoa a entrar no elevador:");
        Double pesoPessoa3 = leitor.nextDouble();

        Double pesoTotal = pesoPessoa1 + pesoPessoa2 + pesoPessoa3;

        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + pessoasMaximas + " pessoas.");
        System.out.println("O peso total no elevador é de " + pesoTotal + " Kg, sendo que ele suporta " + pesoMaximo);
    }
}
