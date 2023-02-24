package com.mycompany.projeto.aula2.continuada;

import java.util.Scanner;

public class continuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a ");
        System.out.println("1 - Soma\r2- Multiplicação\r3- Divisão\r4- Subtração\r0- Sair");
        Integer operacao = leitor.nextInt();
        Integer numero = 0;

        if(operacao < 0 || operacao > 4){
            System.out.println("Opção Invalida, tente novamente!");
        } else {
            switch(operacao){
                case 0:
                    System.out.println("Até Logo!");
                    break;
                case 1:
                    System.out.println("Digite o número Inteiro:");
                    numero = leitor.nextInt();
                    for(Integer i = 1; i <= 10; i++){
                        System.out.println(String.format("%d + %d = " + (numero + i), numero, i));
                    }
                    break;
                case 2:
                    System.out.println("Digite o número Inteiro:");
                    numero = leitor.nextInt();
                    for(Integer i = 1; i <= 10; i++){
                        System.out.println(String.format("%d * %d = " + (numero * i), numero, i));
                    }
                    break;
                case 3:
                    System.out.println("Digite o número Inteiro:");
                    numero = leitor.nextInt();
                    for(Integer i = 1; i <= 10; i++){
                        System.out.println(String.format("%d / %d = " + (numero / i), numero, i));
                    }
                    break;
                case 4:
                    System.out.println("Digite o número Inteiro");
                    numero = leitor.nextInt();
                    for(Integer i = 1; i <= 10; i++){
                        System.out.println(String.format("%d - %d = " + (numero - i), numero, i));
                    }
                    break;
            }
        }
    }
}
