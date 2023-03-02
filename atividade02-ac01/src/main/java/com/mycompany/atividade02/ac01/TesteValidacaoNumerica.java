package com.mycompany.atividade02.ac01;
import java.util.Scanner;

public class TesteValidacaoNumerica {
    
    public static void main(String[] args) {
        
        ValidacaoNumerica metodos = new ValidacaoNumerica();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer numero = leitor.nextInt();
        
        System.out.println(metodos.verificarPrimo(numero));
    }
}
