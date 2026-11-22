package com.mariana.QuestaoIntegradora;

public class ProdutoDigital extends Produtoo implements Descontavel{

    public ProdutoDigital(String nome, double precoBase){
        super(nome, precoBase);
    }
    @Override
    public double calcularPrecoFinal(){
        return getPrecoBase();
    }
    public double aplicarDesconto(double percentual){
        return getPrecoBase() - (getPrecoBase() * percentual / 100);
    }
}
