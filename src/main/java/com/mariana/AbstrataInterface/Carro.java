package com.mariana.AbstrataInterface;

public class Carro extends Veiculo{

    public Carro(String modelo, double velocidadeAtual){
        super(modelo, velocidadeAtual);
    }
    @Override
    public void acelerar(){
        setVelocidadeAtual(getVelocidadeAtual() + 10);
    }
}
