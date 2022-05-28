package br.com.cursojava.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTest extends SimpleFileVisitor<Path>{
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java, class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
       if(matcher.matches(file)){
           System.out.println(file.getFileName());
       }
       return FileVisitResult.CONTINUE;
    }
}

public class PathMacherTest {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/subpasta/subsubpast/file.bkp");
        Path path2 = Paths.get("file.bkp");
        Path path3 = Paths.get("allan ramos");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
        System.out.println("_________________________________________________________________________________________");

        matches(path1, "glob:*.bkp");                                           //n considera barras
        matches(path1, "glob:**/*.bkp");                                        //qualquer coisa
        matches(path1, "glob:*");                                               //n considera barras
        matches(path1, "glob:**");                                              //qualquer coisa
        System.out.println("_________________________________________________________________________________________");

        /**PROCURAR ARQUIVOS QUE TENHAM ESTENÇÕES COM APENAS 3 DIGITOS*/
        matches(path1, "glob:*.???");
        matches(path1, "glob:**/*.???");
        matches(path1, "glob:**.???");
        System.out.println("_________________________________________________________________________________________");

        /**PROCURAR POR NOMES DE ARQUIVOS ESPECÍFICOS*/
        matches(path3, "glob:{allan*, ramos*}");                                //ambos os nomes
        matches(path3, "glob:{allan, ramos}*");
        matches(path3, "glob:{allan ramos}");                                  // ou um, ou outro

        /**ENCONTRANDO TODOS OS ARQUIVOS QUE Test.java ou Test.class*/
        Files.walkFileTree(Paths.get("./"), new FindAllTest());
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " : " + matcher.matches(path));
    }
}
