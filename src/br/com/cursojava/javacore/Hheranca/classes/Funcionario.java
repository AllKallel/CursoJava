package br.com.cursojava.javacore.Hheranca.classes;

public class Funcionario extends Pessoa{

    private String salario;

    //Sobrescrita de metodo;
    public void print(){
        super.print();
        System.out.println("Salario: R$" + this.salario);
    }

    //imprime comprovante
    public void imprimeComprovantePagamento(){
        System.out.println("Eu " + super.nome + " recebi pagamento no valor de R$" + this.salario);
    }

    //getters and setters
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

}
