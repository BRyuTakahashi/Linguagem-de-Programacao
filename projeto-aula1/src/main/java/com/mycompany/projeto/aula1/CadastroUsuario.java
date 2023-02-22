package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nomeDigitado = leitor.nextLine();

        System.out.println("Digite a sua senha:");
        Integer senhaDigitada = leitor.nextInt();

        System.out.println("Digite quantas tentativas gostaria:");
        Integer tentativasDigitadas = leitor.nextInt();

        System.out.println("Seu login é " + nomeDigitado + " e sua senha é " + senhaDigitada + ". Você tem " +
                tentativasDigitadas + " tentativas antes de ser bloqueado.");
    }
}
