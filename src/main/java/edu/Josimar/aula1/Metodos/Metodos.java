package edu.Josimar.aula1.Metodos;

public class Metodos {
    //exemplos
    int somar (
            int n1,
            int n2
    ) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        Metodos somar = new Metodos();
        int n1 = 2;
        int n2 = 3;
        System.out.println(somar.somar(n1, n2));
    }
}

/* exemplos sem fins */
//abriConexao() {}
//concluirProcessamento(){}
//findById(int id){}
//calcularImprimir(){} // está opeção de metodo esta errada, ela vai calcular ou vai imprimir, mesmo si for fazer as duas coisas melhor fazer separado os metodos pode ocorrer algum erro, ou até mesmo a pessoa só queira calcular e não imprimir.