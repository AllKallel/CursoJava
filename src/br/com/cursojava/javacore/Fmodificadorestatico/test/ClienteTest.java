package br.com.cursojava.javacore.Fmodificadorestatico.test;


import br.com.cursojava.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        c.imprime();
        c1.imprime();
        c2.imprime();

    }

}
