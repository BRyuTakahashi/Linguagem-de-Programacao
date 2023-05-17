package com.mycompany.atividade3.ac2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frutas {
    public static void main(String[] args) {
        
        List<String> listaFruta = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        Integer ocorrencia = 0;
        

        listaFruta.add("Morango");
        listaFruta.add("Banana");
        listaFruta.add("Maça");
        listaFruta.add("Pera");
        listaFruta.add("Limão");
        listaFruta.add("Uva");
        
        System.out.println("Procure por uma fruta na lista:");
        String inputFruta = leitor.nextLine();
        
        String texto = String.format("Não existe a fruta %s na lista", inputFruta);
        
        for(Integer index = 0; index<listaFruta.size(); index++){
            if(inputFruta.equalsIgnoreCase(listaFruta.get(index))){
                texto = String.format("A fruta %s existe na lista", inputFruta);
            } 
        }
        System.out.println(texto);
    }
}
