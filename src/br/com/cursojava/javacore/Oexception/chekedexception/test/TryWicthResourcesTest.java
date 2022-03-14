package br.com.cursojava.javacore.Oexception.chekedexception.test;

import java.io.*;

public class TryWicthResourcesTest {
    public static void main(String[] args) {

    }

    //Try-with-resources------------------------------------------------------------
    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("text.txt"))){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-------------------------------------------------------------------------------
    public static void lerArquivoOld(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
