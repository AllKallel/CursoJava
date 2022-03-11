package br.com.cursojava.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento para Gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario desse mes: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento para Vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salario desse mes: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mes: " + funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("Paricipação nos lucros: " + g.getPnl());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total de vendas: " + ((Vendedor)funcionario).getTotalVendas());
        }

    }
}
