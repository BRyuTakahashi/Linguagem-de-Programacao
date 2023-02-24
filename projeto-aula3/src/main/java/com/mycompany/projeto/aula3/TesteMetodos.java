package com.mycompany.projeto.aula3;
import java.util.Scanner;

public class TesteMetodos {
    public static void main(String[] args) {
        
        // para utilizar os métodos das nossas classes
        // precisamos criar objetos
        // ou seja, fazer uma instancia
        
        Scanner leitor = new Scanner(System.in);
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();
        
//        String nome01 = "Xampson";
//        String nome02 = "Bruno";
//        
//        util.exibirNomeFormatado(nome01);
//        System.out.println("\n\n");
//        util.exibirNomeFormatado(nome02);;
        
//        System.out.println("Digite um número: ");
//        Integer numero01 = leitor.nextInt();
//        System.out.println("Digite outro número: ");
//        Integer numero02 = leitor.nextInt();
//        System.out.println("Soma: ");
        System.out.println(calc.somar(32, 10));
        System.out.println(calc.subtrair(32,10));
        System.out.println(calc.multiplicar(32,10));
        System.out.println(calc.dividir(32.0, 10.0));
        
        System.out.println(calc.retornaFraseAprovacao(7.0));
    }
}
