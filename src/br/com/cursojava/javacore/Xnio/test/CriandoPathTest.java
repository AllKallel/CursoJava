package br.com.cursojava.javacore.Xnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) {
        //C:\Users\allan\Documents\CursoJava\Folder2
        /** PATH aceita formas direntes de escrita das URL's*/

        Path p1 = Paths.get("C:\\Users\\allan\\Documents\\CursoJava\\Folder2","arquivo.txt");
        Path p2 = Paths.get("C:","\\Users\\allan\\Documents\\CursoJava\\Folder2","arquivo.txt");
        Path p3 = Paths.get("C:","Users","allan","Documents","CursoJava","older2","arquivo.txt");

        System.out.println(p3.toAbsolutePath()); //mostrando o caminho absoluto do arquivo

        File file = p3.toFile();        //transformando Path para File
        Path path = file.toPath();      //vice e versa

        /** Criando uma pasta com Files */

        Path path1 = Paths.get("test.txt");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpast\\file.txt");
        Path arquivo = Paths.get("pasta\\subpasta\\file.txt");
        try {
//            if(Files.exists(path1))
//            Files.createDirectory(path1);           //criando diretório na raiz

            if(Files.notExists(path2.getParent()))      //.getParent() retorna somente os diretórios
                Files.createDirectories(path2);         //Criando vários diretórios
            if(Files.notExists(arquivo))
                Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** Pegando um arquivo e movendo para outro lugar e com outro nome */

        Path source = Paths.get("Folder2\\arquivo.txt");
        Path target = Paths.get(path2.toString()+"\\copy.txt");

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);    //copia e substitui se já existir.
            Files.deleteIfExists(target);                                       //deleta se o arquivo existir
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
