public class Arrays6{
    public static void main(String[] args) {


        //inicialização de arrais multidimencionais
        int[] array1 = {1, 2, 3};
        int[] array2 = new int[3];
        int[] array3 = new int[]{1, 2, 3};

//        int[][] dias = new int[3][];
//        dias[0] = new int[2];
//        dias[1] = new int[]{1,2,3};
//        dias[2] = new int[4];
        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};
        //na posição [1][2] encontra-se o número 3
        for(int[] aux : dias){
            for (int num : aux){
                System.out.println(num);
            }
        }
    }
}
