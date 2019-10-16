package br.com.cursojava.introducao.controlefluxo;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 11;
        //O bloco de codigo é execuado enquanto a condição for verdadeira.
        while(contador<10){
            System.out.println(++contador);
        }

        //o bloco de codigo é executado ao menos uma vez.
        contador = 0;
        do{
            System.out.println("Estou no do while");
        }while(contador<10);

        //no for é declarado uma variável, uma condição e o que acontece com a variável de acordo com a exec. do
        //codigo. O bloco será executado enquanto a condição for verdadeira.

        for(int i =0; i<10 ; i++){
            System.out.println("valor de contador 1 =" +i);
            if(i == 5){
                break ;
            }
        }
    }

}
