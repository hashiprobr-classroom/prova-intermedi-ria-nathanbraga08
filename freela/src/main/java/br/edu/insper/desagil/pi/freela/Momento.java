package br.edu.insper.desagil.pi.freela;

public class Momento {
    private static int saida;

    public static void ajusta(int min, int max, int value) {
        if (value > max) {
            saida = max;
        }
        if (value < min) {
            saida = min;
        }
        else {
            saida = value;
        }
    }

    public int devolveinteiro() {
        return saida;
    }
}
