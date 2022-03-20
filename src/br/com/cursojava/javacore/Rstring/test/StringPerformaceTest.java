package br.com.cursojava.javacore.Rstring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
       long inicio = System.currentTimeMillis();
       concatString(1000);
       long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String " + (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
       concatStringBuilder(100000);
       fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder " + (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
       concatStringBuffer(10000);
       fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer " + (fim-inicio) + "ms");
    }

    public static void concatString(int tam){
        String string = "";
        for(int i = 0; i < tam; i++){
            string += i;
        }
    }

    public static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for(int i = 0; i < tam; i++){
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tam){
        StringBuffer sbf = new StringBuffer(tam);
        for(int i = 0; i < tam; i++){
            sbf.append(i);
        }
    }
}
