package br.edu.insper.desagil.pi.freela;

public class DataHorario {
    private int hour = 0;
    private int minuto = 0;
    private int data;

    public DataHorario(int data) {
        this.data = data;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }


    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void datahora (int hour, int minuto) {
        this.hour = hour;
        this.minuto = minuto;
        if (getHour() < hour) {
            if (hour < 23) {
                Momento.ajusta(0,23, hour);
            }
        }
        if (getMinuto() < minuto) {
            if (minuto < 59) {
                Momento.ajusta(0,59,minuto);
            }
        }
    }
}
