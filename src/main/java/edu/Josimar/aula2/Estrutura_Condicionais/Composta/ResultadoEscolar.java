package edu.Josimar.aula2.Estrutura_Condicionais.Composta;
/* Simulador de media de aluno para usar a estrutura condicional Composta*/
public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;

        if (media < 7)
            System.out.println("Reprovado!");
        else
            System.out.println("Aprovado!");
    }
}
