package br.com.cursojava.javacore.Oexception.chekedexception.test;

import br.com.cursojava.javacore.Oexception.customexception.classes.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {

    }

    private static void logar() throws LoginInvalidoException{
        String usuarioBancoDeDados = "Goku";
        String senhaBandoDeDados = "123";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "111";

        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBandoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
