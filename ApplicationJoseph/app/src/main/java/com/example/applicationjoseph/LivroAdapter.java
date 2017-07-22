package com.example.applicationjoseph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by josep on 25/06/2017.
 */

public class LivroAdapter extends ArrayAdapter<Livro>
{


    private final Context context;
    private final List<Livro> elementos;

    public LivroAdapter(Context context, List<Livro> elementos)
    {
        super(context, R.layout.layoutrealm, elementos);
        this.context= context;
        this.elementos= elementos;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layoutrealm, parent, false);
        TextView nome  = (TextView) rowView.findViewById(R.id.txtNomeRealm);
        TextView autor = (TextView) rowView.findViewById(R.id.txtAutorRealm);
        TextView ano = (TextView) rowView.findViewById(R.id.txtAnoRealm);

        nome.setText(elementos.get(position).getNome());
        autor.setText(elementos.get(position).getAutor());
        ano.setText(Integer.toString(elementos.get(position).getAno()));
        return rowView;
    }



//    private final Context context;
//    private final ArrayList<Livro> elementos;
//    public LivroAdapter(Context context, ArrayList<Livro> elementos)
//    {
//        super(context, R.layout.linhalayoutlistsql, elementos);
//        this.context= context;
//        this.elementos= elementos;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        LayoutInflater inflater = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View rowView = inflater.inflate(R.layout.linhalayoutlistsql, parent, false);
//        TextView nome  = (TextView) rowView.findViewById(R.id.txtNome);
//        TextView autor = (TextView) rowView.findViewById(R.id.txtAutor);
//        TextView ano = (TextView) rowView.findViewById(R.id.txtAno);
//
//        nome.setText(elementos.get(position).getNome());
//        autor.setText(elementos.get(position).getAutor());
//        ano.setText(Integer.toString(elementos.get(position).getAno()));
//        return rowView;
//    }
}
