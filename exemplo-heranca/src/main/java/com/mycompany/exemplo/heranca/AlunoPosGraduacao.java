package com.mycompany.exemplo.heranca;

public class AlunoPosGraduacao extends Aluno{
    private Double notaTcc;
    private Double notaArtigo;
    
    public AlunoPosGraduacao(Double notaTcc, Double notaArtigo, String nome, String ra, Double nota01, Double nota02){
        super(nome, ra, nota01, nota02);
        this.notaTcc = notaTcc;
        this.notaArtigo = notaArtigo;
        this.ra = ra;
    }
    
    public void exibirTcc(){
        System.out.println("Exibindo TCC");
    }
    
    public Double getNotaTcc(){
        return notaTcc;
    }
    
    public Double getNotaArtigo(){
        return notaArtigo;
    }
    
    @Override public Double calcularMedia(){
        return (this.nota01 + super.nota02 + notaTcc + notaArtigo) / 4;
    }
    
    @Override public String toString(){
        return String.format("\nAluno: %s; \nRA: %s; \nNota 1: %.1f; \nNota 2: %.1f; \nNota TCC: %.1f; \n Nota Artigo: %.1f", nome, ra, nota01, nota02, notaTcc, notaArtigo);
    }
}
