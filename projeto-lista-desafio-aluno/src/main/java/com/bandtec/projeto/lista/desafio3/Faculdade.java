package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
    */
    public Boolean existsAlunoPorNome(String nome) {
        Boolean existe = false;
        for (Integer i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getNome().equals(nome)){
               existe = true;
            }
        }
        
        return existe;
        
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
    */
    public void matricularAluno(Aluno aluno) {
        Boolean existe = false;
//        if(aluno.getNome() != null){
            for(Integer i = 0; i < alunos.size(); i++){
                if(alunos.get(i).getNome().equals(aluno.getNome())){
                    existe = true;
                }
            }
//        }
        
        if(existe){
            System.out.println("Aluno já existe na Faculdade");
        } else{
            alunos.add(aluno);
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
    */
    public void cancelarMatricula(String ra) {
        for(Integer i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getRa().equals(ra)){
                alunos.get(i).setAtivo(true);
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
    */
    public Integer getQuantidadeAlunos() {
        
        return alunos.size();
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
    */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer alunosSemestre = 0;
        for(Integer i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getSemestre() == semestre){
                alunosSemestre++;
            }
        }
        return alunosSemestre;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
    */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer matriculasCanceladas = 0;
        for(Integer i = 0; i < alunos.size(); i++){
            if(alunos.get(i).isAtivo() == false){
                matriculasCanceladas++;
            }
        }
        return matriculasCanceladas;
    }

    public String getNome() {
        return nome;
    }
}
