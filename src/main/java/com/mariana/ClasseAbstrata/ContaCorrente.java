package com.mariana.ClasseAbstrata;

public class ContaCorrente extends  ContaBancaria{

    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }
    @Override
    public void sacar(double valor){
        if(valor > 0 && valor + 2 <= getSaldo()){
            atualizarSaldo(getSaldo() - valor - 2);
            System.out.println("Saque realizador com taxa de R$ 2,00");
        }else{
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
}
