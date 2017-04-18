package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class TelaRadioButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_radio_button);

        final RadioButton mas = (RadioButton) findViewById(R.id.radioButtonMas);
        final RadioButton fem = (RadioButton) findViewById(R.id.radioButtonFem);
        Button ok = (Button) findViewById(R.id.btnRadioButton);

        ok.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String sexo = "";
                if(mas.isChecked())
                    sexo = "masculino";
                if(fem.isChecked())
                    sexo = "feminino";

                Toast.makeText(getApplicationContext(), "sexo " + sexo, Toast.LENGTH_LONG).show();

            }
        });

    }

    //voltar para a tela principal
    public void OnClcVoltarTelaRadioButton (View view)
    {
        Intent intencaoVoltarTelaRadioButton = new Intent(getApplication(), ActivityPrincipal.class);
        startActivity(intencaoVoltarTelaRadioButton);
    }
}
