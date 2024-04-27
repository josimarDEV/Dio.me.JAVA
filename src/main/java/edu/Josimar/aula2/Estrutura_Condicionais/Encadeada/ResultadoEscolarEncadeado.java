package edu.Josimar.aula2.Estrutura_Condicionais.Encadeada;

/* Simulador de media de aluno para usar a estrutura condicional Encadeada*/
public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 6;
        double media = (nota1 + nota2) / 2;

        if (media >= 7)
            System.out.println("Aprovado!" + " Média: "+ media);
        else if (media >= 5 && media < 7)
            System.out.println("Recuperação!" + " Média: "+ media);
        else
            System.out.println("Reprovado!" + " Média: "+ media);
    }
}
