package com.mycompany.consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;
    
    public Consultoria(String nome, Integer vagas){
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
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
        for(Integer i = 0; i < desenvolvedores.size(); i++){
            if(nome.equalsIgnoreCase(desenvolvedores.get(i).getNome())){
                return true;
            }
        }
        return false;
    }
    
    public void contratar(Desenvolvedor d){
        if(desenvolvedores.size() < vagas){
            desenvolvedores.add(d);
            System.out.println(String.format("Desenvolvedor %s Contratado!", d.nome));
        } else {
            System.out.println("Quantidade de vagas cheias");
        }
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        Integer qtdDesenvolvedorMobile = 0;
        for(Integer i = 0; i < desenvolvedores.size(); i++){
            if(desenvolvedores.get(i) instanceof DesenvolvedorMobile){
                qtdDesenvolvedorMobile++;
            }
        }
        return qtdDesenvolvedorMobile;
    }
    
    public Double getTotalSalario(){
        Double totalSalario = 0.0;
        for(Integer i = 0; i < desenvolvedores.size(); i ++){
            totalSalario += desenvolvedores.get(i).getSalario();
        }
        return totalSalario;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        for(Integer i = 0; i < desenvolvedores.size(); i++){
            if(nome.equalsIgnoreCase(desenvolvedores.get(i).getNome())){
                return desenvolvedores.get(i);
            }
        }
        return null;
    }
    
    @Override public String toString(){
        return String.format("\nNome: %s;\n"
                + "Vagas: %d", nome, vagas);
    }
}
