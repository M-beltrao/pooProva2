package com.mariana.Interface;

public class EletronicoMain {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        Roteador roteador = new Roteador();
        Computador computador = new Computador();

        computador.desligar();
        televisao.ligar();
        roteador.conectarInternet();
    }
}
