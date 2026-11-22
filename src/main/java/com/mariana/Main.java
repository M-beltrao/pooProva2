package com.mariana;

import com.mariana.ClasseAbstrata.FuncCLT;
import com.mariana.ClasseAbstrata.FuncPJ;
import com.mariana.ClasseAbstrata.Funcionario;

public class Main{
    public static void main(String [] args){
        FuncCLT clt = new FuncCLT("Mariana", 2000);
        FuncPJ pj = new FuncPJ("Maria", 5000);

        System.out.println("Funcionario clt: " + clt.getNome());
        System.out.println("Salario: R$" + clt.calcularSalario());

        System.out.println("---------------");

        System.out.println("Funcionario PJ: " + pj.getNome());
        System.out.println("Salário: R$" + pj.calcularSalario());

    }
}