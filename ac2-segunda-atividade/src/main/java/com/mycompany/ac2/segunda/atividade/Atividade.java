package com.mycompany.ac2.segunda.atividade;

public class Atividade {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados){
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        if(diasEstimados <= 0){
            System.out.println("Não é possível estimar uma atividade em 0 dias ou menos");
        } else{
            this.diasEstimados = diasEstimados;
        }
        diasUsados = 0;
    }
    
    void terminarAtividade(Integer diasUsados){
        if(diasUsados <= 0){
            System.out.println("Não é possível finalizar uma atividade em 0 dias ou menos");
        } else{
            this.diasUsados = diasUsados;
            System.out.println(String.format("Dias usados para a atividade %s atualizado\n", nomeAtividade));
        }
    }
    
    void exibirRelatorio(){
        Integer diferençaDias = diasEstimados - diasUsados;
        
        if(diasUsados > diasEstimados){
            
            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a mais do que o estimado). Melhore a estimativa.\n"
                    , diasEstimados, diasUsados, diferençaDias * -1));
            
        } else if(diasUsados < diasEstimados){
            
            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a menos do que o estimado). Parabéns!\n"
                    , diasEstimados, diasUsados, diferençaDias));
            
        } else {
            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias, atendendo a estimativa com precisão.\n"
                    , diasEstimados, diasUsados));
        }
    }
    
    void setNomeAtividade(String nomeAtividade){
        this.nomeAtividade = nomeAtividade;
    }

    String getNomeAtividade(){
        return nomeAtividade;
    }
    
    void setResponsavel(String responsavel){
        this.responsavel = responsavel;
    }
    
    String getGetResponsavel(){
        return responsavel;
    }
    
    void setDiasEstimados(Integer diasEstimados){
        this.diasEstimados = diasEstimados;
    }
    
    Integer getDiasEstimados(){
        return diasEstimados;
    }
    
    @Override public String toString(){
        return String.format("Atividade: %s;\nResponsável: %s;\nDias Estimados: %d;\nDias Usados: %d.\n", nomeAtividade, responsavel, diasEstimados, diasUsados);
    }
}
