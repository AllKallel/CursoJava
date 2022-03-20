package br.com.cursojava.javacore.Rstring.test;

import java.util.Locale;

/**
 * Curso Java Completo - Aula 80: String pt 01
 */
public class StringTest {
    public static void main(String[] args) {
        String nome = "Allan";
        String sobrenome = new String(" Ramos");  //1 variável de referência, 2 um objeto do tipo string, 3 uma string no pool de string

        nome.concat(" ramos"); // nome+="Ramos"
        System.out.println(nome);
        nome = nome.concat(" Ramos");
        System.out.println(nome);

        String test= "Goku";
        String test2= "goku             ";
        System.out.println(test.charAt(3));
        System.out.println(test2.equals(test));
        System.out.println(test2.equalsIgnoreCase(test));
        System.out.println(test2.length());
        System.out.println(test2.replace('g','k'));
        System.out.println(test2.toLowerCase());
        System.out.println(test2.toUpperCase());
        System.out.println(test2.substring(0,4));
        System.out.println(test2.trim());




    }
}
