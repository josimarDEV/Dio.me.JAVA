package edu.Josimar.aula1.Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada : " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada : " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentando Volume... seu Novo volume é : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuindo Volume... seu novo volume é : " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Aumentando canal... Seu novo canal é : " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Diminuindo canal... seu novo canal é : " + smartTv.canal);

        smartTv.escolhaCanal(20);
        System.out.println("Seu novo canal é : " + smartTv.canal);
    }
}
