package br.com.cursojava.javacore.Kenum.test;

import br.com.cursojava.javacore.Kenum.classes.Cliente;
import br.com.cursojava.javacore.Kenum.classes.TipoCliente;

/**
 * Aula 57: Enumeração pt 01
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("kall", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);
    }
}