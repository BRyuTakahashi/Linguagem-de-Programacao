package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Double numero1 = leitor.nextDouble();

        System.out.println("Digite outro número:");
        Double numero2 = leitor.nextDouble();

        System.out.println("Resultado da soma: " + (numero1 + numero2));
        System.out.println("Resultado da subtração: " + (numero1 - numero2));
        System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
        System.out.println("Resultado da divisão: " + (numero1 / numero2));
    }
}
