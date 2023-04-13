package com.mycompany.ac2.segunda.atividade;

public class TesteAtividade {
    public static void main(String[] args) {
        
        Atividade atividade1 = new Atividade("Protótipo das Telas", "Bruno", 5);
        atividade1.terminarAtividade(3);
        atividade1.exibirRelatorio();
        
        Atividade atividade2 = new Atividade("Banco de Dados", "Roberto", 3);
        atividade2.terminarAtividade(5);
        atividade2.exibirRelatorio();
        
        Atividade atividade3 = new Atividade("Wireframe", "Jair", 2);
        atividade3.terminarAtividade(2);
        atividade3.exibirRelatorio();
        
        System.out.println(atividade1.toString());
        System.out.println(atividade2.toString());
        System.out.println(atividade3.toString());
    }
}
