public class ControleDeFluxo3 {
    public static void main(String[] args) {
        // tipos aceitos por um switch
        // byte, int, char, short, enum e String

        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        String sexo = "f";

            switch (sexo){
                case "f":
                    System.out.println("feminino");
                    break;
                case "m":
                    System.out.println("masculino");
                    break;
                default:
                    System.out.println("Opção inválida");
            }



        }
    }

