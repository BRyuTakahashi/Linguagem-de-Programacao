package com.mycompany.projeto.aula2;

import java.util.concurrent.ThreadLocalRandom;

public class NumeroAleatorio {
    public static void main(String[] args) {
        
        // tem uma classe Math.random
        // mas precisa criar um objeto
        // um jeito mais simples:
        
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1,101);
        
        System.out.println(numeroAleatorio);
        
        Double doubleAleatorio = ThreadLocalRandom.current().nextDouble();
        
        System.out.println(doubleAleatorio);
        
    }
    
}
