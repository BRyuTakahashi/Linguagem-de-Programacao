package com.mycompany.aula3.tarefa3;

import java.util.Scanner;

public class TesteClasseSocial {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        ClasseSocial calc = new ClasseSocial();
        
        System.out.println("Digite quanto é a sua renda mensal:");
        Double renda = leitor.nextDouble();
        
        Double quantidadeSalariosMinimos = calc.devolverSalariosMinimos(renda);
        
        System.out.println(String.format("Você recebe aproximadamente %.1f salários-mínimos", quantidadeSalariosMinimos));
        
        System.out.println(String.format("Você pertence a classe social: %s", calc.devolverClasseSocial(quantidadeSalariosMinimos)));
    }
}
