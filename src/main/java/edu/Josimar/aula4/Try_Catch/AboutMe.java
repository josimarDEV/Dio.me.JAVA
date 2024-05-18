package edu.Josimar.aula4.Try_Catch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main (String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            /* mostrando as informações digitadas pelo usuário */
            System.out.println("Seu nome é: " + nome + " " + sobrenome);
            System.out.println("Sua idade é: " + idade + " anos \n" + "Sua altura é: " + altura + " metros");
        }
        catch (InputMismatchException e) {
            System.err.println("O campo idade e altura precisa ser numérico!");
        }
    }
}
