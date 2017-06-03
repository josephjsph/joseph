package com.example.applicationjoseph;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaSharedPreferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_shared_preferences);

        final EditText nome = (EditText) findViewById(R.id.edtNomeShared);
        final EditText email = (EditText) findViewById(R.id.edtEmailShared);
        Button gravar = (Button) findViewById(R.id.btnGravarShared);
        gravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SharedPreferences prefs = getSharedPreferences("preferencisa", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed = prefs.edit();
                ed.putString("nome",nome.getText().toString());
                ed.putString("email",email.getText().toString());
                ed.apply();
                Toast.makeText(getBaseContext(), "Gravado com sussesso !!!!", Toast.LENGTH_SHORT).show();

            }
        });

        Button limpar = (Button)findViewById(R.id.btnLimparshared);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                nome.setText("");
                email.setText("");

            }
        });

        Button recuperar = (Button) findViewById(R.id.btnRecuperarShared);
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SharedPreferences prefs = getSharedPreferences("preferencisa", Context.MODE_PRIVATE);
                nome.setText(prefs.getString("nome","Não tem"));
                email.setText(prefs.getString("email","Não tem")    );


            }
        });



    }
}
