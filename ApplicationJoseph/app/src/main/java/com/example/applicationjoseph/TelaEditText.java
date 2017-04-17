package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaEditText extends AppCompatActivity implements View.OnClickListener {

    private Button enviarAlert;
    private EditText texto;
    private Button botaoToast;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_edit_text);


        // outra forma de fazer o metodo do botão
//        enviarAlert = (Button) findViewById(R.id.btnEnviarTexto);
//        texto = (EditText) findViewById(R.id.editTextNome);
//
//        enviarAlert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                AlertDialog.Builder dlg = new AlertDialog.Builder(TelaEditText.this);
//                dlg.setMessage(texto.getText().toString());
//                dlg.setNeutralButton("Clique em OK", null);
//                dlg.show();
//            }
//        });

        enviarAlert = (Button) findViewById(R.id.btnEnviarTexto);
        texto = (EditText) findViewById(R.id.editTextNome);
        botaoToast = (Button) findViewById(R.id.btnToast);

        enviarAlert.setOnClickListener(this);

        //programando Toast
        botaoToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),texto.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
    //programando o alert so botão enviarAlert
    @Override
    public void onClick(View v)
    {

        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaEditText.this);
        dlg.setMessage(texto.getText().toString());
        dlg.setNeutralButton("Clique em OK", null);
        dlg.show();

    }
    //Programando envio com toast



    //voltar para a tela principal
    public void ONClcVoltarEdtText (View view)
    {
        Intent intencaoVoltarEdtText = new Intent(getApplication(),ActivityPrincipal.class);
        startActivity(intencaoVoltarEdtText);
    }


}
