package com.mycompany.projeto.aula2.tarefa;
import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado;
        Integer acumulador = 0;
        
        do {
            System.out.println("Digite um número entre 0 a 10");
            numeroDigitado = leitor.nextInt();
            acumulador += numeroDigitado;
        } while (numeroDigitado != 0);
        
        System.out.println("A soma dos números digitados é: " + acumulador);
    }
}
