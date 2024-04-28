package edu.Josimar.aula3.Estrutura_Repeticao.Break_e_Continue;

public class ExemploContinue {
    public static void main(String[] args) {
        int[] par = new int[50];
        int index = 0;

        for (int x = 1; x <= 100; x++){
            if (x % 2 != 0) {
                continue;
            }
            else {
                par[index] = x;
                index++;
            }
        }

        System.out.println("Números pares de 1 a 100");

        for (int i = 0; i < par.length; i++){
            System.out.print(par[i] + " ");
        }
    }
}
