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
        
        if(login == "admin" && senha == "#SPTech2022"){
            System.out.println("Login realizado com sucesso!");
        } else{
            while(true){
                System.out.println("Login e/ou senha invalidos");
                System.out.println("Digite o seu login:");
                login = leitor.nextLine();
                System.out.println("Digite a sua senha:");
                senha = leitor.nextLine();
                if(login == "admin" && senha == "#SPTech2022"){
                    System.out.println("Login realizado com sucesso!");
                    break;
                }
            }
        }
    }
    
}
