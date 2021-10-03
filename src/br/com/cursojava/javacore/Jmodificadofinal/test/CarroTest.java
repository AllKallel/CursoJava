package br.com.cursojava.javacore.Jmodificadofinal.test;

import br.com.cursojava.javacore.Jmodificadofinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.getComprador().setNome("Allan");
        System.out.println(c.getComprador());
    }
}
