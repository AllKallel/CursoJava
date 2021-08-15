package br.com.cursojava.javacore.Hheranca.test;

import br.com.cursojava.javacore.Hheranca.classes.Endereco;
import br.com.cursojava.javacore.Hheranca.classes.Funcionario;
import br.com.cursojava.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Endereco end = new Endereco();
        Endereco end2 = new Endereco();

        p1.setNome("kallel");
        p1.setCpf("123.123.123.12");
        p2.setNome("Quezia");
        p2.setCpf("321.321.321.32");
        end.setBairro("Guamá");
        end.setRua("Olaria");
        end2.setBairro("icoarací");
        end2.setRua("priprioca");
        p1.setEndereco(end);
        p2.setEndereco(end2);

        p1.print();
        p2.print();

        System.out.println("Funcionário-------------------------------------------------");
        Funcionario fun = new Funcionario();
        fun.setNome("Sara");
        fun.setCpf("321.321.321.32");
        fun.setEndereco(end2);
        fun.setSalario("15.000");
        fun.print();

    }
}
