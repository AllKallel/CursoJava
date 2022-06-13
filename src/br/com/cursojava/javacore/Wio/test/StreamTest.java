package br.com.cursojava.javacore.Wio.test;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) {
        gravador();
    }

    private static void gravador() {
        byte[] dados = {29, 12, 17, 30, 8, 92};

       /*try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) { //cria arquivo altomaticamente
            for(Byte b : dados{
                gravador.write(b);
            }
        }*/

        try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) { //cria arquivo altomaticamente
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**GRAVADOR TUNADO USANDO A CLASSE BUFFER*/
    private static void gravadorTunado() {
        byte[] dados = {29, 12, 17, 30, 8, 92};
        try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"),4098)) {
            gravadorBuffer.write(dados);
            gravadorBuffer.flush();
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitor() {
        try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
            int leitura;
            while ((leitura = leitor.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorTunado() {
        try (BufferedInputStream leitorTunado = new BufferedInputStream(new FileInputStream("pasta/stream.txt"),4098)) {
            int leitura;
            while ((leitura = leitorTunado.read()) != -1) {
                byte b = (byte) leitura;
               System.out.println(" " + b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
