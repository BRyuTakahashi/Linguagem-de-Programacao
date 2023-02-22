package com.mycompany.projeto.aula2;

public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = true;
        String frase;
        
        if(bloqueado){
            frase = "Usuario bloqueado";
            
        } else {
            frase = "Usuario desbloqueado";
            
        }
        
        System.out.println(frase);
        
        frase = bloqueado ? "Usuario bloqueado" : "Usuario desbloqueado";
        
        // cenario: se o salario for maior que 1000,0
        // o bonus de 0,15, se for maior que 1000,0
        // o bonus é de 0,10
        
        Double bonus;
        Double salario = 1075.00;
        

        
        bonus = salario >= 1000.0 ? bonus = 0.15 : 0.10;
        
        System.out.println("O bonus é de " + bonus);
    }
}
