package br.com.cursojava.javacore.Hheranca.classes;

public class Pessoa {
    // O protected permite que a classe e os filhos da classe acessem os atributos.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    //metodo print
    public void print(){
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

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return endereco;
    }
}
