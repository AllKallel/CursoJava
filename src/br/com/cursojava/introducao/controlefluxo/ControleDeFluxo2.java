package br.com.cursojava.introducao.controlefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        //operadores ternarios.
        // é representado pelo sinal de interrogação

        int idade = 17;
        String status;
        if (idade < 18) {
            status = "Não Adulto";
        } else {
            status = "Adulto";
        }
        System.out.println(status);

        //MESMO EXEMPLO FEITO COM OPERADOR TERNÁRIO
        status = idade <= 18 ? "Não adulto" : "Adulto";
        System.out.println(status);

        //EXEMPLO DE QUE NÃO SE DEVE USAR UM OPERADOR TERNÁRIO COM MAIS DE DUAS INSTRUÇÕES, POIS VAI FICANDO COMPLICADO

        //idade < 15 categoria infantil
        //idade <= 15 && idade < 18 categoria juvenil
        //idade > 18 adulto
        status = idade < 15 ? "Infantil" : idade >= 15 && idade > 18 ? "Juvenil" : "Adulto";
    }


}
