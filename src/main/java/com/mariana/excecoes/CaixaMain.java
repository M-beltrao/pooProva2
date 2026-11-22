package com.mariana.excecoes;

public class CaixaMain {
    public static void main(String[] args){

        try{
            Produto p1 = new Produto("Celular", 1500, 5);
            System.out.println("Produto cadastrado!");

            Produto p2 = new Produto("", 5600, 2);
            System.out.println("Produto cadastrado!");
        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            Produto p3 = new Produto("mouse", 0, 10);
            System.out.println("Produto cadastrado!");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            Produto p4 = new Produto("caneta", 150, -2);
            System.out.println("Produto cadastrado!");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
