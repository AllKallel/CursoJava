package br.com.cursojava.javacore.Bintroducaometodos.test;

import br.com.cursojava.javacore.Bintroducaometodos.classes.Calculadora;

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
//Os parametros são apenas cópias dos valores contidos nas variáveis. Os valores originais não são alterados pelos
//methodos.