package br.com.cursojava.javacore.introducaometodos.test;

import br.com.cursojava.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora; //variàvel de referência;
        calculadora = new Calculadora(); //referênciado espaço na memória.
        calculadora.someDoisNumeros();
        calculadora.subtraiDoisMethodos();
        //valores passados para  um methodo são chamados de argumentos
        calculadora.multiplicaDoisNumeros(2,2);
        System.out.println(calculadora.divideDoisNumeros(30,2));
        System.out.println("Continua fora dos méthodos");
    }
}
