package edu.Josimar.aula1.Operadores;

import java.util.Date;

public class Operadores {
    String nome = "JOSIMAR";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorSangue = true;
    Date dataNascimento = new Date();

    //operações
    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + ((double) 20 / 4);

    /* concatenar strings */
    String nomeCompleto = nome + " " + "Silva";


    public static void main(String[] args) {
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        /* incrementar números */
        numero  = numero + 7;
        System.out.println(numero);
        numero = 5;
        System.out.println(--numero);

        //negação de verdadeiro ou falso

        boolean variavel = true;
        System.out.println(variavel);
        // nega-se utilizando exclamação, lembrando que estou só imprimindo não alterando a variável em si.
        System.out.println(!variavel);

        Operadores operadores = new Operadores();
        System.out.println(operadores.resultado);
        System.out.println(operadores.nomeCompleto);

        // operador ternário
        int a, b;
        String resultado1 = "";
        a = 5;
        b = 6;

//        if(a==b)
//            resultado1 = "verdadeiro";
//        else
//            resultado1 = "falso";

        resultado1 = a==b ? "verdadeiro" : "falso";  //simplificado

        System.out.println(resultado1);

        //tabela verdade
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma condições é verdadeiras");
        }
        System.out.println("Fim");
    }

}
