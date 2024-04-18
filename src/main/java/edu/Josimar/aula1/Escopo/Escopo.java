package edu.Josimar.aula1.Escopo;

public class Escopo {
    int n1 = 5;

    public int[] somar(){
        int n2 = 7;
        int resultado = n1 + n2;
        int [] resultados = {resultado, n2};
        return resultados;
    }

    public void subtrair(){
        int[] resultados = somar();
        int resultadoSoma = resultados[0];
        int n2 = resultados[1];
        int resultadoSubtrair = n1 - n2;
        System.out.println(resultadoSubtrair);
    }

    public static void main(String[] args) {
        Escopo escopo = new Escopo();
        int[] resultados = escopo.somar();
        int resultadoSoma = resultados[0];
        System.out.println(resultadoSoma);
        escopo.subtrair();
    }
}
