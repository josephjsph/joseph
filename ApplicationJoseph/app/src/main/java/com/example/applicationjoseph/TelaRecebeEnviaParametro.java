package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TelaRecebeEnviaParametro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_recebe_envia_parametro);

        //RECEBENDO parametro com bundle
//        Intent ReceberParametro = getIntent();
//        Bundle dados = ReceberParametro.getExtras();
//
//        String Nome =dados.getString("NomeDoParametro");
//        int idade = dados.getInt("idade");
//
//        Log.d("TelaReceberEnviarParametro", "Idade: " + idade);
//
//        TextView textoparametro = (TextView) findViewById(R.id.textRecepcao);
//        textoparametro.setText("Olá " + Nome + idade +  " Seja bem vindo");


        //parametros de forma simples

//        Intent ReceberParametro = getIntent();
//        String Nome = (String) ReceberParametro.getSerializableExtra("NomeDoParametro");
//
//
//        TextView textoparametro = (TextView) findViewById(R.id.textRecepcao);
//        textoparametro.setText("Olá " + Nome + " Seja bem vindo");

    }

    @Override public void finish()
    {
        Intent dados = new Intent();
        dados.putExtra("retorno", "Estamos retornando da activitySegunda");
        setResult(RESULT_OK, dados);
        super.finish();
    }
}
