package br.com.cursojava.javacore.Csobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private double salario;
    private String cpf;
    private String rg;

    public Funcionario(){

    }

    //Metodo construtor da classe
    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    //getters and setters
    public void setNome(String nome){ this.nome = nome; }

    public void setSalario(double salario){ this.salario = salario; }

    public void setCpf(String cpf){ this.cpf = cpf; }

    public void setRg (String rg){ this.rg = rg; }

    public String getNome(){ return this.nome; }

    public double getSalario(){ return this.salario; }

    public String getCpf(){ return this.cpf; }

    public String getRg(){ return this.rg; }

    //inicia o objeto atribuindo valores aos seus atributos------------------------------------------------------------
    /*
    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    //Sobrecarga do metodo init
    public void init(String nome, String cpf, double salario, String rg){
        init(nome, cpf, salario); //Para reduzir linhas de cod. Chamamos o init dentro da sobrecarga dele mesmo
        this.rg = rg;
    }
    */

    //metodo imprimir--------------------------------------------------------------------------------------------------
    public void imprimir(){
        System.out.println("Nome = "+this.nome);
        System.out.println("CPF = "+this.cpf);
        System.out.println("Salário = "+this.salario);
        System.out.println("RG = "+this.rg);
    }

}
