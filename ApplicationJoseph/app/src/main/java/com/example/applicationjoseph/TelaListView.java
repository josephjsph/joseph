package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TelaListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_list_view);

        ListView lista = (ListView) findViewById(R.id.lvEquipes);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Equipes, android.R.layout.simple_list_item_1);
        lista.setAdapter(adapter);

    }

    public void OnClcTelaIstViewCustomizado (View view)
    {
        Intent intencaoTelaIstViewCustomizado = new Intent(getApplication(), TelaListViewCustomizado.class);
        startActivity(intencaoTelaIstViewCustomizado);

    }
}
