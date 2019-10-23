package br.com.cursojava.javacore.introducaoclasses.test;

import br.com.cursojava.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "KLL";
        carro.modelo = "celta";
        carro.velocidademaxima = 200.00f;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidademaxima);
    }
}
