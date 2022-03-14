package br.com.cursojava.javacore.Oexception.customexception.classes;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException(){
        super("Usuário e senha invalidos");
    }
}
