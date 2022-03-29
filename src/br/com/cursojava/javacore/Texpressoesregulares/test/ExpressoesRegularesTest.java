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
        // () - faz o agrupamento do

        // [] - Efetua uma busca pelos caracteres descritos como;
                //[asd] busca as letras a, s ou d minusculas
                //[a-zA-Z] busca todas as letras de a até z, maiusculas e minusculas.
        //Quantificadores
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupar
        // | ou
        // $
        // \\. coringa 1.3 = 123, 133, 1A3 1#3, 1 3
        // ^ negação

        int hex = 0x1;  //numero hexadecimal.
        //String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        //String texto = "Hoje @Kallel dormiu como um anjo12, Kallel29 gotoso_ \r";
        //String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
//        String texto = "fulano@hotmail.com, 102abc@gmail.com, #@!abraao@gmail.com, testa@gmail.com.br, teste@gmail";
//        System.out.println("Email é valido?" + "allanramos2912@gmail.com".matches(regex)); //Validando com metodo matches

//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "29/12/17 29/12/2012 1/2/17 20/8/92 30/08/1992";

        String regex = "proj([^,])*";
        String texto = "proj.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";


        Pattern pattern = Pattern.compile(regex); //padrão e equação sobre o que será
        Matcher matcher = pattern.matcher(texto); //combo onde será efetuada busca.

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 012345...");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " - " + matcher.group());

        }
    }
}
