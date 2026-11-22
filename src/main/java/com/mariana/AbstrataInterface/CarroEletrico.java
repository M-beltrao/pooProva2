package com.mariana.AbstrataInterface;

public class CarroEletrico extends Veiculo implements Eletrico{
    CarroEletrico(String modelo, double velocidadeAtual){
        super(modelo, velocidadeAtual);
    }
    @Override
    public void acelerar(){
        setVelocidadeAtual(getVelocidadeAtual() + 15);
    }
    public void carregarBateria(){
        System.out.println("Bateria carregada!");
    }
}
