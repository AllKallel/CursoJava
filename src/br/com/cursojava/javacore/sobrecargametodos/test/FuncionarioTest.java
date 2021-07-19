package br.com.cursojava.javacore.sobrecargametodos.test;

import br.com.cursojava.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("allan","111.222.333-44", 7000, "MG-11.222.333");
        Funcionario funcionario2 = new Funcionario();

        funcionario.imprimir();
        funcionario2.imprimir();
    }
}
