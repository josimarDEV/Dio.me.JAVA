package edu.Josimar.aula3.Estrutura_Repeticao.For_em_Arrays;

public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x =0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);
        }
    }
}
