package br.com.cursojava.introducao.controlefluxo;

public class ControleDeFluxo6 {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado.
        //O valor da parcela não pode ser menor que 1000.
        double valorCarro = 30000;
        for(int parcela = (int) valorCarro; parcela>=1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela<1000){
                //o continue ignora o que vem após ele e pula para a próxima iteração
                continue;
            }
            System.out.println(parcela+" parcelas R$"+valorParcela);
        }
    }
}
