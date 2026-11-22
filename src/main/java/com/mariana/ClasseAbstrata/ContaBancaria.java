package com.mariana.ClasseAbstrata;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public abstract void sacar(double valor);

    protected void atualizarSaldo (double novoValor){
        saldo = novoValor;
    }
}
