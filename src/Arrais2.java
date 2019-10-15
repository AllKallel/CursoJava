public class Arrais2 {
    public static void main(String[] args) {
        //byte, short, int, long, float double = 0;
        //char = \u0000 representação de espaço em branco
        //boolean = false
        //references = null
        String[] nome = new String[3];

            nome[0] = "kallel";
            nome[1] = "sara";
            nome[2] = "allan";

            for (int i = 0; i<nome.length;i++){
                //length mostra o tamanho do array
                System.out.println(nome[i]);
            }
    }
}
