package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaUtil {
    
    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }
    
    public void add(Integer valor) {
        if(valor != null){
            inteiros.add(valor);
        } else {
            System.out.println("Não é permitido adicionar um valor nulo a lista");
        }
    }

    public void remove(Integer valor) {
       if(valor != null){
           inteiros.remove(valor);
       } else {
           System.out.println("Não é permitido remover um valor nulo da lista");
       }
    }

    public Integer countPares() {
        Integer numerosPares = 0;
        for(Integer i = 0; i < inteiros.size(); i++){
            if(inteiros.get(i) % 2 == 0){
                numerosPares++;
            }
        }
        return numerosPares;
    }

    public Integer countImpares() {
        Integer numerosImpares = 0;
        for(Integer i = 0; i < inteiros.size(); i++){
            if(inteiros.get(i) % 2 != 0){
                numerosImpares++;
            }
        }
        return numerosImpares;
    }

    public Integer somar() {
        Integer numerosSoma = 0;
        for(Integer i = 0; i < inteiros.size(); i++){
            numerosSoma += inteiros.get(i);
        }
        return numerosSoma;
    }

    public Integer getMaior() {
        Integer maiorNumero = 0;
        for(Integer i = 0; i < inteiros.size(); i++){
            if(i == 0){
                maiorNumero = inteiros.get(i);
            } else{
                if(inteiros.get(i) > maiorNumero){
                    maiorNumero = inteiros.get(i);
                }
            }
        }
       return maiorNumero;
    }

    public Integer getMenor() {
        Integer menorNumero = 0;
        for(Integer i = 0; i < inteiros.size(); i++){
            if(i == 0){
                menorNumero = inteiros.get(i);
            } else {
                if(inteiros.get(i) < menorNumero){
                    menorNumero = inteiros.get(i);
                }
            }
        }
        return menorNumero;
    }

    public Boolean hasDuplicidade() {
        Boolean duplicidade = false;
        Integer numeroInicial;
        Integer numeroComparado;
            for(Integer i = 0; i < inteiros.size(); i++){
                if(inteiros.get(i) != null){
                    
                    numeroInicial = inteiros.get(i);
                    
                    for(Integer index = 0; index < inteiros.size(); index++){
                        if(inteiros.get(index) != null){
                            
                             numeroComparado = inteiros.get(index);
                             
                            if(numeroInicial == numeroComparado && i != index){
                                
                                duplicidade = true;
                            }
                        }

                    }
                }

            }
        
        return duplicidade;
    }
}
