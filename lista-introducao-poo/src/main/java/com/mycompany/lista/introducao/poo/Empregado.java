package com.mycompany.lista.introducao.poo;

public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double porcentagemAjuste){
        System.out.println(String.format("Salário de R$%.2f reajustado em %.2f", salario, porcentagemAjuste));
        salario = salario * porcentagemAjuste;
    }
    
    void relatorio(){
        System.out.println(String.format("O empregado %s trabalhando como %s, teve um reajuste no salário, ficando com R$%.2f de salário", nome, cargo, salario));
    }
}
