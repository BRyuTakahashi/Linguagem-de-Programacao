package com.mycompany.lista.poo.encapsulamento;

public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;
    
    public Colaborador(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        if(salario > 0){
            this.salario = salario;
        } else{
            System.out.println("Não é possivel atribuir um salário negativo a um colaborador");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override public String toString(){
        return String.format("Colaborador: %s;\nCargo: %s;\nSalário: %.2f.\n", nome, cargo, salario);
    }
    
}
