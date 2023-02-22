
package com.mycompany.projeto.aula2;

public class Interpolacao {

    public static void main(String[] args) {
        
        String nome = "Bruno";
        Integer idade = 22;
        Double altura = 1.62;
        
        String frase = String.format("Meu nome é %s, tenho %d e %.2f de altura", nome, idade, altura);
        
        System.out.println(frase);
        
        System.out.println(String.format("Meu nome é %s, tenho %d e %.2f de altura", nome, idade, altura));
    }
    
}
