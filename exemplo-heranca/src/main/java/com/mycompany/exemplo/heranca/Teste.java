package com.mycompany.exemplo.heranca;

public class Teste {

    public static void main(String[] args) {
        Aluno alunoComum = new Aluno("Bruno", "01222151", 8.0, 4.0);
        AlunoPosGraduacao alunoPos = new AlunoPosGraduacao(7.4, 8.2, "Ryu", "01222152", 4.8, 6.2);

        Faculdade faculdade = new Faculdade("SPTech");
        faculdade.matricular(alunoComum);
        faculdade.matricular(alunoPos);

    }
}
