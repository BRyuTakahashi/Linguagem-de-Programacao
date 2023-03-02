package com.mycompany.atividade02.ac01;

import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Idade metodo = new Idade();
        
        System.out.println("Digite a sua idade:");
        Integer idade = leitor.nextInt();
        
        System.out.println(metodo.classificaIdade(idade));
    }
}
