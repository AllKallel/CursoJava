package br.com.cursojava.javacore.Lclassesabstratas.classes;
/**
 *Aula 60: Classes abstratas pt 01
 */
public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, Double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        this.salario += (salario * 0.05);
    }
}
