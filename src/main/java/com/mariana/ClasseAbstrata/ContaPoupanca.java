package com.mariana.ClasseAbstrata;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= getSaldo()){
            atualizarSaldo(getSaldo() - valor);

            System.out.println("Saque realizado sem taxas!");
        } else {
            System.out.println("Saldo insuficinete ou valor inválido!");
        }
    }
}
