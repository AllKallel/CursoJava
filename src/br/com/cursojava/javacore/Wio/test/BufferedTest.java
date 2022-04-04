package br.com.cursojava.javacore.Wio.test;
/**
 * buffered
 */

import java.io.*;

import br.com.cursojava.javacore.Wio.test.FileWriterReaderTest;

public class BufferedTest {
    public static void main(String[] args) {

        File file = new File("Arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))){

            bw.write("Ecrevendo uma linha");
            bw.newLine();
            bw.write("Escrevendo uma linha nova");
            bw.flush();

            String s = null;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Ecrevendo uma linha");
//            bw.newLine();
//            bw.write("Escrevendo uma linha nova");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while((s = br.readLine()) != null){
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
