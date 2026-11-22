package com.mariana.QuestaoIntegradora;

public class ProdutoFisico extends Produtoo{

    public ProdutoFisico(String nome, double precoBase){
        super(nome, precoBase);
    }
    @Override
    public double calcularPrecoFinal(){
        return getPrecoBase() + 15.00;
    }
}
