package br.com.cursojava.javacore.Lclassesabstratas.classes;
/**
 *Aula 60: Classes abstratas pt 01
 */
public abstract class Funcionario extends Pessoa {
    protected String clt;
    protected Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, Double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public abstract void calculaSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprime() {
        System.out.println("Dentro da classe abstrata FUNCIONARIO");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() { return clt; }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
