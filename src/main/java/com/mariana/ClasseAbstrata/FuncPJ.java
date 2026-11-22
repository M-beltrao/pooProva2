package com.mariana.ClasseAbstrata;

public class FuncPJ extends Funcionario{

    public FuncPJ(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase() * 0.05;
    }
}
