package com.mariana.Interface;

public class PagamentoBoleto implements Pagamento{
    public void processarPagamento(double valor){
        System.out.println("Boleto: R$" + valor);
    }
}
