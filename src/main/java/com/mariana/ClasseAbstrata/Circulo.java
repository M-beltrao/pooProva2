package com.mariana.ClasseAbstrata;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
    double pi = 3.14;
    @Override
    public double calcularArea(){
        return pi * raio * raio;
    }
}
