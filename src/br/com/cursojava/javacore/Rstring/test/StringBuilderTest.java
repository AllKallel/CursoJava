package br.com.cursojava.javacore.Rstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String a = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("123456789");
        a = sb.toString();
        //sb.append(" test");  //objeto sendo reutilizado. nada foi criado no pool de strings.
        System.out.println(a);
        System.out.println(sb);
        //System.out.println(sb.reverse());
        //System.out.println(sb.delete(0,3));
        System.out.println(sb.insert(2,"tres"));
    }
}
