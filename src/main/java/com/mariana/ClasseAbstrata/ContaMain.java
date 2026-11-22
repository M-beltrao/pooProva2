package com.mariana.ClasseAbstrata;

public class ContaMain {
    public static void main(String[] args){
        ContaCorrente corrente = new ContaCorrente("Mariana", 10000);
        ContaPoupanca poupanca = new ContaPoupanca("Maria", 2000);

        System.out.println("====CONTA CORRENTE====");

        corrente.depositar(200);
        corrente.sacar(100);

        System.out.println("Titular: " + corrente.getTitular());
        System.out.println("Saldo: R$ " + corrente.getSaldo());

        System.out.println();

        System.out.println("====CONTA POUPANÇA====");

        poupanca.depositar(200);
        poupanca.sacar(100);

        System.out.println("Titular: " + poupanca.getTitular());
        System.out.println("Saldo: R$ " + poupanca.getSaldo());
    }
}
