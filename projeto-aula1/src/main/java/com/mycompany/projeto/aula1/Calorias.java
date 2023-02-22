package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class Calorias {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tempo que você passa se aquecendo:");
        Integer aquecimento = leitor.nextInt();

        System.out.println("Digite o tempo que você passa fazendo aeróbicos:");
        Integer aerobicos = leitor.nextInt();

        System.out.println("Digite o tempo que você passa fazendo musculação:");
        Integer musculacao = leitor.nextInt();

        Integer calorais1 = 12 * aquecimento;
        Integer calorais2 = 20 * aerobicos;
        Integer calorais3 = 25 * musculacao;

        System.out.println("Olá Jorge. Você fez um total de " + (aquecimento + aerobicos + musculacao) +
                " minutos de exercícios e perdeu cerca de " + (calorais1 + calorais2 + calorais3) + " calorais");
    }
}
