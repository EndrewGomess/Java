package ProjetoDado;

import java.util.Random;

public class Dado {
    private int numeroDado1;
    private int numeroDado2;
    
    public Dado(){
        numeroDado1 = rolarDado();
        numeroDado2 = rolarDado();
    }

    private int rolarDado(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public void imprmir(){
        System.out.println("Valor do primeiro dado: " + numeroDado1);
        System.out.println("Valor do primeiro dado: " + numeroDado2);
        int resultado = soma(numeroDado1, numeroDado2);
        System.out.println("Soma dos dados: " + resultado);
    }

    private int soma(int numeroDado1, int numeroDado2) {
        return numeroDado1 + numeroDado2;
    }
    
}
