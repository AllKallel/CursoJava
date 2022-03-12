package br.com.cursojava.javacore.Oexception.runtimeexception.test;

public class RunTimeExceptionTest {
    public static void main(String[] args){
        try{
            divisão(1,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void divisão (int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
