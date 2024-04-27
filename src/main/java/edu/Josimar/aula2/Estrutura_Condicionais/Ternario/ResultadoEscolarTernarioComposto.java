package edu.Josimar.aula2.Estrutura_Condicionais.Ternario;
/* Simulador de media de aluno para usar a estrutura condicional Ternário Composto*/
public class ResultadoEscolarTernarioComposto {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        String resultado = media >= 7 ? "Aprovado!" : "Reprovado!";

        System.out.println(resultado);
    }
}
