package edu.Josimar.aula3.Estrutura_Repeticao.While;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
       double mesada = 50.0;
       DecimalFormat formato = new DecimalFormat("#.##");
       double[] somaDoces = new double[20];
       int index = 0;
       double valorTotalDoces = 0;

       while (mesada > 0) {
           double valorDoce = valorAleatorio();
           String valorDoceFormatado = formato.format(valorDoce);

           if (valorDoce <= mesada) {
               System.out.println("Doce do valor: " + valorDoceFormatado + " Adicionado no carrinho");
               mesada = mesada - valorDoce;
               somaDoces[index] = valorDoce;
               index ++;
           }
           else
               break;
       }

       for (int i = 0; i < somaDoces.length; i++) {
           double soma = somaDoces[i] + somaDoces[index + 1];
           valorTotalDoces = valorTotalDoces + soma;
       }

       System.out.println("Joãonzinho gastou: " + formato.format(valorTotalDoces) + " em Doces e restou para ele R$: " + formato.format(mesada));

    }

    //método valor aleatório
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
