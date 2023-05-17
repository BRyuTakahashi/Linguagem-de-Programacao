package com.mycompany.consultoria.produtora;

public class Protagonista extends Ator{
    private Integer qtdHorasTrabalhadasProtagonista;
    private Double valorHoraTrabalhadaProtagonista;
    
    public Protagonista (Integer qtdHorasTrabalhadasProtagonista, Double valorHoraTrabalhadaProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada){
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }
    
    public void setQtdHorasTrabalhadasProtagonista(Integer qtdHorasTrabalhadasProtagonista){
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
    }
    
    public Integer getHorasTrabalhadasProtagonista(){
        return qtdHorasTrabalhadasProtagonista;
    }
    
    public void setValorHoraTrabalhadaProtagonista(Double valorHoraTrabalhadaProtagonista){
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }
    
    public Double getValorHoraTrabalhadaProtagonista(){
        return valorHoraTrabalhadaProtagonista;
    }
    
    @Override public Double getSalario(){
        return (super.valorHoraTrabalhada * super.qtdHorasTrabalhadas) + (qtdHorasTrabalhadasProtagonista * valorHoraTrabalhadaProtagonista);
    }
    
    @Override public String toString(){
        return String.format("%s"
                + "Quantidade Horas Trabalhadas Protagonista: %d;\n"
                + "Valor Horas Trabalhadas Protagonista: %.2f;\n", 
                super.toString(), qtdHorasTrabalhadasProtagonista, valorHoraTrabalhadaProtagonista);
    }
}
