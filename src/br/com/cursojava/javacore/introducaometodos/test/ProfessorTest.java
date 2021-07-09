package br.com.cursojava.javacore.introducaometodos.test;

import br.com.cursojava.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor2 = new Professor();
        Professor professor = new Professor();

        professor2.nome = "allan";
        professor2.matricula =1235;
        professor2.rg = "12341234";
        professor2.cpf ="123123123";

        professor.nome = "Kallel";
        professor.matricula = 1234;
        professor.rg = "12345556";
        professor.cpf = "12312312312";

        professor.imprimeDados();
        professor.imprimeDados();
        professor2.imprimeDados();

    }
}

//Variáveis do tipo reference, no momento da execução, não fazem cópia, mas sim apontam para o endereço de
// memória do objeto. Sendo assim, as alterações feitas por um objeto podem impactar em outro objeto do mesmo tipo.

