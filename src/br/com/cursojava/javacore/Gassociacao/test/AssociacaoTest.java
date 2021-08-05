package br.com.cursojava.javacore.Gassociacao.test;

import br.com.cursojava.javacore.Gassociacao.classes.Aluno;
import br.com.cursojava.javacore.Gassociacao.classes.Local;
import br.com.cursojava.javacore.Gassociacao.classes.Professor;
import br.com.cursojava.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Kallel",3);
        Aluno aluno2 = new Aluno("Kezya",23);
        Seminario semi = new Seminario("Como ser gostoso");
        Professor prof = new Professor("Willian Suane","Ensinar java a força");
        Local local = new Local("Hercio Martins Gomide","Jardim Patricia");

        aluno.setSeminario(semi);
        aluno.printAluno();                         //
        semi.setProfessor(prof);                    //um seminario tem um professor
        semi.setLocal(local);                       //um seminario tem um local
        semi.setAluno(new Aluno[]{aluno, aluno2});  //um seminario pode ter varios alunos
        prof.setSeminarios(new Seminario[]{semi});  //um professor pode ter vaios seminarios

        semi.printSeminario();
        prof.printProfessor();


    }
}
