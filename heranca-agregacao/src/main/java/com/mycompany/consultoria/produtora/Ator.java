package com.mycompany.consultoria.produtora;

public class Ator {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;
    
    public Ator(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada){
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas){
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }
    
    public Integer getQtdHorasTrabalhadas(){
        return qtdHorasTrabalhadas;
    }
    
    public void setValorHoraTrabalhada(Double valorHoraTrabalhada){
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getValorHoraTrabalhada(){
        return valorHoraTrabalhada;
    }
    
    public Double getSalario(){
        return qtdHorasTrabalhadas * valorHoraTrabalhada;
    }
    
    @Override public String toString(){
        return String.format("\nNome: %s;\n"
                + "Quantidade Horas Trabalhadas: %d;\n"
                + "Valor Hora Trabalhada: %.2f;\n"
                + "Salário: %.2f;\n", 
                nome, qtdHorasTrabalhadas, valorHoraTrabalhada, getSalario());
    }
}
