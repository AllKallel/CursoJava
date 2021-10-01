package br.com.cursojava.javacore.Hheranca.classes;

public class Pessoa {
    // O protected permite que a classe e os filhos da classe acessem os atributos.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    static {
        System.out.println("bloco de inialização estatico de pessoa");
    }

    {
        System.out.println("Bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização de pessoa 2");
    }

    //metodo print
    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + endereco.getRua());
    }

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
