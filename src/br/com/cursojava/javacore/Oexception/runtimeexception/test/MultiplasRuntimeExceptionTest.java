package br.com.cursojava.javacore.Oexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundExcep");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        //-----------------------------------------------------------------------------------------
        //multi-catch
        try {
            talvezLanceException();
        }catch (SQLException | IOException e){
            System.out.println("Dentro do SQLException");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        throw new SQLException();
    }
}
