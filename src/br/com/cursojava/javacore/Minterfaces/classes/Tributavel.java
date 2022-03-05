package br.com.cursojava.javacore.Minterfaces.classes;
/**
 * Aula 62: Interfaces pt 01
 */
public interface Tributavel {
    public static final double IMPOSTO = 0.2;

    public abstract void calculaImposto();
    //removendo ounão o public abstract, o metodo é considerado public abstract.
}
