package br.com.cursojava.javacore.introducaometodos.test;

import br.com.cursojava.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kallel";
        professor.matricula = 1234;
        professor.rg = "12345556";
        professor.cpf = "123.123.123.12";
        professor.imprimeDados();
    }
}