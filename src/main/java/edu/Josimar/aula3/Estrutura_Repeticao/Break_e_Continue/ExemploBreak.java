package edu.Josimar.aula3.Estrutura_Repeticao.Break_e_Continue;


public class ExemploBreak {
    public static void main(String[] args) {
        for (int valor = 0; valor <= 5; valor ++)
            if (valor == 4) {
                System.out.println("Valor chegou no numero desejado saindo..... obrigado");
                break;
            }
            else
                System.out.println(valor);
    }
}
