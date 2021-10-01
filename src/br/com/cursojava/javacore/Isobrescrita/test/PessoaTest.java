package br.com.cursojava.javacore.Isobrescrita.test;


import br.com.cursojava.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Maria joaquina da esquina");
        p.setIdade(277);
        System.out.println(p.toString());
        System.out.println("fora de toString: Nome: "+ p.getNome()+" Idade: "+p.getIdade());

    }
}
