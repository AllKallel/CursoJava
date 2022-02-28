package br.com.cursojava.javacore.Kenum.classes;
/**
 * Aula 59: Enumeração pt 03
 */
public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa fisica"), PESSOA_JURIDICA(2, "Pessoa juridica"){
        //Constant specific class body
        //Classe constante corpo especifico
        public String getId(){
            return "A";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}