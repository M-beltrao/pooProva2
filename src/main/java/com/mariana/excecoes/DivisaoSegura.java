package com.mariana.excecoes;
import java.util.Scanner;
public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        try {
            System.out.println("Digite um número: ");
            n1 = sc.nextInt();

            System.out.println("Digite outro número: ");
            n2 = sc.nextInt();

            if (n2 == 0) {
                System.out.println("Erro: divisão por zero!");
            } else {
                int resultado = n1 / n2;
                System.out.println("resultado: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Erro digite apenas numeros interios!");
        }finally {
            System.out.println("Operação encerrrada");
            sc.close();
        }
    }
}
