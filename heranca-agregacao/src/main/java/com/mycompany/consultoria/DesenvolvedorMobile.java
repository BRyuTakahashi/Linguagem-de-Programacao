package com.mycompany.consultoria;

public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;
    
    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile, Double valorHoraTrabalhadaMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada){
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadas;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile){
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }
    
    public Integer getQtdHorasTrabalhadasMobile(){
        return qtdHorasTrabalhadasMobile;
    }
    
    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile){
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    public Double getValorHoraTrabalhadaMobile(){
        return valorHoraTrabalhadaMobile;
    }
    
    @Override public Double getSalario(){
        return (super.valorHoraTrabalhada * super.qtdHorasTrabalhadas) + (qtdHorasTrabalhadasMobile * valorHoraTrabalhadaMobile);
    }
    
    @Override public String toString(){
        return String.format("%s"
                + "Quantidade Horas Trabalhadas Mobile: %d; \n"
                + "Valor Hora Trabalhada Mobile: %.2f;\n", 
                super.toString(), qtdHorasTrabalhadasMobile, valorHoraTrabalhadaMobile);
    }
}
