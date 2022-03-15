package br.com.cursojava.javacore.Oexception.chekedexception.test;
/**
 * Curso Java Completo - Aula 76: Exceptions e regras para sobrescrita pt 10
 */

import br.com.cursojava.javacore.Oexception.chekedexception.classes.Funcionario;
import br.com.cursojava.javacore.Oexception.chekedexception.classes.Pessoa;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        f.salvar();
    }
}
