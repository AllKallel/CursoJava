package br.com.cursojava.javacore.Gassociacao.classes;

import java.sql.SQLOutput;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    //constructors
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    //Methods
    public void printSeminario(){
        System.out.println("________________________RELATORIO DE SEMINARIOS________________________");
        System.out.println("Título: " + this.titulo);
        if (professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        }else{
            System.out.println("Nunhem professor associado a este seminário");
        }

        if(local != null) {
            System.out.println("Local: Rua " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
        }
        else{
            System.out.println("Nenhum local cadastrado para esse seminário.");
        }

        System.out.println("_________Alunos Inscritos_________");
        if(alunos != null && alunos.length != 0) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhul aluno cadastrado.");
    }

    //getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
