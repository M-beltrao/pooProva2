package com.mariana.Interface;

public class Televisao implements Ligavel{
    @Override
    public void ligar(){
    System.out.println("Televisão ligada");
    }
    public void desligar(){
        System.out.println("Televisão desligada");
    }
}
