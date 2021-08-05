package br.com.cursojava.javacore.Gassociacao.classes;

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
        System.out.println("Professor palestrante: " + this.professor.getNome());
        System.out.println("Local: Rua " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
        System.out.println("___________________Alunos Inscritos___________________");
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
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
