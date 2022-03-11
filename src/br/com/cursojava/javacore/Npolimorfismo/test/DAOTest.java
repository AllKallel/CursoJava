package br.com.cursojava.javacore.Npolimorfismo.test;
/**
 * Curso Java Completo - Aula 66: Polimorfismo pt 03
 */

import br.com.cursojava.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.cursojava.javacore.Npolimorfismo.classes.GenericDAO;

import java.util.LinkedList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();

        List<String> list = new LinkedList<>();
        list.add("nome1");
        list.add("nome2");
        list.add("nome3");
        list.add("nome4");

        for (String nome : list){
            System.out.println(nome);
        }
    }
}
