package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaIntentsActivity extends AppCompatActivity {

     final int REQUEST_CODE_SEGUNDA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_intents);


        // Enviando parametro com retorno
        final  EditText nome = (EditText) findViewById(R.id.editTextParametro);
        Button ok = (Button) findViewById(R.id.BtnEnviarParametro);
        ok.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                Intent intent = new Intent(TelaIntentsActivity.this, TelaRecebeEnviaParametro.class);
                intent.putExtra("nome", nome.getText().toString());
                startActivityForResult(intent, REQUEST_CODE_SEGUNDA); } });


        //Passando parametros com bundle

//        final EditText parametro = (EditText) findViewById(R.id.editTextParametro);
//        Button enviarParametro = (Button) findViewById(R.id.BtnEnviarParametro);
//        enviarParametro.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v) {
//                Intent IntencaoParametro = new Intent(TelaIntentsActivity.this, TelaRecebeEnviaParametro.class);
//
//                Bundle dados = new Bundle();
//                dados.putString("NomeDoParametro", parametro.getText().toString());
//                dados.putInt("idade", 20);
//
//                IntencaoParametro.putExtras(dados);
//                startActivity(IntencaoParametro);
//            }
//        });


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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE_SEGUNDA) {
            if (data.hasExtra("retorno")) {
                Toast.makeText(this, "O parâmetro enviado foi: " + data.getExtras().getString("retorno"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}