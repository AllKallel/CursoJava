package br.com.cursojava.javacore.Lclassesabstratas.test;
import br.com.cursojava.javacore.Lclassesabstratas.classes.Gerente;
import br.com.cursojava.javacore.Lclassesabstratas.classes.Vendedor;
/**
 *Aula 60: Classes abstratas pt 01
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Kallel", "29212", 3.000, 100.0);
        Gerente g =new Gerente("allan", "300812", 5.000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(v);
        System.out.println(g);

    }
}
