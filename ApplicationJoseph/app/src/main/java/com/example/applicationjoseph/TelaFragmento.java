package com.example.applicationjoseph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFragmento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fragmento);
        if(savedInstanceState == null)
        {
            // adicionar o fragmento inicial
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.Frame_Container, new PrimeiroFragment())
                    .commit();
        }
        Button f1 = (Button) findViewById(R.id.btnFrag1);
        Button f2 = (Button) findViewById(R.id.btnFrag2);
        f1.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        { getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.Frame_Container, new PrimeiroFragment()).commit();
        }
        });
        f2.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        { getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.Frame_Container, new SegundoFragment()).commit(); } });

    }
}
