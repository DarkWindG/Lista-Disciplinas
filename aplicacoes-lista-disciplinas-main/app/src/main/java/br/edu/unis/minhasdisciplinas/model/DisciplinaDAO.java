package br.edu.unis.minhasdisciplinas.model;

import java.util.ArrayList;

public class DisciplinaDAO {

    final static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void salvar(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public ArrayList<Disciplina> buscarTodos() {
        return new ArrayList<>(disciplinas);
    }

    public Disciplina buscarDisciplinaPeloId(Disciplina disciplina) {
        for (Disciplina d : disciplinas) {
            if (d.getId() == disciplinas.getId())//não consegui resolver {
                return d;
            }
        }
        return null;
    }

    public void remover(Disciplina disciplina) {
        Disciplina disciplinaParaRemover = buscarDisciplinaPeloId(disciplina);

        if(disciplinaParaRemover != null) {
            disciplinas.remove(disciplinaParaRemover);
        }
    }
}
