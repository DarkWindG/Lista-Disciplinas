package br.edu.unis.minhasdisciplinas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.unis.minhasdisciplinas.R;
import br.edu.unis.minhasdisciplinas.model.Disciplina;

public class ListaDisciplinasAdapter extends BaseAdapter {

    private final ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private final Context context;

    public ListaDisciplinasAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return disciplinas.size();
    }

    @Override
    public Object getItem(int position) {
        return disciplinas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return disciplinas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(this.context).inflate(R.layout.item_disciplina, parent, false);

        Disciplina tarefa = disciplinas.get(position);

        TextView txtDisciplinaId = viewCriada.findViewById(R.id.item_disciplina_background_disciplina);
        TextView txtDisciplinaTitulo = viewCriada.findViewById(R.id.item_disciplina_titulo_disciplina);
        TextView txtDisciplinaCarga = viewCriada.findViewById(R.id.item_disciplina_carga_horaria);

        txtDisciplinaId.setText("(" + tarefa.getId() + ")");
        txtDisciplinaTitulo.setText(tarefa.getTitulo());
        txtDisciplinaCarga.setText(tarefa.getCarga());

        return viewCriada;
    }
}
