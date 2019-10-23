package br.com.cursojava.javacore.introducaometodos.classes;

/**
 * curso java 23/10/19 allan ramos
 */

//methodos precisam de um modificador de acesso, um retorno e o nome do methodo.
public class Calculadora {
    public void someDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisMethodos() {
        System.out.println(5 - 5);
    }

    //variáveis declaradas dentro de methodos são chamadas de parâmetros
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimindoDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0){
            System.out.println( num1 / num2);
            return; // return sendo utilizado como break;
        }
        System.out.println("Não é possível efetuar divisões por ZERO");
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro no alteraDoisNumeros");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
