package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaEditText extends AppCompatActivity
{

    private Button enviarAlert;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_edit_text);

        enviarAlert = (Button) findViewById(R.id.btnEnviarTexto);
        texto = (EditText) findViewById(R.id.editText1);

        enviarAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                AlertDialog.Builder dlg = new AlertDialog.Builder(TelaEditText.this);
                dlg.setMessage(texto.getText().toString());
                dlg.setNeutralButton("Clique em OK", null);
                dlg.show();
            }
        });


    }

    //voltar para a tela principal
    public void ONClcVoltarEdtText (View view)
    {
        Intent intencaoVoltarEdtText = new Intent(getApplication(),ActivityPrincipal.class);
        startActivity(intencaoVoltarEdtText);
    }
}
