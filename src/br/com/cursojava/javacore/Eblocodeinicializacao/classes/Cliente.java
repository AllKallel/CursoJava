package br.com.cursojava.javacore.Eblocodeinicializacao.classes;

public class Cliente {

    //1 - Alocado espaço na memória para objeto que será criado
    //2 - Cada objeto de classe é criado e inicializado com seus valores default ou valores explicitos
    //3 - O bloco de inicialização é executado
    //4 - Construtor é executado

    private int[] parcelas;

    //BLOCO DE INICIALIZAÇÃO
    {
        System.out.println("Dentro do bloco de inicialização");

        parcelas = new int[100];
        for(int i=1 ; i <= 100 ; i++){

            this.parcelas [i-1] = i;
        }
        for( int num : parcelas){
            System.out.println(num);
        }
    }

    //CONTRUCTOR
    public Cliente(){

        System.out.println("Dentro do construtor");
    }

    //GETTTER AND SETTERS
    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
