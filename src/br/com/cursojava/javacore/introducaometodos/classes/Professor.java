package br.com.cursojava.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public int matricula;
    public String rg;
    public String cpf;

    public void imprimeDados(){
        
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);
    }
}
