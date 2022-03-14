package br.com.cursojava.javacore.Oexception.chekedexception.classes;

public class Leitor1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando monitor 1");
    }
}
