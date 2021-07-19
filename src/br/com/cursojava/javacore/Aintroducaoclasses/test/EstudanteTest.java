package br.com.cursojava.javacore.Aintroducaoclasses.test;
/**
 * curso java devDojo Allan G. ramos 17/10/2019
 */
import br.com.cursojava.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante kallel = new Estudante();
        kallel.nome = "Kallel M. Ramos";
        kallel.idade = 1.8f;
        kallel.matricula = 2912;

        System.out.println(kallel.nome);
        System.out.println(kallel.idade);
        System.out.println(kallel.matricula);
    }

}
