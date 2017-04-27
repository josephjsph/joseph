package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaIntentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_intents);

        //Passando parametros com bundle
        final EditText parametro = (EditText) findViewById(R.id.editTextParametro);
        Button enviarParametro = (Button) findViewById(R.id.BtnEnviarParametro);
        enviarParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntencaoParametro = new Intent(TelaIntentsActivity.this, TelaRecebeEnviaParametro.class);

                Bundle dados = new Bundle();
                dados.putString("NomeDoParametro", parametro.getText().toString());
                dados.putInt("idade", 20);

                IntencaoParametro.putExtras(dados);
                startActivity(IntencaoParametro);
            }
        });


        //forma simples de passar parametros

//        final EditText parametro = (EditText) findViewById(R.id.editTextParametro);
//        Button enviarParametro = (Button) findViewById(R.id.BtnEnviarParametro);
//        enviarParametro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                Intent IntencaoParametro = new Intent(TelaIntentsActivity.this, TelaRecebeEnviaParametro.class);
//                IntencaoParametro.putExtra("NomeDoParametro", parametro.getText().toString());
//                startActivity(IntencaoParametro);
//            }
//        });

    }
}
