package br.com.cursojava.javacore.Utokensedelimitadores.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("1 2 oi pai kall chucrute gotoso");
        while (scanner.hasNext()){  //verifica se existe algo após o espaço
            System.out.println(scanner.next());
        }

        System.out.println("________________________________________________________________________");

        Scanner scanner2 = new Scanner("1 true 100 olá mundo");
        while (scanner2.hasNext()){
            if (scanner2.hasNextInt()){
                int i = scanner2.nextInt();
                System.out.println("int: " + i);
            }else if(scanner2.hasNextBoolean()){
                boolean b =scanner2.nextBoolean();
                System.out.println("Boolean: " + b);
            }else {
                System.out.println(scanner2.next());
            }
        }
    }
}
