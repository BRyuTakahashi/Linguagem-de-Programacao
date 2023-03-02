package com.mycompany.atividade02.ac01;

import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo metodo = new DescontoProgressivo();
        
        System.out.println("Bem vindo ao sistema de desconto progressivo!");
        
        System.out.println("\rDigite o valor unitário do produto:");
        Double valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Integer quantidade = leitor.nextInt();
        
        System.out.println(metodo.exibirNotaFiscal(valor, quantidade, metodo.calcularDesconto(valor, quantidade)));
    }
}
