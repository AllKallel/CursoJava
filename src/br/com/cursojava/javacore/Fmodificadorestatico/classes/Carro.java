package br.com.cursojava.javacore.Fmodificadorestatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240;

    //METODO CONSTRUTOR DA CLASSE_________________________________________________________________________________
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    //GETTERS AND SETTERS_________________________________________________________________________________________
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    //METODO IMPRIMIR___________________________________________________________________________________________
    public void imprimir() {
        System.out.println("_______________________________________________");
        System.out.println("Nome = " + this.nome);
        System.out.println("Velocidade máxima = " + this.velocidadeMaxima);
        System.out.println("Velocidade limite= " + velocidadeLimite);
    }
}
