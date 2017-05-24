package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.id;

public class TelaListViewCustomizado extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_list_view_customizado);

        ListView lista = (ListView) findViewById(R.id.lvEscolas);
        final ArrayList<Escola> escolas = adicionarEscolas();
        ArrayAdapter adapter = new EscolaAdapter(this, escolas);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> AdapterView, View view, int position, long id)
            {
                //Toast.makeText(getBaseContext(), "Escola :" , Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Escola :" + escolas.get(position).getNome(), Toast.LENGTH_LONG).show();

                // passar como parâmetro para outra activity

                Intent PassarParâmetro = new Intent(TelaListViewCustomizado.this, TelaMenu.class);
                PassarParâmetro.putExtra("nome", escolas.get(position).getNome());
                startActivity(PassarParâmetro);


            }


        });


    }





    private ArrayList<Escola> adicionarEscolas()
    {
        ArrayList<Escola> escolas = new ArrayList<Escola>();
        Escola e = new  Escola("Colégio Estadual Atheneu Sergipense",
                "Rua Pacatuba S/N", R.drawable.joseph2);
                escolas.add(e);
                e = new Escola("Escola Estadual General Siqueira",
                "Rua Sergipe S/N", R.drawable.joseph);
                escolas.add(e);
                e = new Escola("Escola Tobias Barreto",
                "Av. OtonielDórea", R.drawable.joseph2);
                escolas.add(e);
                e = new Escola("ColegioEstadual Prof GRollembergLeite",
                "R. Franklin de Campos Sobral, 1675", R.drawable.joseph);


        escolas.add(e);
        e = new Escola("Escola Estadual General Siqueira",
                "Rua Sergipe S/N", R.drawable.joseph);
        escolas.add(e);
        e = new Escola("Escola Tobias Barreto",
                "Av. OtonielDórea", R.drawable.joseph2);
        escolas.add(e);
        e = new Escola("ColegioEstadual Prof GRollembergLeite",
                "R. Franklin de Campos Sobral, 1675", R.drawable.joseph);
                escolas.add(e);
                return escolas;

    }
}
