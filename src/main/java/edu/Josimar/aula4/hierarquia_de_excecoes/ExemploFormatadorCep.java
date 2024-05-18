package edu.Josimar.aula4.hierarquia_de_excecoes;

import java.awt.*;
import java.util.List;

public class ExemploFormatadorCep {
    public static void main(String[] args) {
        try {
            String cep = "29560000";
            String cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("CEP!! deverá conter apenas número e deverá conter 8 dígitos.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();
        else {
            String apenasNumero = cep.replaceAll("\\D", "");
            apenasNumero = apenasNumero.replaceAll("(\\d{5})(\\d{3})", "$1-$2");
            //retornando o cep formatado
            return apenasNumero;
        }
    }
}
