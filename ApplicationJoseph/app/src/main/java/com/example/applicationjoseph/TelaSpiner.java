package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class TelaSpiner extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_spiner);

        final Spinner estadoCivil = (Spinner) findViewById(R.id.spinnerEstado);

        ArrayAdapter Adapter =
                ArrayAdapter.createFromResource(this, R.array.Estado_Civil, android.R.layout.simple_spinner_dropdown_item);
                estadoCivil.setAdapter(Adapter);

        //selecionando ao clicar no item

        AdapterView.OnItemSelectedListener escolha = new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = estadoCivil.getSelectedItem().toString();
                Toast.makeText(getBaseContext(), "O item escolhido foi "+ item ,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        estadoCivil.setOnItemSelectedListener(escolha);

        //selecionando o spinner com o botao
//        Button ok = (Button) findViewById(R.id.btnSpiner);
//        ok.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                String item = estadoCivil.getSelectedItem().toString();
//                int posicao = estadoCivil.getSelectedItemPosition();
//                Toast.makeText(getBaseContext(), "O item escolhido foi "+ item +
//                        ", que está na posição:" + posicao,
//                        Toast.LENGTH_SHORT).show();
//
//            }
//        });

    }



    //voltar para a tela principal
    public void OnClcVoltarSpiner (View view)
    {
        Intent intencaoVoltarSpiner = new Intent(getApplication(), ActivityPrincipal.class);
        startActivity(intencaoVoltarSpiner);
    }

}