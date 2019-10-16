package br.com.cursojava.introducao.controlefluxo;

public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        // Crie um Switch que dado um valor de 1 a 7
        //considerando 1 domingo, imprima se é dia util ou domingo.

        byte dia = 2;
        switch(dia){
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Segunda");
                break;
            case 3:
                System.out.print("Terça");
                break;
            case 4:
                System.out.print("Quarta");
                break;
            case 5:
                System.out.print("Quinta");
                break;
            case 6:
                System.out.print("Sexta");
                break;
            case 7:
                System.out.print("Sábado");
                break;
        }
        if(dia != 1 && dia != 7){
            System.out.println(" é dia útil");
        }else{
            System.out.println(" é final de semana");
        }
    }
}
