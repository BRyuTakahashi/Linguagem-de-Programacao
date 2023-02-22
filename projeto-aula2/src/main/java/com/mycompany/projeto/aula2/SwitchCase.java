package com.mycompany.projeto.aula2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        // O usuario digita um numero
        // e eu mostro o dia da semana equivalente
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um dia");
        Integer diaSemana = leitor.nextInt();
        
        switch(diaSemana){
            case 1:
                System.out.println("Segundou");
                break;
            case 2:
                System.out.println("Terçou");
                break;
            case 3:
                System.out.println("Quartou");
                break;
            case 4:
                System.out.println("Quintou");
                break;
            case 5:
                System.out.println("Sextou");
                break;
            case 6:
                System.out.println("Sabadou");
                break;
            case 7:
                System.out.println("Domingou");
            default:
                System.out.println("Dia inválido");
                
        }
    }
}
