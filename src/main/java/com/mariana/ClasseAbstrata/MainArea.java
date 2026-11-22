package com.mariana.ClasseAbstrata;
public class MainArea {
    public static void main(String[] args){
        FormaGeometrica[] formas ={ new Circulo(5), new Retangulo(4, 6), new Triangulo(4,8)
        };
        for (int i = 0; i < formas.length; i++) {
            System.out.println("Area: " + formas[i]. calcularArea());
        }
    }
}
