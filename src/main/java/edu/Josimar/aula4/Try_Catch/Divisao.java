package edu.Josimar.aula4.Try_Catch;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro valor: ");
            int a = sc.nextInt();

            System.out.println("Digite o segundo valor: ");
            int b = sc.nextInt();

            double divisao =  a / b;
            System.out.println("A / B = " + divisao);
        }
        catch (ArithmeticException e) {
            System.err.println("Erro: Inderteminação, não pode dividir por zero");
        }
    }
}
