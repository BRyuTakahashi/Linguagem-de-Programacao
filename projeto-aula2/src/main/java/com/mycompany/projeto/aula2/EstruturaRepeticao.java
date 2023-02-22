package com.mycompany.projeto.aula2;
import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer numeroDigitado;
        
        Integer repetidor = 0;
        
        while(repetidor < 10){
            System.out.println(repetidor);
            repetidor++;
        }
        
        for(int i = 9; i >= 0; i--){
            System.out.println(i);
        }
            
        do {
            System.out.println("Adivinhe o numero:");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != 42);
        
        System.out.println("Acertou");
        
        
    }
}
