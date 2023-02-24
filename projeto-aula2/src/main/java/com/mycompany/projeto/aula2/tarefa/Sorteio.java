package com.mycompany.projeto.aula2.tarefa;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroSorteado;
        Integer contadorPar = 0;
        Integer contadorImpar = 0;
        Integer indice = 0;
        
        System.out.println("Digite um número entre 0 e 100");
        Integer numero = leitor.nextInt();
        
        for(Integer i = 0; i < 200; i++){
            
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,100);
            if(numeroSorteado == numero){
                
                if(indice == 0){
                    
                System.out.println("Seu número digitado foi o " + i + "º a ser sorteado");
                indice++;
                }
            }
            
            if(numeroSorteado % 2 == 0){
                
                contadorPar++;
            } else{
                
                contadorImpar++;
            }
        }
        
        System.out.println("Foram sorteados " + contadorPar + " números pares e " + contadorImpar + " números ímpares");
        
    }
}
