package com.example.applicationjoseph;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaIntentsBrowser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_intents_browser);

        final EditText url = (EditText) findViewById(R.id.editTextBrowser);
        Button AbrirUrl = (Button) findViewById(R.id.btnAbrirNvagador);

        AbrirUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Uri uri = Uri.parse(url.getText().toString());
                Intent AbrirNavagador = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(AbrirNavagador);
            }
        });

    }

    //voltar tela principal
    public void OnClcVoltarTelaIntentsBrowser (View view)
    {
        Intent intencaoVoltarTelaIntentsBrowser = new Intent(getApplication(), ActivityPrincipal.class);
        startActivity(intencaoVoltarTelaIntentsBrowser);
    }


}
