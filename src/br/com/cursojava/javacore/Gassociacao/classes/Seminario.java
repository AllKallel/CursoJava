package br.com.cursojava.javacore.Gassociacao.classes;

public class Seminario {

    private String titulo;
    private Aluno[] aluno;
    private Professor professor;
    private Local local;

    //constructors
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    //Methods
    public void print(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Aluno: " + this.aluno);
        System.out.println("Professor: " + this.professor);
        System.out.println("Local: " + this.local);
    }

    //getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
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
