package br.com.cursojava.javacore.Fmodificadorestatico.test;

import br.com.cursojava.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro a = new Carro("Celta", 120);
        Carro b = new Carro("Mercedes", 240);
        Carro c = new Carro("Tesla", 300);

        a.imprimir();
        b.imprimir();
        c.imprimir();

        Carro.VelocidadeLimite = 220;

        a.imprimir();
        b.imprimir();
        c.imprimir();



    }
}
