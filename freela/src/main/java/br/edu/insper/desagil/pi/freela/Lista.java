package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    List<String> tarefas = new ArrayList<>();

    public void lertarefa (String tarefa) {
        if (tarefas.contains(tarefa)) {
        }
        else {
            tarefas.add(tarefa);
        }
    }
}
