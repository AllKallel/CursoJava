package br.com.cursojava.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        //Array bidimenciol;

        int[][] dias = new int[2][2];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 3;
        dias[1][1] = 4;

        //para fazer a leitura desse array são necessários dois for's.
        for (int i = 0; i<dias.length; i++){
            System.out.println(dias[i]+" Array "+i);
            for (int ii = 0; ii<dias[i].length; ii++){
                System.out.println(dias[i][ii]);
            }
        }
        System.out.println("--------------------------------------------------------------");

        for(int[] ref : dias){
            //guarda a referencia do array
            for (int dia : ref){
                //faz as iterações no arrei referenciado
                System.out.println(dia);
            }
        }

    }
}
