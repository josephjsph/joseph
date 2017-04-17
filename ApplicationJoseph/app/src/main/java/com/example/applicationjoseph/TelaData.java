package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaData extends AppCompatActivity implements View.OnClickListener {
    private Button Calcular;
    private EditText EditData;
    private String faixa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_data);

        Calcular  = (Button) findViewById(R.id.btnCalcIdade);
        EditData = (EditText) findViewById(R.id.editTextData);
        Calcular.setOnClickListener(this);

    }
    //voltar tela principal
    public void OnClcVoltarTelaData (View view)
    {
        Intent intencaoVoltarTelaData = new Intent(getApplication(),ActivityPrincipal.class);
        startActivity(intencaoVoltarTelaData);
    }

    @Override
    public void onClick(View v)
    {
        int idade = 2017 - Integer.parseInt(EditData.getText().toString());
        if (idade < 12)
            faixa = "Criança";
        else if (idade < 18)
            faixa = "Adolescente";
        else
            faixa ="Adulto";

        //mensagem no alert
        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaData.this);
        dlg.setMessage("Você é um(a)  " + faixa);
        dlg.setNeutralButton("Clique em OK", null);
        dlg.show();
    }
}
