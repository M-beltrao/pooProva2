package com.mariana.excecoes;

public class Biblioteca {
    public static void main(String[] args){
        Livro livro = new Livro("java", 2);

        try{
            livro.emprestar();
            livro.emprestar();
            livro.emprestar();
        }catch (LivroIndisponivelException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
