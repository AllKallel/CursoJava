package br.com.cursojava.javacore.Minterfaces.classes;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preço;
    private double preçoFinal;
    private double valorFrete;

    @Override
    public void calculaImposto() {
        preçoFinal = this.preço + (this.preço * IMPOSTO);
    }

    @Override
    public void calcularFrete() {
        this.valorFrete = this.preço / peso * 0.1;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preço=" + preço +
                ", preçoFinal=" + preçoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public Produto(String nome, double peso, double preço) {
        this.nome = nome;
        this.peso = peso;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getPreçoFinal() {
        return preçoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
