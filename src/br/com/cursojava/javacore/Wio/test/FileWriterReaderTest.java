package br.com.cursojava.javacore.Wio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        //using try with resources
        try(FileWriter wr = new FileWriter(file);FileReader fr = new FileReader(file)){

            wr.write("Escrevendo algo \nE pulando uma linha 2");
            wr.flush(); //trazer tudo
            wr.close();


            char[] in = new char[200];
            int size = fr.read(in);
            System.out.println("tamanho: " + size);
            for(char c: in){
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//       try {
////            FileWriter wr = new FileWriter(file, true); //,true (virgula / append) - continuar de onde parou. Por padrão
////                                                    // é false.
////            wr.write("Escrevendo algo \nE pulando uma linha 2");
////            wr.flush(); //trazer tudo
////            wr.close();
////
////            FileReader fr = new FileReader(file);
////            char[] in = new char[200];
////            int size = fr.read(in);
////            System.out.println("tamanho: " + size);
////            for(char c: in){
////                System.out.print(c);
////            }
////            fr.close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
    }
}
