package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário bruto:");
        Double salarioBruto =  leitor.nextDouble();
        System.out.println("Digite quanto custa a condução diária:");
        Double conducao = leitor.nextDouble();

        Double iNSS = salarioBruto * 0.1;
        Double iR = salarioBruto * 0.2;
        Double vT = conducao * 2;
        Double desconto = iNSS + iR + vT;
        Double salarioLiquido = salarioBruto - desconto;

        System.out.println("Seu salário bruto de R$" + salarioBruto + ", tem um total de R$" + desconto + " em descontos e receberá um líquido de R$" + salarioLiquido);
    }
}
