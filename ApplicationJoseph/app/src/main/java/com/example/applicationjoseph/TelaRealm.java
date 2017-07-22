package com.example.applicationjoseph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class TelaRealm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_realm);

        final Realm realm = Realm.getDefaultInstance();

        final EditText nome = (EditText) findViewById(R.id.edtNomeRealm);
        final EditText autor = (EditText) findViewById(R.id.edtAutorRealm);
        final EditText ano = (EditText) findViewById(R.id.edtAnoRealm);

        Button adicionar = (Button)findViewById(R.id.btnAdicioRealm);
        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Livro livro = new Livro();
                int proximoId = 1;
                if(realm.where(Livro.class).max("id") != null);
                proximoId = realm.where(Livro.class).max("id").intValue() + 1;
                livro.setId(proximoId);
                livro.setNome(nome.getText().toString());
                livro.setAutor(autor.getText().toString());
                livro.setAno(Integer.parseInt(ano.getText().toString()));

                realm.beginTransaction();
                realm.copyToRealm(livro);
                realm.commitTransaction();
                realm.close();

                Toast.makeText(getBaseContext(), "registros inseridos", Toast.LENGTH_LONG).show();
            }
        });

    }
}
