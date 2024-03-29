package br.com.cursojava.javacore.Sdate.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 369 pt = Portugues BR = Brasil, en = inglês, US = Estado Unidos
        Locale locItaly = new Locale("it", "IT");
        Locale locsuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapao = new Locale("ja");

        Calendar c = Calendar.getInstance();
        c.set(2022,Calendar.DECEMBER, 25);
        //Formatando as datas
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locsuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);

        System.out.println("Italia" + df.format(c.getTime()));
        System.out.println("Suíça" + df2.format(c.getTime()));
        System.out.println("India" + df3.format(c.getTime()));
        System.out.println("Japão" + df4.format(c.getTime()));

        //BR 1.000,00   US 1,000.00
        System.out.println("Falando Italia em Japones: " + locItaly.getDisplayLanguage(locJapao));
        System.out.println("Falando Italia em indiano: " + locIndia.getDisplayLanguage(locIndia));
        System.out.println("Falando Italia em suiço: " + locItaly.getDisplayLanguage(locsuica));
        System.out.println("Falando Italia em Italiano: " + locItaly.getDisplayLanguage(locItaly));

    }
}
