package com.mycompany.atividade3.ac2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeInteiros {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList();
        List<Integer> numerosPares = new ArrayList();
        List<Integer> numerosImpares = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        Integer numeroSoma = 0;
        Integer menorNumero = 0;
        Integer maiorNumero = 0;
        
        while(true){
            System.out.println("\nDigite um número (digite 0 se quiser parar):");
            Integer inputNumero = leitor.nextInt();

            if(inputNumero != 0){
                listaDeNumeros.add(inputNumero);
            } else {
                break;
            }
        }
        
        for(Integer index = 0; index<listaDeNumeros.size(); index++){
            numeroSoma += listaDeNumeros.get(index);
            if(listaDeNumeros.get(index) % 2 == 0){
                numerosPares.add(listaDeNumeros.get(index));
            } else{
                numerosImpares.add(listaDeNumeros.get(index));
            }
            
            if(index == 0){
                menorNumero = listaDeNumeros.get(index);
            } else if(menorNumero > listaDeNumeros.get(index)){
                menorNumero = listaDeNumeros.get(index);
            }
            
            if(index == 0){
                maiorNumero = listaDeNumeros.get(index);
            } else if(maiorNumero < listaDeNumeros.get(index)){
                maiorNumero = listaDeNumeros.get(index);
            }
        }
        
        System.out.println("Números pares:");
        System.out.println(numerosPares);
        
        System.out.println("\nNúmeros impares:");
        System.out.println(numerosImpares);
        
        System.out.println(String.format("\nSoma de todos os números:\n%d", numeroSoma));
        System.out.println(String.format("\nMenor número:\n%d", menorNumero));
        System.out.println(String.format("\nMaior número:\n%d", maiorNumero));
    }
}
