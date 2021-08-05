package br.com.cursojava.javacore.Gassociacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    //constructors
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    //Metodos
    public void printAluno(){
        System.out.println("________________________RELATORIO DE ALUNOS________________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (seminario != null)
            System.out.println("Seminario: " + this.seminario.getTitulo());
        else
            System.out.println("Aluno não escrito em nenhum seminario");
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
