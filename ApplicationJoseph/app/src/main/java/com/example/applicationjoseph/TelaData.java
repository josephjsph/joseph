package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_data);
    }
    //voltar tela principal
    public void OnClcVoltarTelaData (View view)
    {
        Intent intencaoVoltarTelaData = new Intent(getApplication(),ActivityPrincipal.class);
        startActivity(intencaoVoltarTelaData);
    }
}
