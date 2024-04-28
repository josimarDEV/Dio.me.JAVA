package edu.Josimar.aula3.Estrutura_Repeticao.For_em_Arrays;

public class ExemploForEach {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
