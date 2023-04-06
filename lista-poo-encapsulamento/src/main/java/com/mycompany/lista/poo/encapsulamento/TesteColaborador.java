package com.mycompany.lista.poo.encapsulamento;

public class TesteColaborador {
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos(0, 0);
        
        
        Colaborador colab1 = new Colaborador("William", "Professor Auxiliar", 2000.0);
        System.out.println(colab1.toString());
        
        rh.promoverColaborador("Professor Titular", 2500.0, colab1);
        System.out.println(colab1.toString());
        
        
        Colaborador colab2 = new Colaborador("Bruno", "Estagiário", 2000.0);
        System.out.println(colab2.toString());
        
        rh.promoverColaborador("Dev Junio", 2500.0, colab2);
        System.out.println(colab2.toString());
        
        rh.reajustarSalario(5000.0, colab2);
        System.out.println(colab2.getSalario());
        
        System.out.println(colab2.toString());
        
        System.out.println(rh.toString());
    }
}
