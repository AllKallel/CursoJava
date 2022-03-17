package br.com.cursojava.javacore.Qwrappers.test;
/**
 *
 */
public class WrappersTest {
    public static void main(String[] args) {

        //Tipos primitivos -------------------------------------------------------------
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 1;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'A';

        boolean booleanPrimitivo = true;
        //wrappers----------------------------------------------------------------------
        Byte byteWrapper =1;
        Short shortWrapper = 1;
        Integer integerWrapper = new Integer("1");
        Long longWrapper = Long.valueOf("10");
        Double DoubleWapper = 10D;
        Character characterWrapper = 'A';
        Boolean BooleanWrapper = true;

        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isDigit('.'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('u'));
    }

}
