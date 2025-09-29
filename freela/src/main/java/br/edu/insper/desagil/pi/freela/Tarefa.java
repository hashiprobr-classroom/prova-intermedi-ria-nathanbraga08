package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int Set;
    int identificador = Set;

    public void setSet(int set) {
        Set = set;
    }
    private String descricao = "";

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String inicio = null;

    private String fim = null;

    public String getInicio() {
        return inicio;
    }

    public String getFim() {
        return fim;
    }

    public void atualiza (String inicio, String fim) {

    }
}
