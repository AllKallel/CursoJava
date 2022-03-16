package br.com.cursojava.javacore.Passertions.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-1000);
    }
    private static void calculaSalario(double salario){
        assert (salario > 0):"O salario não deve ser menor que zero";
        //calcula salario
    }

    //Forma de tratar em um metodo publico
    public static void CalcSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException();
        }
    }
}
