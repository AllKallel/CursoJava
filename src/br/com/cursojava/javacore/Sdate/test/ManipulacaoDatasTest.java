package br.com.cursojava.javacore.Sdate.test;

import sun.awt.geom.AreaOp;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDatasTest {

    public static void main(String[] args) {
        Date date = new Date(100_000_000_000L);
        date.setTime(date.getTime()+ 3_000_000L); //adicionando
        System.out.println(date);

        //USANDO O CALENDAR----------------------------------------------------------------------------------------
        Calendar c = Calendar.getInstance();
        //c.setTime(date);  //setando um valor date no calender
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        //Adicionando mas sem alterar as demais parâmetros
        c.roll(Calendar.HOUR, 24);                               //adicionando horas ao calendar
        c.roll(Calendar.MONTH, 1);                               //adicionando mes ao calendar
        Date date2 = c.getTime();                                      //getTime retorna um date.
        System.out.println(date2);

        c.add(Calendar.HOUR, 24);                               //adicionando horas ao calendar
        c.add(Calendar.MONTH, 1);                               //adicionando mes ao calendar
        date2 = c.getTime();                                      //getTime retorna um date.
        System.out.println(date2);


    }
}
