package com.example.applicationjoseph;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaTextView extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_text_view);

        final TextView txt1 = (TextView) findViewById(R.id.textView5);
        final TextView txt2 = (TextView) findViewById(R.id.textView6);
        final TextView txt3 = (TextView) findViewById(R.id.textView7);

        Button botaoCor = (Button) findViewById(R.id.btnMudarCor);
        botaoCor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txt1.setTextColor(Color.YELLOW);
                txt2.setTextColor(Color.RED);
                txt3.setTextColor(Color.BLUE);
            }
        });

    }


    //voltar para tela principal
    public void OnClcVoltarTextView (View view)
    {
        Intent intencaoVoltarTextView = new Intent(getApplication(), ActivityPrincipal.class);
        startActivity(intencaoVoltarTextView);
    }
}
