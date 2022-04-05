package br.com.cursojava.javacore.Wio.test;

import java.io.Console;

public class ConsoleTest{
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw   = c.readPassword("%s", "pw");
        for (char pass : pw){
            c.format("%c", pass);
        }
        c.format("\n");

        String texto = null;
        while (true){
            texto = c.readLine("%s","Digite: ");
            c.format("Esse texto %s foi escrito", retorno(texto));
        }
    }
    public static String retorno(String arg1){
        return arg1;
    };
}
