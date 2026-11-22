package com.mariana.excecoes;

public class Livro {
    private String titulo;
    private int exemplaresDisponiveis;

    public Livro(String titulo, int exemplaresDisponiveis){
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }
    public void emprestar()throws LivroIndisponivelException{
        if(exemplaresDisponiveis <= 0){
            throw new LivroIndisponivelException("Livro indisponivel");
        }
        exemplaresDisponiveis --;
        System.out.println("emprestimo realizado!");

    }

}
