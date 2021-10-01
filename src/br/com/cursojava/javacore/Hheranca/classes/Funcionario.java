package br.com.cursojava.javacore.Hheranca.classes;

public class Funcionario extends Pessoa{

    private String salario;

    {
        System.out.println("Bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Bloco de inicialização de funcionário 2");
    }
    static {
        System.out.println("Bloco de inicialização stático de funcionário 1");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

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
