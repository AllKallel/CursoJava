package br.com.cursojava.javacore.Npolimorfismo.test;

import br.com.cursojava.javacore.Npolimorfismo.classes.Funcionario;
import br.com.cursojava.javacore.Npolimorfismo.classes.Gerente;
import br.com.cursojava.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.cursojava.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Kall", 5000.0, 2000.0);
        Vendedor v = new Vendedor("all", 3000.0, 9000.0);

        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
//        relatorioPagamento.relatorioPagamentoGerente(g);
//        System.out.println("------------------------------------");
//        relatorioPagamento.relatorioPagamentoVendedor(v);


        relatorioPagamento.relatorioPagamentoGenerico(g);
        System.out.println("------------------------------------");
        relatorioPagamento.relatorioPagamentoGenerico(v);
//
//        System.out.println("#######################################");

//        Funcionario f = g;
//        System.out.println(f.getSalario());
    }

}
