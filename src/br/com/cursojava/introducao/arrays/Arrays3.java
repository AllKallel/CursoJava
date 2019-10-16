package br.com.cursojava.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; //forma básica de se criar um array;
        int[] numeros2 = {1,2,3,4,5}; // array criado e já inicialido com os valores.
        // tamanho 5, index = 4 /  tamanho é definifo de acordo com a quantidade dentro das chaves;
        int[]numeros3 = new int[]{1,2,3,4,5};

        //for (int i = 0; i<numeros2.length; i++){
        //    System.out.println(numeros2[i]);
        //}
        for(int aux : numeros2){
            //nesse caso, a cada iteração o valor é guardado na variável aux que precisa ser do mesmo tipo do array
            //nesse cado, diferente do for tradicional, a variável precisa ser declarada dento dos parenteses
            System.out.println(aux);
        }
    }
}
