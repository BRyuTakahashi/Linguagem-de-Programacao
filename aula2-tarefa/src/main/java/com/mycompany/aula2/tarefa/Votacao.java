package com.mycompany.aula2.tarefa;
import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijo = 0;
        String pizza = "";
        
        System.out.println("Vote no seu sabor de Pizza favorito");
        for(Integer i = 0; i < 10; i++){
            System.out.println("Digite 5 para Mussarela \r Digite 25 para Calabresa \r Digite 50 para Quatro Queijos");
            Integer voto = leitor.nextInt();
            
            if(voto == 5){
                
                mussarela++;
            }else if(voto == 25){
            
                calabresa++;
            } else {
                quatroQueijo++;
            }
        }
        
        System.out.println("Mussarela: " + mussarela + " votos");
        System.out.println("Calabresa: " + calabresa + " votos");
        System.out.println("Quatro Queijos: " + quatroQueijo + " votos");
        
        if(mussarela > calabresa && mussarela > quatroQueijo){
            System.out.println("A pizza mais votada é Mussarela");
        } else if(mussarela > quatroQueijo && mussarela > calabresa){
            System.out.println("A pizza mais votada é Mussarela");
        } else if(calabresa > mussarela && calabresa > quatroQueijo){
            System.out.println("A pizza mais votada é Calabresa");
        } else if(calabresa > quatroQueijo && calabresa > calabresa){
            System.out.println("A pizza mais votada é Calabresa");
        } else if(quatroQueijo > mussarela && quatroQueijo > calabresa){
            System.out.println("A pizza mais votada é Quatro Queijos");
        } else {
            System.out.println("A pizza mais votada é Quatro Queijos");
        }
        
    }
}
