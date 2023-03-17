package com.mycompany.avaliacaocontinuada;

import java.util.Scanner;

public class SPTechInvestimento {
    public static void main(String[] args) {
        
        Depositar deposito = new Depositar();
        Sacar saque = new Sacar();
        Boolean repetir = true;
        
        Scanner leitor = new Scanner(System.in);
        Double saldo = 0.0;
        
        while(repetir){
            System.out.println("\n\n--------------------------\n"
                             + "|  SPTech Investimentos  |\n"
                             + "--------------------------\n"
                             + "|Olá, o que deseja fazer:|\n"
                             + "| 1 - Depositar          |\n"
                             + "| 2 - Sacar              |\n"
                             + "| 3 - Simular rendimento |\n"
                             + "| 0 - Sair               |\n"
                             + "--------------------------");

            Integer opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    Double valorDeposito = leitor.nextDouble();
                    System.out.println(deposito.depositarValor(valorDeposito, saldo));
                    saldo += valorDeposito;
                    break;

                    
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    Double valorSaque = leitor.nextDouble();
                    System.out.println(saque.sacarValor(valorSaque, saldo));
                    saldo -= valorSaque;
                    break;

                    
                case 3:
                    Double saldoSimulado = saldo;
                    if(saldoSimulado == 0){
                        
                        System.out.println("Saldo Zerado, opcão inválida");
                        break;
                        
                    } else{
                        
                        System.out.println(String.format("| Saldo atual: R$%.2f |", saldoSimulado));
                        
                        for(Integer i = 1; i <= 12; i++){
                            saldoSimulado *= 1.1;
                            System.out.println("-----------------");
                            System.out.println(String.format("| Mês %d | Saldo: R$%.2f", i, saldoSimulado));
                        }
                        break;
                        
                    }
                    
                case 0:
                    System.out.println("Obrigado por usar o simulador da SPTech Investimentos");
                    repetir = false;
                    break;
                    
                default:
                    System.out.println("Digite uma opção válida!");
                    break;

            }
        }
    }
}
