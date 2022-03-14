package br.com.cursojava.javacore.Oexception.chekedexception.classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando monitor 2");
    }
}
