package br.com.cursojava.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas = {};
    private String dataMatricula;

    //METODO CONSTRUTOR
    public Estudante(){

    }
    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
       this(matricula, nome, notas);
       this.dataMatricula = dataMatricula;
    }

    //GETTERS AND SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    //METODO IMPRIMIR
    public void print(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(notas.length);

        if (notas.length <= 0 ){
            System.out.println("Estudante não possui notas");
        }
        for (double notas : notas) {
            System.out.println(notas + " ");
        }
    }
}
