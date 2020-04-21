package com.example.coronavirus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button doTest;
    LinearLayout about, video, transmicao, protecao, audio, sintoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doTest = findViewById(R.id.button_do_test);
        about = findViewById(R.id.layout_o_que_sao);
        video = findViewById(R.id.layout_video);
        transmicao = findViewById(R.id.layout_como_transmite);
        protecao = findViewById(R.id.layout_como_se_proteger);
        audio = findViewById(R.id.layout_audio);
        sintoma = findViewById(R.id.layout_quais_sintomas);

        doTest.setOnClickListener(this);
        about.setOnClickListener(this);
        video.setOnClickListener(this);
        transmicao.setOnClickListener(this);
        protecao.setOnClickListener(this);
        audio.setOnClickListener(this);
        sintoma.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_do_test) {
            Intent intent = new Intent(MainActivity.this, DoTestActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_o_que_sao) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_video) {
            Intent intent = new Intent(MainActivity.this, VideoActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_como_transmite) {
            Intent intent = new Intent(MainActivity.this, TransmitionActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_como_se_proteger) {
            Intent intent = new Intent(MainActivity.this, HowProtectActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_audio) {
            Intent intent = new Intent(MainActivity.this, AudioActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_quais_sintomas) {
            Intent intent = new Intent(MainActivity.this, SymptomActivity.class);
            startActivity(intent);
        }
    }


}

