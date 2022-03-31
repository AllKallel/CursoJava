package br.com.cursojava.javacore.Vresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en","US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));

        rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("love.of.my.life"));
        System.out.println(rb.getString("show"));

        //Processo recursivo do java para encontrar determinado resouece bundle
        //Locale locale = new Locale("fr","CA")
        //ResourceBundle.getBundle("messages", locale);

        //1 procura pelo arquivo: messages_fr_CA.properties
        //2 procura pelo arquivo: messages_fr.properties
        //3 procura pelo arquivo de localização padrão, no meu caso : messages_pt_BR.properties
        //4 procura pelo arquivo de localização padrão, no meu caso : messages_pt.properties
        //5 procura pelo arquivo : messages.properties
        //6 throw exception; missingResourceException
    }
}
