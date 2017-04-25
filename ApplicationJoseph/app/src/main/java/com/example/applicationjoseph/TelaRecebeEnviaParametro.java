package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaRecebeEnviaParametro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_recebe_envia_parametro);

        Intent ReceberParametro = getIntent();
        String Nome = (String) ReceberParametro.getSerializableExtra("NomeDoParametro");


        TextView textoparametro = (TextView) findViewById(R.id.textRecepcao);
        textoparametro.setText("Olá " + Nome + " Seja bem vindo");

    }
}
