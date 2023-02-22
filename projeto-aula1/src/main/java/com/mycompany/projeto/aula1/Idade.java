package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Olá, " + nomeUsuario + "! Qual o ano de nascimento?");
        Integer anoNasc = leitor.nextInt();

        Integer idade = 2030 - anoNasc;

        System.out.println("Em 2030 você terá " + idade + " anos");
    }
}
