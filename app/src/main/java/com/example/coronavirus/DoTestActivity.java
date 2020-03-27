package com.example.coronavirus;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DoTestActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox mfebre, mtosse, mdor_cabeca, mcansaco, mgarganta, mcoriza, mrespirar, mdor_corpo;
    RadioButton mcontatoyes, mregiaoyes, mcontatono, mregiaono;
    Button mconfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_test);

        mfebre = findViewById(R.id.checkbox_febre);
        mtosse = findViewById(R.id.checkbox_tosse);
        mdor_cabeca = findViewById(R.id.checkbox_dor_cabeca);
        mcansaco = findViewById(R.id.checkbox_cansaco);
        mgarganta = findViewById(R.id.checkbox_dor_garganta);
        mcoriza = findViewById(R.id.checkbox_coriza);
        mrespirar = findViewById(R.id.checkbox_dif_respirar);
        mdor_corpo = findViewById(R.id.checkbox_dor_corpo);
        mcontatoyes = findViewById(R.id.radio_contato_yes);
        mcontatono = findViewById(R.id.radio_contato_no);
        mregiaoyes = findViewById(R.id.radio_regiao_yes);
        mregiaono = findViewById(R.id.radio_regiao_no);

        mconfirm = findViewById(R.id.button_do_test_confirm);

        mconfirm.setOnClickListener(this);


    }

    public void onClick(View v) {

        int resultado = 0;

        if (mfebre.isChecked()) {
            resultado += 2;
        }
        if (mtosse.isChecked()) {
            resultado++;
        }
        if (mdor_cabeca.isChecked()) {
            resultado++;
        }
        if (mcansaco.isChecked()) {
            resultado++;
        }
        if (mgarganta.isChecked()) {
            resultado++;
        }
        if (mcoriza.isChecked()) {
            resultado++;
        }
        if (mrespirar.isChecked()) {
            resultado += 2;
        }
        if (mdor_corpo.isChecked()) {
            resultado++;
        }

        if (v.getId() == R.id.button_do_test_confirm) {
            if (resultado > 0) {
                if ((mcontatoyes.isChecked() || mcontatono.isChecked()) && (mregiaoyes.isChecked() || mregiaono.isChecked())) {

                    if ((mcontatoyes.isChecked() || mregiaoyes.isChecked()) && resultado >= 2) {
                        Intent intent = new Intent(DoTestActivity.this, PositiveActivity.class);
                        startActivity(intent);

                    } else {
                        showDialog();

                    }
                } else {
                    Toast.makeText(DoTestActivity.this, "Marque alguma", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(DoTestActivity.this, "Marque alguma aaaa", Toast.LENGTH_LONG).show();
            }
        }


    }

    public void changeButtonColor(View view) {
        if ((mcontatoyes.isChecked() || mcontatono.isChecked()) && (mregiaoyes.isChecked() || mregiaono.isChecked())) {
            mconfirm.setBackgroundResource(R.drawable.button_do_test_confirm_background_active);
        }
    }

    public void showDialog() {
        Dialog dialog = new Dialog(DoTestActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.setContentView(R.layout.dialog_negative);

        dialog.show();
    }


    public void fechar(View view) {
        Intent intent = new Intent(DoTestActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

