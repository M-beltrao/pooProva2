package com.mariana.ClasseAbstrata;

import java.util.stream.StreamSupport;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalarioBase(double salario){
        this.salarioBase = salario;
    }

    public abstract double calcularSalario();
}
