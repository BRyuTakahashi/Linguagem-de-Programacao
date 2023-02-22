package com.mycompany.projeto.aula2.tarefa;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();
        Integer qnt = 0;
        Integer numeroAleatorio;
        
        do {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(1,10);
            qnt++;
            
        } while (numeroDigitado != numeroAleatorio);
        
        if(qnt <= 3){
            System.out.println("Você é MUITO sortudo");
            
        } else if (qnt <= 10){
            System.out.println("Você é sortudo");
            
        } else {
            
            System.out.println("É melhor você desistir de apostar e ir trabalhar");
        }
//        System.out.println(qnt);
    }
}
