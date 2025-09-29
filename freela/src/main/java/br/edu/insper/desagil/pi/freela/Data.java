package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data {

    Map<Integer, Integer> limite = new HashMap<>();
    private int mes;
    private int ano;
    private int dia;

    public void setLimite(Map<Integer, Integer> limite) {
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public int getAno() {
        return 1970;
    }

    public int getDia() {
        return 1;
    }

    public int getMes() {
        return 1;
    }

    public void data (int mes, int ano, int dia) {
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;

        if (getAno() < ano) {
            if (ano < 2070) {
                Momento.ajusta(1970, 2070, ano);
            }
        }

        if (getMes() < mes) {
            if (mes < 12) {
                Momento.ajusta(1,12, mes);
            }
        }

        if (getDia() < dia) {
            if (dia < limite.get(mes)) {
                Momento.ajusta(1, limite.get(mes), dia);
            }
        }
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
