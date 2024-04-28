package edu.Josimar.aula3.Estrutura_Repeticao.For;

public class Contandor {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 10; contador++) {
            if (contador < 10)
                System.out.print(contador + ", ");
            else
                System.out.print(contador);
        }
    }
}
