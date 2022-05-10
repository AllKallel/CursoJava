package br.com.cursojava.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilesAttributesTest {
    Path path = Paths.get("/home/allan/dev/arquivo.txt");                               //pegando a pasta
    PosixFileAttributes posix;                                                                  //criando o objeto

    {
        try {
            posix = Files.readAttributes(path, PosixFileAttributes.class);                      //lendo as permisões da pasta com o objeto
            System.out.println(posix.permissions());
            System.out.println("Alterando as permissões");
            Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw");
            Files.setPosixFilePermissions(path, permissions);
            posix = Files.readAttributes(path, PosixFileAttributes.class);
            System.out.println(posix.permissions());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
