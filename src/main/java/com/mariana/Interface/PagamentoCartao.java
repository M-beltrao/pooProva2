package com.mariana.Interface;

public class PagamentoCartao implements Pagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Cartão: R$" + valor);
    }
}
