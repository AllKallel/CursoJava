package br.com.cursojava.javacore.introducaometodos.classes;
/*Crie uma classe estudante com os seguintes atributos: nome, idade e notas (Tres notas). Crie um metodo para imprimir
* os dados e tirar a média desse aluno. caso a média seja maior que 6 imprimir "Aprovaso" se não, "Reprovado". */

public class Estudante {
    private String nome = "defult";
    private int idade = 0;
    private double[] notas ={0,0,0};

    //imprime os dados do aluno---------------------------------------------------------------------------------------
    public void imprimirDados(){
        System.out.println("Nome "+this.nome);
        System.out.println("Idade "+this.idade);
        //imprime array
        int count =1;
        for (double num : this.notas){
            System.out.print("Nota"+count+"= "+num+" ");
            count++;
        }
    }

    //calcula a média do aluno e no final imprime se foi aprovado ou não caso note seja maior ou inferior a 6.--------
    public void mediaAluno(){
        double soma = 0;
            for(double num : this.notas){
                soma += num;
            }
            System.out.println();//só pra descer uma linha
            System.out.println("Média = "+soma/3);
            if(soma/3 > 6){
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado. Média inferior a 6. Tente novamente ano que vem. Passar bem!");
            }
    }

    //METODOS SET----------------------------------------------------------------------------------------------------
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade (int idade){
        if(idade < 0) {
            System.out.println("Você não pode escolher uma idade menor que ZERO");
        }
            this.idade = idade;
    }

    public void setNotas (double[] notas){
       this.notas = notas;
    }

    //METODOS GET-----------------------------------------------------------------------------------------------------
    public String getNome(){
        return this.nome;
    }

    public int getIdade (){
        return this.idade;
    }

    public double[] getNotas(){
        return this.notas;
    }
}
