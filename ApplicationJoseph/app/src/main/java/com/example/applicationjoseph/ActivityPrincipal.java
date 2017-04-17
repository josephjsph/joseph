package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    //chamar tela de editar texto
    public void OnClcEdtText (View view)
    {
        Intent intencaoTelaEditText = new Intent(getApplication(),TelaEditText.class);
        startActivity(intencaoTelaEditText);
    }
    //chamar tela data
    public void OnClcTelaData (View view)
    {
        Intent intencaoTelaData = new Intent(getApplication(),TelaData.class);
        startActivity(intencaoTelaData);
    }
}
