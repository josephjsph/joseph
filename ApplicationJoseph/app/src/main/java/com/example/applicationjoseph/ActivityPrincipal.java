package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityPrincipal extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    //chamar tela radio button
    public void OnClcTelaRadioButton (View view)
    {
        Intent intencaoTelaRadioButton = new Intent(getApplication(), TelaRadioButton.class);
        startActivity(intencaoTelaRadioButton);
    }

    //chamar tela text checkBox
    public void OnClcTelaCheckBox (View view)
    {
        Intent intencaoTelaCheckBox = new Intent(getApplication(), TelaCheckBox.class);
        startActivity(intencaoTelaCheckBox);
    }

    //chamar tela text image
    public void OnClcTelaImage (View view)
    {
        Intent intencaoTelaImage = new Intent(getApplication(), TelaImage.class);
        startActivity(intencaoTelaImage);
    }

    //chamar tela text view
    public void OnClcTelaEditText (View view)
    {
        Intent intencaoTelaTextView = new Intent(getApplication(), TelaTextView.class);
        startActivity(intencaoTelaTextView);
    }


    //chamar tela de editar texto
    public void OnClcEdtText (View view)
    {
        Intent intencaoTelaEditText = new Intent(getApplication(),TelaEditText.class);
        startActivity(intencaoTelaEditText);
    }
    //chamar tela data
    public void OnClcTelaData (View view)
    {
        Intent intencaoTelaData = new Intent(getApplication(),TelaData.class);
        startActivity(intencaoTelaData);
    }
}
