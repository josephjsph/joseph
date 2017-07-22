package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class TelaEditarRealm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_editar_realm);

        final Realm realm = Realm.getDefaultInstance();
        Intent intente = getIntent();
        final  int id = intente.getIntExtra("ID", 0);
        final Livro livro = realm.where(Livro.class).equalTo("id", id).findFirst();

        final EditText nome = (EditText) findViewById(R.id.edtNomeRealm);
        final EditText autor = (EditText) findViewById(R.id.edtAutorRealm);
        final EditText ano = (EditText) findViewById(R.id.edtAnoRealm);
        nome.setText(livro.getNome());
        autor.setText(livro.getAutor());
        ano.setText(String.valueOf(livro.getAno()));

        Button alterar = (Button)findViewById(R.id.btnEditaRealm);
        alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realm.beginTransaction();
                livro.setNome(nome.getText().toString());
                livro.setAutor(autor.getText().toString());
                livro.setAno(Integer.parseInt(ano.getText().toString()));
                realm.copyToRealm(livro);
                realm.commitTransaction();

                Toast.makeText(getBaseContext(),"Livro alterado com Sucesso!!!!", Toast.LENGTH_LONG).show();
            }
        });

        Button remover = (Button)findViewById(R.id.btnRemoverRealm);
        remover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                realm.beginTransaction();
                livro.deleteFromRealm();
                realm.commitTransaction();

                Toast.makeText(getBaseContext(),"Livro removido com Sucesso!!!!", Toast.LENGTH_LONG).show();

            }
        });


    }
}
