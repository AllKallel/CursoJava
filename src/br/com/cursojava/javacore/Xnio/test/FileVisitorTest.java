package br.com.cursojava.javacore.Xnio.test;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/**classe que busca arquivos em todos os diretórios com a sobrescrita do metodo visitFile para especiálização da classe
 * para buscar apenas um tipo de aquivo*/
class AcharTodosOsBKP extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".bkp")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

/**classe que busca diretórios e subdiretórios, assim como os arquivos que estão dentro dos diretórios*/
class PrintDirs extends SimpleFileVisitor<Path>{
    //busca os diretórios
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("Pre: " + dir);
        if(dir.getFileName().toString().equals("subsubpast")){
           return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }
    //busca os arquivos
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println("file: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }
    //lança um exception caso não encontre arquivos
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException{
        return FileVisitResult.CONTINUE;
    }
    //lança um exception caso não encontre diretórios
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
        throws IOException{
        return FileVisitResult.CONTINUE;
    }
}



public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("pasta"), new PrintDirs());
    }
}

