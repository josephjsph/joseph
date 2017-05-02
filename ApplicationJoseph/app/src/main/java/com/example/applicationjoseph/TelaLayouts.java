package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaLayouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_layouts);
    }
    //chamar tela layouts
    public void OnClcTelaTableLayout (View view)
    {
        Intent intencaoTelaTableLayouts = new Intent(getApplication(), TelaTableLayout.class);
        startActivity(intencaoTelaTableLayouts);

    }
}
