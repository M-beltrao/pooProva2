package com.mariana.Interface;

public class Roteador implements Ligavel, Conectavel{
    @Override
    public void ligar(){
        System.out.println("Roteador ligado");
    }
    public void desligar(){
        System.out.println("Roteador desligadp");
    }
    public void conectarInternet(){
        System.out.println("Roteador conectado");
    }
}
