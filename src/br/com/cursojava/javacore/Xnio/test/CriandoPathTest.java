package br.com.cursojava.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
    public static void main(String[] args) {
        //C:\Users\allan\Documents\CursoJava\Folder2
        /** PATH aceita formas direntes de escrita das URL's*/

        Path p1 = Paths.get("C:\\Users\\allan\\Documents\\CursoJava\\Folder2","arquivo.txt");
        Path p2 = Paths.get("C:","\\Users\\allan\\Documents\\CursoJava\\Folder2","arquivo.txt");
        Path p3 = Paths.get("C:","Users","allan","Documents","CursoJava","older2","arquivo.txt");
    }
}
