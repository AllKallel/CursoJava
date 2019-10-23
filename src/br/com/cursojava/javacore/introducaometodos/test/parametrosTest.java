package br.com.cursojava.javacore.introducaometodos.test;

import br.com.cursojava.javacore.introducaometodos.classes.Calculadora;

public class parametrosTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 2;
        int num2 = 4;
        calculadora.alteraDoisNumeros(num1,num2);

        System.out.println("Dentro do Test");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
