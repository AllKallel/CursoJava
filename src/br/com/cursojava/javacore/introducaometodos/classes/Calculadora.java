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
        //return leva sempre de volta para a classe que o chamou e na maioria dos casos precisa sempre voltar com
        //algum resoltado. A não ser que o metodo seja void.

    public void imprimindoDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; // return sendo utilizado como break;
        }
        System.out.println("Não é possível efetuar divisões por ZERO");
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro no alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray (int[] numeros){
        //aqui a forma de processamento está restrita a arrays pois o argumento do metodo neccessáriamente tem que ser
        //um array.
        int soma = 0;

        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    };

    public void somaVarArgs(int... numeros){
        //nesse caso o metodo já não fica preso a estríng como parâmetro e pode receber os numeros diretamente separa
        //dos por vírgula.
        int soma = 0;

        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
