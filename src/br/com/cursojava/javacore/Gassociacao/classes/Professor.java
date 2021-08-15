package br.com.cursojava.javacore.Gassociacao.classes;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    //constructors
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    //metodos
    public void printProfessor(){
        System.out.println("________________________RELATORIO DE PROFESSORES________________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("_________Seminario(s)__________");
        if(seminarios != null && seminarios.length != 0){
            for (Seminario semi : seminarios) {
                System.out.println(semi.getTitulo());
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum Seminário ");
    }

    //Getters And Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
