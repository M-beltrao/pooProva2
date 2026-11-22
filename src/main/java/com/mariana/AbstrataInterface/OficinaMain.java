package com.mariana.AbstrataInterface;

public class OficinaMain {
    public static void main(String[] args){
        Carro carro = new Carro("civic", 200);
        CarroEletrico carroEletrico = new CarroEletrico("toyota", 120);

        carro.acelerar();
        carroEletrico.acelerar();

        carroEletrico.carregarBateria();

        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());
        System.out.println("Velocidade do eletrico: " + carroEletrico.getVelocidadeAtual());
    }
}
