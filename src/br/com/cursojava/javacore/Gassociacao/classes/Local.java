package br.com.cursojava.javacore.Gassociacao.classes;

public class Local {

    private String rua;
    private String bairro;

    //constructor
    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }

    //Metodos
    public void PrintLocal(){
        System.out.println("________________________RELATORIO DE LOCAL________________________");
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
    }

    //getters and setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
