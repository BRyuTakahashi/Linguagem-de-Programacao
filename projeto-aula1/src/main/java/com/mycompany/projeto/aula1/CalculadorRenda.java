package com.mycompany.projeto.aula1;

import java.util.Scanner;

public class CalculadorRenda {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantos filhos de 0 a 3 anos você tem:");
        Integer bebe = leitor.nextInt();

        System.out.println("Digite quantos filhos de 4 a 16 anos você tem:");
        Integer crianca = leitor.nextInt();

        System.out.println("Digite quantos filhos de 17 a 18 anos você tem:");
        Integer adolescente = leitor.nextInt();
        
        if(bebe < 0 || crianca < 0 || adolescente < 0){
            System.out.println("Digite um valor válido para a quantidade de filhos!");
            
        } else if (bebe == 0 && crianca == 0 && adolescente == 0){
            System.out.println("Você não tem filhos, portanto não receber a bolsa");
        
        } else{
        Double bolsaBebe = 25.12 * bebe;
        Double bolsaCrianca = 15.88 * crianca;
        Double bolsaAdolescente = 12.44 * adolescente;

        System.out.println("Você tem um total de " + (bebe + crianca + adolescente) + " filhos e vai receber R$" + (bolsaBebe + bolsaCrianca + bolsaAdolescente) + " de bolsa");
        
        }
    }
}
