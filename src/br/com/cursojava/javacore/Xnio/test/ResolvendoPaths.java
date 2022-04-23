package br.com.cursojava.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {

        /** Resolvendo Paths */
        Path dir = Paths.get("home\\wiliam");
        Path arquivo = Paths.get("dev\\arquivo.txt");
        Path result = dir.resolve(arquivo);                 //Juntando dir + arquivo: home\\william\\dev\\arquivo.txt

        System.out.println(result);

        /** Resolvendo Paths ------------------Possibilidades*/
        Path absoluto = Paths.get("\\home\\wiliam");        //Caminho absoluto
        Path relativo = Paths.get("dev");                   //caminho relativo, pode estar no inicio, meio ou fim.
        Path file = Paths.get("file.txt");                  //arquivo, geralmente está na ponta.

        System.out.println("1: " + absoluto.resolve(relativo));         //resolvido
        System.out.println("2: " + absoluto.resolve(file));             //resolvido
        System.out.println("3: " + relativo.resolve(absoluto));         //O java n consegue revolver o relativo antes e deixa só o absoluto
        System.out.println("4: " + relativo.resolve(file));             //resolvido
        System.out.println("5: " + file.resolve(absoluto));             //o mesmo que no caso 3
        System.out.println("6: " + file.resolve(relativo));             //resolve, mas o valor não faz sentido
    }
}
