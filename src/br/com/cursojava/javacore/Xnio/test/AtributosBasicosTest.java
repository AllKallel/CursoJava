package br.com.cursojava.javacore.Xnio.test;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {
    public static void main(String[] args) throws IOException {

        /** ALTERANDO A DATA DA ULTIMA MODIFICAÇÃO DE UM ARQUIVO - IO */
        Date primeiroDeDezembro = new GregorianCalendar(2017, Calendar.DECEMBER, 29).getTime();
        File file = new File("Folder2\\arquivo2.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());    //setando a ultima data de modificação do arquivo.
        System.out.println(file.lastModified());
        file.delete();

        /** ALTERANDO A DATA DA ULTIMA MODIFICAÇÃO DE UM ARQUIVO - NIO */
        Path path = Paths.get("Folder2\\arquivo2.txt");
        Files.createFile(path);
        FileTime time = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, time);                  //setando data de modificação
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);


        /**-----------------------------------------------------------------------------------------------------------*/


        //BasicFileAttribute, PosixFileAttribute, DosFileAttribute
        /** VERIFICAÇÕES BÁSICAS DE LEITURA, EXECUÇÃO E ESCRITA */
        Path path1 = Paths.get("src\\br\\com\\cursojava\\javacore\\Aintroducaoclasses\\classes\\Carro.java");
        System.out.println("É executável?: " + Files.isExecutable(path1));
        System.out.println("É legivel?: " + Files.isReadable(path1));
        System.out.println("Posso escrever?: " + Files.isWritable(path1));

        /** ATRIBUTOS BÁSICOS DOS SISTEMAS*/
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path1, BasicFileAttributes.class);
        System.out.println("Create: " + basicFileAttributes.creationTime());
        System.out.println("Last Access: " + basicFileAttributes.lastAccessTime());
        System.out.println("Last Modified: " + basicFileAttributes.lastModifiedTime());
//        System.out.println("It's a directory: " + basicFileAttributes.isDirectory());
//        System.out.println("It's a symbolicLink: " + basicFileAttributes.isSymbolicLink());
//        System.out.println("It's a regular file: " + basicFileAttributes.isRegularFile());

        System.out.println("_____________________________________________________________________________________");


        /**-----------------------------------------------------------------------------------------------------------*/


        //BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView, FileOwnerAttributeView, AclFileAttributeView
        /** ATRIBUTOS BÁSICOS DOS SISTEMAS - EFETUANDO ALTERAÇÕES */
        FileTime lastModified = basicFileAttributes.lastModifiedTime();
        FileTime created = basicFileAttributes.creationTime();
        FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis());

        BasicFileAttributeView basicView = Files.getFileAttributeView(path1, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAccess, created);
        basicFileAttributes = Files.readAttributes(path1, BasicFileAttributes.class);    //lendo novamente os atributos
        System.out.println("Create: " + basicView.readAttributes().creationTime());
        System.out.println("Last Access: " + basicView.readAttributes().lastAccessTime());
        System.out.println("Last Modified: " + basicView.readAttributes().lastModifiedTime());
    }
}
