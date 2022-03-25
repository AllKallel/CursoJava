package br.com.cursojava.javacore.Sdate.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 1233232.1234f;
        Locale locJP = new Locale("jp");
        Locale locFR = new Locale("fr");
        Locale locIT = new Locale("it");

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(locJP);
        nf[2] = NumberFormat.getCurrencyInstance(); //Formatação de moeda
        nf[3] = NumberFormat.getCurrencyInstance(locJP);

        for (NumberFormat n : nf){
            System.out.println(n.format(valor));
        }

        //Formatação de numeros após a virgula. Formatação de decimal.
        NumberFormat n = NumberFormat.getInstance();
        System.out.println(n.getMaximumFractionDigits());

        //Setando quantidade de decimais
        n.setMaximumFractionDigits(2);
        System.out.println(n.format(valor));

        //Transformado strings em numeros com o parse
        String value = "232,12";
        try {
            System.out.println(n.format(n.parse(value)));
            n.setParseIntegerOnly(true);
            System.out.println(n.format(n.parse(value)));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
