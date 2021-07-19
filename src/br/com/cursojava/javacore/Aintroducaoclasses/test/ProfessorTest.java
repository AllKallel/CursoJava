package br.com.cursojava.javacore.Aintroducaoclasses.test;

import br.com.cursojava.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Allan";
        prof.matricula = 1212;
        prof.rg = "MG22141227";
        prof.cpf = "02878425251";

        System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);
        System.out.println(prof.cpf);
    }
}
