package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEditText extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_edit_text);



    }

    //voltar para a tela principal
    public void ONClcVoltarEdtText (View view)
    {
        Intent intencaoVoltarEdtText = new Intent(getApplication(),ActivityPrincipal.class);
        startActivity(intencaoVoltarEdtText);
    }
}
