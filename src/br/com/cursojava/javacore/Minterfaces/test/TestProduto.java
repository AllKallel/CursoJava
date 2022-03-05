package br.com.cursojava.javacore.Minterfaces.test;

import br.com.cursojava.javacore.Minterfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto p = new Produto("celular", 0.2, 1800.0);
        p.calculaImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
