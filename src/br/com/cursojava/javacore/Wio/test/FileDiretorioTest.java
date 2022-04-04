package br.com.cursojava.javacore.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
//        /*criando um diretótio*/
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir(); //criar um diretório
//        System.out.println("diretório criado? " + mkdir);
//
//        /*criando um arquivo dentro do diretório*/
//        File arquivo = new File(diretorio,"arquivo.txt");
//        System.out.println("Aquivo criado? " + arquivo.createNewFile());
//
//        /*Renomeado um arquivo */
//        File arquivoNovoNome = new File(diretorio, "arquivo renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Renomeado? " + renamed);
//
//        /*Renomeado um diretótio*/
//        File diretorioRenomedo = new File("Folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomedo);
//        System.out.println("Diretório renomeado?" + diretorioRenamed);

        buscarArquivos();
    }

    public static void buscarArquivos(){
        File file = new File("C:\\Users\\allan\\Documents\\CursoJava");
        String[] list = file.list();
        for (String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
