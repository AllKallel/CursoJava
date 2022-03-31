package br.com.cursojava.javacore.Utokensedelimitadores.test;
/**
 *          Tokens e delimitadores com String
 */
public class TokenTest {
    public static void main(String[] args) {
        String str = "Allan, Kallel, Georgenado, Alex, Lailson";
        String[] tokens = str.split(",");

        for (String s : tokens){
            System.out.println(s.trim());   // Metodo trim() retira os espaços do começo e do final.
        }
    }
}
