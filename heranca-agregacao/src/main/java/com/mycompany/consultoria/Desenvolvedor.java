package com.mycompany.consultoria;

public class Desenvolvedor {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;
    
    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada){
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
    
    public void setQntHorasTrabalhadas(Integer qtdHorasTrabalhadas){
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
        return String.format("\nNome: %s; \n"
                + "Quantidade de horas trabalhadas: %d; \n"
                + "Valor Hora Trabalhada: %.2f;\n"
                + "Salário: %.2f;\n", 
                nome, qtdHorasTrabalhadas, valorHoraTrabalhada, getSalario());
    }
}
