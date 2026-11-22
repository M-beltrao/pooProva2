package com.mariana.Interface;

public class BancoMain {
    public static void main(String[] args){
        Pagamento[] pagamentos = {new PagamentoPix(), new PagamentoCartao(), new PagamentoBoleto()};
        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(100);
        }
    }
}
