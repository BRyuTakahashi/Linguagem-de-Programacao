package com.mycompany.projeto.aula2.tarefa;
import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        String login;
        String senha;
        
        System.out.println("Digite o login:");
        login = leitor.nextLine();
        
        System.out.println("Digite a senha:");
        senha = leitor.nextLine();
        
        System.out.println(login);
        System.out.println(senha);
        
        if(login == "admin" && senha == "#SPTech2022"){
            System.out.println("Login realizado com sucesso!");
        } else{
            
        }
    }
    
}
