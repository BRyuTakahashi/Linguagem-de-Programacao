package com.mycompany.lista.introducao.poo;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        
        empregado1.nome = "Bruno";
        empregado1.salario = 1800.00;
        empregado1.cargo = "Desenvolvedor mobile";
        
        empregado1.reajustarSalario(1.15);
        empregado1.relatorio();
        
        Empregado empregado2 = new Empregado();
        
        empregado2.nome = "Namie";
        empregado2.salario = 4000.00;
        empregado2.cargo = "Animadora Digital";
        empregado2.relatorio();
    }
}
