package edu.Josimar.aula1.Terminal_e_Argumentos;

import java.util.Locale;
import java.util.Scanner;

public class SobreMin {
    public static void main(String[] args) {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome =scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        /* mostrando as informações digitadas pelo usuário */
        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Sua idade é: " + idade + " anos \n" + "Sua altura é: " + altura + " metros");
    }
}
