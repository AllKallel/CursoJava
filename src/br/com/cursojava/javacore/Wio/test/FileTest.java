package br.com.cursojava.javacore.Wio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
/**
 * io - file
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt"); //caso queira indicar o local onde será salvo e só
                                                        //escrever junto com o nome
        try {
            System.out.println(file.createNewFile());
            boolean exist = file.exists();
//            System.out.println("Permissão de leitura? " + file.canRead());
//            System.out.println("Path " + file.getPath());
//            System.out.println("Path absolute " + file.getAbsolutePath());
//            System.out.println("Diretorio? " + file.isDirectory());
//            System.out.println("Hidden " + file.isHidden());
//            System.out.println("last modified " + new Date(file.lastModified()));

            if(exist){
                System.out.println("Deletado? " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
