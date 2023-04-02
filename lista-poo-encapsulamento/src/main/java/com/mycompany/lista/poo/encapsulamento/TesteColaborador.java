package com.mycompany.lista.poo.encapsulamento;

public class TesteColaborador {
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();
        
        
        Colaborador colab1 = new Colaborador();
        colab1.setNome("William");
        colab1.setCargo("Professor Auxiliar");
        colab1.setSalario(2000.0);
        
        System.out.println(colab1.getNome());
        System.out.println(colab1.getCargo());
        System.out.println(colab1.getSalario());
        
        rh.promoverColaborador("Professor Titular", 2500.0, colab1);
        System.out.println(colab1.getNome());
        System.out.println(colab1.getCargo());
        System.out.println(colab1.getSalario());
        
        
        Colaborador colab2 = new Colaborador();
        colab2.setNome("Bruno");
        colab2.setCargo("Estagiário");
        colab2.setSalario(2000.0);
        System.out.println(colab2.getNome());
        System.out.println(colab2.getCargo());
        System.out.println(colab2.getSalario());
        
        rh.promoverColaborador("Dev Junio", 2500.0, colab2);
        System.out.println(colab2.getNome());
        System.out.println(colab2.getCargo());
        System.out.println(colab2.getSalario());
        
        rh.reajustarSalario(5000.0, colab2);
        System.out.println(colab2.getSalario());
        
        System.out.println(rh.promossoes);
        System.out.println(rh.reajustes);
    }
}
