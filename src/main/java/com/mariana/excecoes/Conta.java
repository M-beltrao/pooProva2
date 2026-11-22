package com.mariana.excecoes;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void transferir(Conta destino, double valor)throws SaldoInsuficienteException{
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        if (destino == null){
            throw new IllegalArgumentException("A conta destino não pode ser null");
        }
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar transferencia");
        }
        this.saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferencia realizada com sucesso!");

    }
    public double getSaldo(){
        return saldo;
    }
}
