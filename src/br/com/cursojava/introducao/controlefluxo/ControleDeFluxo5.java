package br.com.cursojava.introducao.controlefluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado.
        //O valor da parcela não pode ser menor que 1000.
        double valorCarro = 30000;
        int minimo = 1000;

        for (int parcela = 1; parcela < valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela < minimo){
                break;
            }
            System.out.println(parcela+"x"+valorParcela);
        }
    }
}
