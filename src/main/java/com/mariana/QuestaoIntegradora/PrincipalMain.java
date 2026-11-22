package com.mariana.QuestaoIntegradora;

public class PrincipalMain {
    public static void main(String[] args) {
        try {
            ProdutoFisico produtoFisico = new ProdutoFisico("Mouse", 100);
            ProdutoDigital produtoDigital = new ProdutoDigital("jogo", 500);

            Produtoo[] produtoos = {produtoFisico, produtoDigital};

            for (int i = 0; i < produtoos.length; i++) {
                System.out.println("Produto: " + produtoos[i].getNome());
                System.out.println("Preço final: " + produtoos[i].calcularPrecoFinal());
            }
                System.out.println("\n Desconto no produto digital:");
                System.out.println("preço com desconto: R$" + produtoDigital.aplicarDesconto(10));

        }catch (PrecoInvalidoException e){
            System.out.println("Erro: " + e.getMessage());
        }try {
            ProdutoFisico produtoFisico2 = new ProdutoFisico("celular", 0);
            ProdutoDigital produtoDigital2 = new ProdutoDigital("gta", -2);

            Produtoo produtoo2[] = {produtoFisico2, produtoDigital2};

            for (int i = 0; i < produtoo2.length; i++) {
                System.out.println("Produtp 2: " + produtoo2[i].getNome());
                System.out.println("Preço final: " + produtoo2[i].calcularPrecoFinal());
            }
                System.out.println("\n Desconto no produto digital:");
                System.out.println("Preço com desconto: R$" + produtoDigital2.aplicarDesconto(5));

        }catch (PrecoInvalidoException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

