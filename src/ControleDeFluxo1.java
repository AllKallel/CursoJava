public class ControleDeFluxo1 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade <= 15 && idade < 18 categoria juvenil
        //idade > 18 adulto


        int idade = 20;
        String texto;
        boolean c = false;

        if(idade < 15){
            texto = "infantil";
        }else if(idade >= 15 && idade > 18){
            texto = "juvenil";
        }else{
            texto = "adulto";
        }
        System.out.println(texto);









        if(idade > 18){
            System.out.println("entrou no bar");
        }else{
            System.out.println("não pode entrar");
        }
        if(c = true){
            System.out.println("Atribuição primeiro");
        }
        //nesse caso é feita primeira a atriuiçao e depois o if é executado.
        /*if(c == true){
            System.out.println("não funfou");
        }*/
        //nesse caso o valor é false.

    }
}

