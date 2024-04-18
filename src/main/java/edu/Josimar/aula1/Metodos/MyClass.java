package edu.Josimar.aula1.Metodos;

public class MyClass {
    public double somar (int n1, int n2) {
        return n1 + n2;
    }

    public void imprimir(String texto){
        //logica - finalidade do método
        //aqui não precisa do RETURN pois não será retornado nehum resultado
    }
    //theows Exception : indica que o metodo ao ser utilizado poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws ArithmeticException{
        System.out.println("Não pode dividir numero por zero");
        return 0;
    }
    // este método não pode ser visto por outras classes no
    private void metodoPrivado(){}

    // alguns equívocos estruturais
    public void validar (){} //este método deveria retornar um valor no caso boolean (tru ou false
}
