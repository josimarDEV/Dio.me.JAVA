package edu.Josimar.aula1.Tipos_e_Variaveis;

public class TiposDados{
    public static void main (String[] args) {
        byte idade = 30;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo (tipo string)
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo (tipo string) precisa terminar com L maiúsculo
        float pi = 3.14f; //tipo float tem que colocar um f no final pode ser maiúsculo ou minusculo
        double salario = 1275.33;
        boolean verdadeiro = true;
        boolean falso = false;
        String nome = "Josimar";
        char letra = 'a'; // char só pode ter único caractere entre aspas simples

        System.out.printf("%d %d %d %d %.2f %.2f %b %b %s %c", ano, idade, cep, cpf, pi, salario, verdadeiro, falso, nome, letra);

    }
}