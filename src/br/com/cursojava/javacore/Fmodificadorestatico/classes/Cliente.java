package br.com.cursojava.javacore.Fmodificadorestatico.classes;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Cliente {
    //0 - Primeiro é executado o bloco de inicialização estático quando a JVM carrega a classe
    //1 - Alocado espaço na memória para objeto que será criado
    //2 - Cada objeto de classe é criado e inicializado com seus valores default ou valores explicitos
    //3 - O bloco de inicialização é executado
    //4 - Construtor é executado

    private static int[] parcelas;

    //BLOCO DE INICIALIZAÇÃO ESTÁTICO
    static {
        System.out.println("Dentro do bloco de inicialização");

        parcelas = new int[100];
        for (int i = 1; i <= 100; i++) {

            Cliente.parcelas[i - 1] = i;
        }
    }

    //CONTRUCTOR
    public Cliente() {
    }

    //GETTTER AND SETTERS
    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
    public void imprime(){
        for (int num : parcelas) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
