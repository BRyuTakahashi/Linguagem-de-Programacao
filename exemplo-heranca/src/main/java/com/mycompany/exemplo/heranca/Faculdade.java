package com.mycompany.exemplo.heranca;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos;
    
    public Faculdade (String nome){
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    
    public void matricular(Aluno a){
        alunos.add(a);
    }
    
    public void exibirAlunos(){
        for(Integer i = 0; i < alunos.size(); i++){
            System.out.println(alunos);
        }
    }
    
    public void exibirAlunosPosGraduacao(){
        for(Integer i = 0; i < alunos.size(); i++){
            if(alunos instanceof AlunoPosGraduacao){
                System.out.println(alunos);
            }
        }
    }
}
