package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço do produto:");
        Double produtoPreco = leitor.nextDouble();

        System.out.println("Digite a quantidade de vendida:");
        Double quantidade = leitor.nextDouble();

        System.out.println("Digite o valor pago pelo cliente:");
        Double valorPago = leitor.nextDouble();

        Double troco = valorPago - (produtoPreco * quantidade);

        System.out.println("Seu troco será de R$" + troco);
    }
}
