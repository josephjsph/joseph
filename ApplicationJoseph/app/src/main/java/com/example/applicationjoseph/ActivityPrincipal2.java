package com.example.applicationjoseph;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.Sort;

public class ActivityPrincipal2 extends AppCompatActivity {

//    private BDSQLiteHelper bd;
//    private ArrayList<Livro> listaLivros;
    private List<Livro> listaLivros;
    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        bd = new BDSQLiteHelper(this);
        setContentView(R.layout.activity_principal2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();







//        Livro livro = realm.where(Livro.class).findFirst();
//        List<Livro> livros = realm.where(Livro.class).findAll();
//        List<Livro> livros = realm.where(Livro.class).findAllSorted("ano", Sort.DESCENDING);

        //este comentário e da insersão do real
//        Livro livro = new Livro(10, "josephy", "dos santos", 2020);
//        realm.copyToRealm(livro);

        realm.commitTransaction();
        realm.close();
//
        Toast.makeText(getBaseContext(), "registros inseridos", Toast.LENGTH_LONG).show();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intencaoOnclcTelaTelaSqlLite = new Intent(ActivityPrincipal2.this, TelaSqlLite.class);
//                startActivity(intencaoOnclcTelaTelaSqlLite);
            }
        });
    }

    protected void onStart()
    {
        super.onStart();
        Realm realm = Realm.getDefaultInstance();
        ListView lista = (ListView) findViewById(R.id.lvLivros);
        listaLivros  = realm.where(Livro.class).findAll();
        LivroAdapter adapter = new LivroAdapter(this, listaLivros);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intentRealm = new Intent(ActivityPrincipal2.this, TelaEditarRealm.class);
                intentRealm.putExtra("ID", listaLivros.get(i).getId());
                startActivity(intentRealm);
            }
        });
    }




    public void OnClcTelaRealm (View view)
    {
        Intent intencaoTelaRealm = new Intent(getApplication(), TelaRealm.class);
        startActivity(intencaoTelaRealm);

    }

//    chamar tela shared prefences
    public void OnclcTelaSharedPreferences (View view)
    {
        Intent intencaoOnclcTelaSharedPreferences = new Intent(getApplication(), TelaSharedPreferences.class);
        startActivity(intencaoOnclcTelaSharedPreferences);

    }

    //chamar tela lista SqlLite
    public void OnClcTelaSqlLite (View view)
    {
        Intent intencaoOnclcTelaTelaSqlLite = new Intent(getApplication(), ListSqlLite.class);
        startActivity(intencaoOnclcTelaTelaSqlLite);

    }

}
