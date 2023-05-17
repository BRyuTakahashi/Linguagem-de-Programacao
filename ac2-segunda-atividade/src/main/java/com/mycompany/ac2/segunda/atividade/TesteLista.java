package com.mycompany.ac2.segunda.atividade;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    //add: adiciona objeto na lista
    //get: busca objeto pelo indice
    //size: retorna tamanho da lista
    //remove: remove objeto da lista
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        listaEstranha.add("Xampson");
        listaEstranha.add(42);
        listaEstranha.add(42.0);
        listaEstranha.add(false);
        
        System.out.println(listaEstranha);
        
        List<String> nomes = new ArrayList();
        nomes.add("Brownin");
        nomes.add("Miyu");
        nomes.add("Namie");
        nomes.add("Naomi");
        nomes.add("Brunão");
        nomes.add("Estela");
        nomes.add("Duda");
        nomes.add("Enzo");
        nomes.add("Leonel");
        
        System.out.println(nomes);
        
        String terceiroNome = nomes.get(3);
        System.out.println(String.format("Terceiro nome: %s", terceiroNome));
        
        for (Integer i = 0; i < nomes.size(); i++){
            System.out.println(String.format("%s", nomes.get(i)));
        }
        
        nomes.remove("Enzo");
        for (Integer i = 0; i < nomes.size(); i++){
            System.out.println(String.format("%s", nomes.get(i)));
        }
       
        nomes.remove(3);
        for (Integer i = 0; i < nomes.size(); i++){
            System.out.println(String.format("%s", nomes.get(i)));
        }
        
        //Lista de objetos com nossas classes
        List<Atividade> atividades = new ArrayList();
        
        Atividade atividade1 = new Atividade("Protótipo das Telas", "Bruno", 5);
        Atividade atividade2 = new Atividade("Banco de Dados", "Roberto", 3);
        Atividade atividade3 = new Atividade("Wireframe", "Jair", 2);
        
        atividades.add(atividade1);
        atividades.add(atividade2);
        atividades.add(atividade3);
        
        for (Integer i = 0; i < atividades.size(); i++){
            System.out.println(String.format("%s", atividades.get(i)));
        }
        
        //exiba somente atividades com menos de 5 dias estimados
        for(Integer i = 0; i < atividades.size(); i++){
            Atividade atividadeDaVez = atividades.get(i);
            if(atividadeDaVez.getDiasEstimados() < 5){
                System.out.println(atividadeDaVez);
            }
        }
        
        System.out.println("Com enhanced for:");
        for (Atividade atividadeDaVez : atividades) {
            if(atividadeDaVez.getDiasEstimados() < 5){
                System.out.println(atividadeDaVez);
            }
        }
        
        if(nomes.indexOf("Brownin") != 0){
            System.out.println("nome existe na lista");
        } else {
            System.out.println("nome n existe na lista");
        }
    }
}
