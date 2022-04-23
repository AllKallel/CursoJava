package br.com.cursojava.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        /**______________________________________________________________________________________ Relativisando Paths */
        Path dir = Paths.get("\\home\\allan");
        Path classe = Paths.get("\\home\\allan\\java\\Pessoa.java");
        Path pathToClasse = dir.relativize(classe);         //relativização entre dir e classe;
        System.out.println(pathToClasse);


        /**____________________________________________________________________________________________ CASOS E CASOS */
        Path absoluto1 = Paths.get("\\nome\\allan");
        Path absoluto2 = Paths.get("\\user\\local");
        Path absoluto3 = Paths.get("\\home\\allan\\java\\Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp\\Funcionario.java");

        System.out.println("1: " + absoluto1.relativize(absoluto3));
        System.out.println("2: " + absoluto3.relativize(absoluto1));
        System.out.println("3: " + absoluto1.relativize(absoluto2));
        System.out.println("4: " + relativo1.relativize(relativo2));
        System.out.println("5: " + absoluto1.relativize(relativo1));    //impossível determinar onde o relativo está
    }

}