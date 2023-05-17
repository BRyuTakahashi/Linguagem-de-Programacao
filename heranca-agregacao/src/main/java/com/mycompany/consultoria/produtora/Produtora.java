package com.mycompany.consultoria.produtora;

import java.util.ArrayList;
import java.util.List;

public class Produtora {
    private String nome;
    private Integer vagas;
    private List<Ator> atores;
    
    public Produtora(String nome, Integer vagas){
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setVagas(Integer vagas){
        this.vagas = vagas;
    }
    public Integer getVagas(){
        return vagas;
    }
    
    public Boolean existePorNome(String nome){
        for(Integer i = 0; i < atores.size(); i++){
            if(nome.equalsIgnoreCase(atores.get(i).getNome())){
                return true;
            }
        }
        return false;
    }
    
    public void contratar(Ator a){
        if(atores.size() < vagas){
            atores.add(a);
            System.out.println(String.format("Ator %s contratado", a.getNome()));
        } else {
            System.out.println("Sem vagas disponíveis");
        }
    }
    
    public Integer getQuantidadeAtores(){
        return atores.size();
    }
    
    public Integer getQuantidadeProtagonistas(){
        Integer protagonistas = 0;
        for(Integer i = 0; i < atores.size(); i++){
            if(atores.get(i) instanceof Protagonista){
                protagonistas++;
            }
        }
        return protagonistas;
    }
    
    public Double getTotalSalario(){
        Double totalSalario = 0.0;
        for(Integer i = 0; i < atores.size(); i++){
            totalSalario += atores.get(i).getSalario();
        }
        return totalSalario;
    }
    
    public Ator buscarAtorPorNome(String nome){
        for(Integer i = 0; i < atores.size(); i++){
            if(nome.equalsIgnoreCase(atores.get(i).nome)){
                return atores.get(i);
            }
        } 
        
        return null;
    }
    
    @Override public String toString(){
        return String.format("\nNome: %s;\n"
                + "Vagas: %d;\n",
                nome, vagas);
    }
}
