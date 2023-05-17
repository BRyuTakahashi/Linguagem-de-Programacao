package com.mycompany.exemplo.heranca;

public class Aluno {
    protected String nome;
    protected String ra;
    protected Double nota01;
    protected Double nota02;
    
    public Aluno (String nome, String ra, Double nota01, Double nota02){
        this.nome = nome;
        this.ra = ra;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    String getNome(){
        return nome;
    }
    
    public void setRa(String ra){
        this.ra = ra;
    }
    
    String getRa(){
        return ra;
    }
    
    public void setNota01(Double nota01){
        this.nota01 = nota01;
    }
    
    Double getNota01(){
        return nota01;
    }
    
    public void setNota02(Double nota02){
        this.nota02 = nota02;
    }
    
    Double getNota02(){
        return nota02;
    }
    
    
    public Double calcularMedia(){
        return (nota01 + nota02) / 2;
    }
}
