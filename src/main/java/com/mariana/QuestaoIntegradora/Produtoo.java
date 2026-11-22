package com.mariana.QuestaoIntegradora;

public abstract class Produtoo {
    private String nome;
    private double precoBase;

    public Produtoo(String nome, double precoBase) throws PrecoInvalidoException {
        if(precoBase <=0){
            throw new PrecoInvalidoException("O preço deve ser maior que zero!");
        }
        this.nome = nome;
        this.precoBase = precoBase;
    }
    public String getNome(){
        return nome;
    }
    public double getPrecoBase(){
        return precoBase;
    }
    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();
}
