package com.mariana.excecoes;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade)throws IllegalArgumentException{
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Esse campo não pode ficar vazio");
        }
        if(preco <= 0){
            throw new IllegalArgumentException("O preço deve ser maior que zero!");
        }
        if(quantidade < 0){
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
