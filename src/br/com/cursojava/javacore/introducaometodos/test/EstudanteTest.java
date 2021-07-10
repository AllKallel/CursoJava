package br.com.cursojava.javacore.introducaometodos.test;

import br.com.cursojava.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Kallel";
        estudante.notas = new double[]{3, 3, 7};
        estudante.idade = 17;

        estudante.imprimirDados();
        estudante.mediaAluno();


    }
}
