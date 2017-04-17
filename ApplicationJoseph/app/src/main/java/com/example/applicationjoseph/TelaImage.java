package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_image);

        final ImageView Imagem1 = (ImageView) findViewById(R.id.imageJoseph2);
        Button botaoImage = (Button) findViewById(R.id.btnTrocarImage);

        botaoImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Imagem1.setImageResource(R.drawable.joseph);
            }
        });

    }

    //Voltar para a tela principal
    public void OnClcVoltarTelaImage (View view)
    {
        Intent intencaoVoltarTrlaImage = new Intent(getApplication(), ActivityPrincipal.class);
        startActivity(intencaoVoltarTrlaImage);
    }
}
