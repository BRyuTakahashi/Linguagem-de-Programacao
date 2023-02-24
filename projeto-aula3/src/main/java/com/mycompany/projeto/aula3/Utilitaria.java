package com.mycompany.projeto.aula3;

public class Utilitaria {
    // Retorno: esse não tem, é void!
    // Nome: exibirLinha;
    // Argumentos: esse bão tem, fica dentro dos ();
    // Corpo: fica dentro das {};
    
    void exibirLinha(){
        System.out.println("*---*---*---*---*---*---*");
    }
    
    //Métodos com Argumentos:
    
    void exibirNome(String nomeExibir){
        System.out.println("Meu nome é: " + nomeExibir);
    }
    
    
    //metodos difetentes podem ter argumentos com o mesmo nome
    // ja que eles nascem e morrem dentro do metodo
    void exibirNomeFormatado(String nomeExibir){
        exibirLinha();
        exibirNome(nomeExibir);
        exibirLinha();
    }
}
