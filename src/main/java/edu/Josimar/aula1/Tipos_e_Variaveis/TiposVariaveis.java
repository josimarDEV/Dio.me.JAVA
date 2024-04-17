package edu.Josimar.aula1.Tipos_e_Variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salario = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // constante valor que não pode ser mudado

        int numero = 5; // variável que pode ser alterado
        final double PI = 3.14; // valor que nao pode ser alterado
        numero = 10;

        System.out.println(numero);
        System.out.print(PI);
    }
}
