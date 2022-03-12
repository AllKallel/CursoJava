package br.com.cursojava.javacore.Oexception.chekedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        abrirArquivo();
    }
    public static void criarArquivo() throws IOException {
        File file = new File("test");
        try{
            System.out.println("Arquivo criado? : " + file.createNewFile());
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static String abrirArquivo(){
        try{
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            //throw new Exception();
            System.out.println("Ecrevendo no arquivo");
            return "Valor";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("fechando o arquivo");
        }
        return null;
    }
}