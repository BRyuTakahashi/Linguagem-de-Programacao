package com.mycompany.conexao.banco;

public class Filme {
    private Integer id;
    private String nome;
    private Integer anoLancamento;
    
    public Filme(Integer id, String nome, Integer anoLancamento){
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }
    
    public Filme(){
    }
    
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getAnoLancamento(){
        return anoLancamento;
    }
    
    public void setAnoLancamento(Integer anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    
    @Override public String toString(){
        return String.format("Id: %d;\nNome: %s;\nAno Lançamento: %d\n\n", id, nome, anoLancamento);
    }
}
