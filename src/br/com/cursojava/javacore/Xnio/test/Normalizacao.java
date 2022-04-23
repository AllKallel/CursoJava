package br.com.cursojava.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalizacao {
    public static void main(String[] args) {
        String diretorioProjeto = "JavaOnline\\home\\allan\\dev";
        String arquivoTxt = "..\\..\\arquivo.txt";

        Path path = Paths.get(diretorioProjeto, arquivoTxt);        //concatenando o endereço
        System.out.println(path);
        System.out.println(path.normalize());                       //normalizando o endereço

    }
}
