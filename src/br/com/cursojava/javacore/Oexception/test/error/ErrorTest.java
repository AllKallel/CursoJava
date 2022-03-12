package br.com.cursojava.javacore.Oexception.test.error;

public class ErrorTest {
    public static void main(String[] args) {
        stackOverFlowError();
    }
    public static void stackOverFlowError(){
        stackOverFlowError();
    }
}
