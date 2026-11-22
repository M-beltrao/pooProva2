package com.mariana.ClasseAbstrata;

public class FuncCLT extends Funcionario{

    public FuncCLT(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase() * 1.10;
    }
}
