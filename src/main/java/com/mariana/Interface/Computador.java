package com.mariana.Interface;

public class Computador implements Ligavel, Conectavel{
    @Override
    public void ligar(){
        System.out.println("Computador ligado");
    }
    public void desligar(){
        System.out.println("Computador desligado");
    }
    public void conectarInternet(){
        System.out.println("Computador conectado");
    }
}
