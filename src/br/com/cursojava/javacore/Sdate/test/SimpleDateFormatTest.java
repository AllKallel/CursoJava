package br.com.cursojava.javacore.Sdate.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Uberlândia,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }

}
