package br.com.cursojava.javacore.introducaometodos.test;

import br.com.cursojava.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setIdade(3);
        estudante.setNome("Kallel");
        estudante.setNotas(new double[]{10,10,10});


        estudante.imprimirDados();
        estudante.mediaAluno();


    }
}
