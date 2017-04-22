package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class TelaSeekBar extends AppCompatActivity {

    TextView vol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_seek_bar);

        vol = (TextView) findViewById(R.id.txtVolume);
        SeekBar Volume = (SeekBar) findViewById(R.id.seekBarVolume);

        Volume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                vol.setText("Volume" +progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    //voltar tela principal
    public void OnClcVoltarTelaSeekBar (View view)
    {
        Intent intentVoltarSeekBar = new Intent(getApplication(), ActivityPrincipal.class);
        startActivity(intentVoltarSeekBar);
    }

}
