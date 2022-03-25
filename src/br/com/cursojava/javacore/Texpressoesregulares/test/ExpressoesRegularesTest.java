package br.com.cursojava.javacore.Texpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {

        //Meta caracteres - esta é acionada por uma contrabarra \
        // \d - Todos os digitos
        // \D - Tudo o que não for digito
        // \s - Espaços em branco  \t \n \f \r
        // \S - Espaços que não estão em branco
        // \w - Earacteres de palavras a-z, A-Z, digitos e _
        // \W - Tudo o que não for caractere de palara

        String regex = "\\W";
        String texto = "Hoje @Kallel dormiu como um anjo12, Kallel29 gotoso_ \r";
        Pattern pattern = Pattern.compile(regex); //padrão
        Matcher matcher = pattern.matcher(texto); //combo onde será buscado o padrão

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 012345...");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start());

        }
    }
}
