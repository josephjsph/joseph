package com.example.applicationjoseph;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;



public class TelaCheckBox extends AppCompatActivity implements View.OnClickListener
{
    private CheckBox sms;
    private CheckBox email;
    private CheckBox fone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_check_box);

        sms = (CheckBox) findViewById(R.id.checkBoxSms);
        email = (CheckBox) findViewById(R.id.checkBoxEmail);
        fone = (CheckBox) findViewById(R.id.checkBoxFone);

        Button Check = (Button) findViewById(R.id.bntCheckBox);
        Check.setOnClickListener(this);

    }

    //voltar para a tela principal
    public void OnClcVoltarTelaCheck (View view)
    {
        Intent intencaoVoltarTelaCheck = new Intent(getApplication(), ActivityPrincipal.class);
        startActivity(intencaoVoltarTelaCheck);
    }
    // metodo para check box
    @Override
    public void onClick(View v)
    {
        String mensagem = "Os itens selecionados foram:  ";
        if(sms.isChecked())
            mensagem += "sms  ";
        if (email.isChecked())
            mensagem += "email  ";
        if (fone.isChecked())
            mensagem += "Telefone  ";

        AlertDialog.Builder dlg =new  AlertDialog.Builder(TelaCheckBox.this);
        dlg.setMessage(mensagem);
        dlg.setNeutralButton("OK", null);
        dlg.show();
    }
}
