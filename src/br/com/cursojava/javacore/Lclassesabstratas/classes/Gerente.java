package br.com.cursojava.javacore.Lclassesabstratas.classes;
/**
 *Aula 60: Classes abstratas pt 01
 */
public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String clt, Double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario += (salario * 0.1);
    }

    @Override
    public void imprime() {
        System.out.println("Dento da classe GERENTE");
    }
}
